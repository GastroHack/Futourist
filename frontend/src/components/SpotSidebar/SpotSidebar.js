import React, { useState } from "react";

import "./SpotSidebar.css";

const SpotSidebar = ({ spots }) => {
  const [expanded, setExpanded] = useState(false);
  const [activeSpotIndex, setActiveSpotIndex] = useState(0);

  const toggleExpanded = () => {
    setExpanded(!expanded);
  };

  const setActiveIndex = (index, suggestionIndex) => () => {
    setActiveSpotIndex(index);
    if (suggestionIndex !== undefined) {
      toggleExpanded();
    }
  };

  const renderSuggestionItem = (imageSrc, index, suggestionIndex) => {
    return (
      <button
        className={`suggestion-${suggestionIndex} ${
          expanded ? "expanded" : ""
        } mx-auto flex items-center`}
        onClick={setActiveIndex(index, suggestionIndex)}
      >
        <img className="object-cover w-full h-full" src={imageSrc} />
      </button>
    );
  };

  const renderSpotItem = (imageSrc, index) => {
    return (
      <button
        className={`spotImageWrapper ${
          expanded ? "expanded" : ""
        } mx-auto flex items-center`}
        onClick={setActiveIndex(index)}
      >
        <img className="object-cover w-full h-full" src={imageSrc} />
      </button>
    );
  };

  return (
    <div
      className={`fixed sidebar ${
        expanded ? "sidebarExpanded" : ""
      } h-screen bg-white rounded p-3 shadow-lg`}
    >
      <button
        onClick={toggleExpanded}
        className="arrowButton absolute left-full w-5 h-10 rounded text-gray-500 bg-gray-200 text-center"
      >
        {expanded ? "<" : ">"}
      </button>

      <div
        className={`title ${
          expanded ? "titleExpanded" : ""
        } text-center p-2 mb-5`}
      >
        Tour spots
      </div>
      <ul className="space-y-6 text-sm">
        {spots.map((spot, index) => {
          const { suggestions, image } = spot;
          return (
            <li className="spot flex items-center">
              {expanded &&
                activeSpotIndex === index &&
                renderSuggestionItem(suggestions[0].image, index, 0)}
              {renderSpotItem(image, index)}
              {expanded &&
                activeSpotIndex === index &&
                renderSuggestionItem(suggestions[1].image, index, 1)}
            </li>
          );
        })}
      </ul>
    </div>
  );
};

export default SpotSidebar;
