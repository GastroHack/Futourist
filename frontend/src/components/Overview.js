import React, { useEffect, useState } from "react";
import SpotSidebar from "./SpotSidebar/SpotSidebar";
import Map from "./Map/Map";

const Overview = () => {
  const [spots, setSpots] = useState([]);

  const updateSpots = (index, newCurrentSpotIndex) => {
    const updatedCurrentSpots = [...spots];
    const currentItems = [...updatedCurrentSpots[index]];
    const removedItem = currentItems.splice(newCurrentSpotIndex, 1);

    updatedCurrentSpots[index] = [...removedItem, ...currentItems];

    setSpots(updatedCurrentSpots);
  };

  useEffect(() => {
    fetch("https://api.futourist.live/scenario1")
      .then((response) => response.json())
      .then((data) => {
        const tempSpots = [];

        data.forEach((items) => {
          tempSpots.push(items);
        });

        setSpots(tempSpots);
      });
  }, []);

  return (
    <div>
      <SpotSidebar spots={spots} updateSpots={updateSpots} />
      <Map locationEntries={spots} />
    </div>
  );
};

export default Overview;
