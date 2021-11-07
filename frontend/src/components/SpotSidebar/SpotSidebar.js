import React, { useState } from "react";

import "./SpotSidebar.css";

const SpotSidebar = ({ spots = [] }) => {
  const [expanded, setExpanded] = useState(false);
  const [activeSpotIndex, setActiveSpotIndex] = useState(0);

  const toggleExpanded = () => {
    setExpanded(!expanded);
  };

  const setActiveIndex = (index, suggestionIndex) => () => {
    if (!expanded) {
      return;
    }

    setActiveSpotIndex(index);
    if (suggestionIndex !== undefined) {
      toggleExpanded();
    }
  };

  const renderSuggestionItem = (imageSrc, name, index, suggestionIndex) => {
    return (
      <button
        className={`suggestion-${suggestionIndex} ${
          expanded ? "expanded" : ""
        } mx-auto flex items-center`}
        onClick={setActiveIndex(index, suggestionIndex)}
      >
        <img className="object-cover w-full h-full" src={imageSrc} />
        <div className="spotName">{name}</div>
      </button>
    );
  };

  const renderSpotItem = (imageSrc, name, index) => {
    return (
      <button
        className={`spotImageWrapper ${
          expanded ? "expanded" : ""
        } mx-auto flex items-center`}
        onClick={setActiveIndex(index)}
      >
        <img className="object-cover w-full h-full" src={imageSrc} />
        {expanded && <div className="spotName">{name}</div>}
      </button>
    );
  };

  if (spots.length === 0) {
    return;
  }

  return (
    <div
      className={`fixed sidebar ${
        expanded ? "sidebarExpanded" : ""
      } h-screen bg-white rounded p-3 shadow-lg`}
    >
      <button
        onClick={toggleExpanded}
        className="arrowButton absolute left-full w-5 h-10 rounded-r text-gray-500 bg-gray-200 text-center"
      >
        {expanded ? "<" : ">"}
      </button>
      <div
        className={`title ${expanded ? "titleExpanded" : ""} text-center mb-5`}
      >
        STOPS
      </div>
      <ul className="space-y-6 text-sm">
        {spots.map((spot, index) => {
          const { suggestions, image, name } = spot;
          return (
            <li className="spot flex items-center">
              {expanded &&
                activeSpotIndex === index &&
                renderSuggestionItem(
                  suggestions[0].image,
                  suggestions[0].name,
                  index,
                  0
                )}
              {renderSpotItem(image, name, index)}
              {expanded &&
                activeSpotIndex === index &&
                renderSuggestionItem(
                  suggestions[1].image,
                  suggestions[1].name,
                  index,
                  1
                )}
            </li>
          );
        })}
      </ul>
    </div>
  );
};

export default SpotSidebar;
