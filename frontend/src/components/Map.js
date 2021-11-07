import React, { useEffect, useState } from "react";

import Marker from "../components/Marker";
import GoogleMap from "../components/GoogleMap";

// Return map bounds based on list of places
const getMapBounds = (maps, places) => {
  const bounds = new maps.LatLngBounds();

  places.forEach(([currentPlace]) => {
    bounds.extend(
      new maps.LatLng(
        currentPlace.geometry.location.lat,
        currentPlace.geometry.location.lng
      )
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
const apiIsLoaded = (map, maps, places, setServices) => {
  // const bounds = getMapBounds(maps, places);
  // map.fitBounds(bounds);
  // bindResizeListener(map, maps, bounds);

  const directionsService = new maps.DirectionsService();
  const directionsDisplay = new maps.DirectionsRenderer();

  setServices([directionsService, directionsDisplay]);

  renderRoute(places, [directionsService, directionsDisplay], [map, maps]);
};

const renderRoute = (places, services, mapsRef) => {
  const [directionsService, directionsDisplay] = services;
  const [map, maps] = mapsRef;

  const bounds = getMapBounds(maps, places);
  map.fitBounds(bounds);
  bindResizeListener(map, maps, bounds);

  const originPlace = places[0][0];
  const destinationPlace = places[places.length - 1][0];

  const origin = {
    lat: +originPlace.geometry.location.lat,
    lng: +originPlace.geometry.location.lng,
  };
  const destination = {
    lat: +destinationPlace.geometry.location.lat,
    lng: +destinationPlace.geometry.location.lng,
  };

  const wayPoints = [];
  places.forEach(([currentPlace]) => {
    const {
      geometry: {
        location: { lat, lng },
      },
    } = currentPlace;
    wayPoints.push({
      location: {
        lat: +lat,
        lng: +lng,
      },
      stopover: true,
    });
  });

  directionsService.route(
    {
      origin,
      destination,
      travelMode: "DRIVING",
      waypoints: wayPoints,
      optimizeWaypoints: true,
    },

    (response, status) => {
      if (status === "OK") {
        directionsDisplay.setDirections(response);

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

const DEFAULT_LOCATION = [47.80949, 13.055010000000038];

const Map = ({ locationEntries }) => {
  const [places, setPlaces] = useState([]);
  const [mapsRef, setMapsRef] = useState([]);
  const [services, setServices] = useState([]);

  useEffect(() => {
    setPlaces(locationEntries);

    if (
      locationEntries.length > 0 &&
      mapsRef.length > 0 &&
      services.length > 0
    ) {
      renderRoute(locationEntries, services, mapsRef);
    }
  }, [locationEntries]);

  return (
    <>
      {places.length > 0 && (
        <GoogleMap
          defaultZoom={10}
          defaultCenter={DEFAULT_LOCATION}
          yesIWantToUseGoogleMapApiInternals
          onGoogleApiLoaded={({ map, maps }) => {
            setMapsRef([map, maps]);
            apiIsLoaded(map, maps, places, setServices);
          }}
        >
          {places.map(([currentPlace], index) => {
            return (
              <Marker
                key={`${currentPlace.id}${index}`}
                text={currentPlace.name}
                lat={currentPlace.geometry.location.lat}
                lng={currentPlace.geometry.location.lng}
              />
            );
          })}
        </GoogleMap>
      )}
    </>
  );
};

export default Map;
