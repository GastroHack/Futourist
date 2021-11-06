import React, { Component } from "react";
import isEmpty from "lodash.isempty";

// components:
import Marker from "../components/Marker";

// examples:
import GoogleMap from "../components/GoogleMap";

// consts
import LOS_ANGELES_CENTER from "../const/la_center";

// Return map bounds based on list of places
const getMapBounds = (map, maps, places) => {
  const bounds = new maps.LatLngBounds();

  places.forEach(place => {
    bounds.extend(
      new maps.LatLng(place.geometry.location.lat, place.geometry.location.lng)
    );
  });
  return bounds;
};

// Re-center map when resizing the window
const bindResizeListener = (map, maps, bounds) => {
  maps.event.addDomListenerOnce(map, "idle", () => {
    maps.event.addDomListener(window, "resize", () => {
      map.fitBounds(bounds);
    });
  });
};

// Fit map to its bounds after the api is loaded
const apiIsLoaded = (map, maps, places) => {
  // Get bounds by our places
  const bounds = getMapBounds(map, maps, places);
  // Fit map to bounds
  map.fitBounds(bounds);
  // Bind the resize listener
  bindResizeListener(map, maps, bounds);

  const origin = { lat: 47.78861, lng: 13.06024 };
  const destination = { lat: 47.79028, lng: 13.04764 };

  const directionsService = new maps.DirectionsService();
  const directionsDisplay = new maps.DirectionsRenderer();
  directionsService.route(
    {
      origin,
      destination,
      travelMode: "DRIVING",
    },

    (response, status) => {
      if (status === "OK") {
        console.log(`buddies ~ apiIsLoaded ~ status`, status);
        directionsDisplay.setDirections(response);
        console.log(response.routes[0].overview_path, "Ruta");
        const routePolyline = new maps.Polyline({
          path: response.routes[0].overview_path,
        });
        routePolyline.setMap(map);
      } else {
        window.alert("Directions request failed due to " + status);
      }
    }
  );
};

class Map extends Component {
  constructor(props) {
    super(props);

    this.state = {
      places: [],
    };
  }

  componentDidMount() {
    fetch("places.json")
      .then(response => response.json())
      .then(data => this.setState({ places: data.results }));
  }

  render() {
    const { places } = this.state;
    return (
      <>
        {!isEmpty(places) && (
          <GoogleMap
            defaultZoom={10}
            defaultCenter={LOS_ANGELES_CENTER}
            yesIWantToUseGoogleMapApiInternals
            onGoogleApiLoaded={({ map, maps }) =>
              apiIsLoaded(map, maps, places)
            }
          >
            {places.map(place => {
              return (
                <Marker
                  key={place.id}
                  text={place.name}
                  lat={place.geometry.location.lat}
                  lng={place.geometry.location.lng}
                />
              );
            })}
          </GoogleMap>
        )}
      </>
    );
  }
}

export default Map;
