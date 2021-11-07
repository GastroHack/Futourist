import React, { useEffect, useState } from "react";
import SpotSidebar from "./SpotSidebar/SpotSidebar";
import Map from "./Map";

const Overview = () => {
  const [allPlaces, setAllPlaces] = useState([]);
  const [spots, setSpots] = useState([]);

  useEffect(() => {
    fetch("https://api.futourist.live/scenario1")
      .then((response) => response.json())
      .then((data) => {
        const tempAllPlaces = [];
        const tempSpots = [];

        Object.entries(data).forEach(([key, value]) => {
          if (key !== "hotel") {
            tempSpots.push({ items: [...value.slice(0, 3)] });
            tempAllPlaces.push(...value);
          }
        });

        setAllPlaces(tempAllPlaces);
        setSpots(tempSpots);
      });
  }, []);

  return (
    <div>
      <SpotSidebar spots={spots} />
      <Map locationEntries={allPlaces} />
    </div>
  );
};

export default Overview;
