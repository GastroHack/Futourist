import React, { useState } from "react";
import Logo from "../../Logo";

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
    // if (suggestionIndex !== undefined) {
    //   toggleExpanded();
    // }
  };

  const renderSuggestionItem = ({ imgUrl, name }, index, suggestionIndex) => {
    return (
      <button
        className={`suggestion-${suggestionIndex} ${
          expanded ? "expanded" : ""
        } mx-auto flex items-center`}
        onClick={setActiveIndex(index, suggestionIndex)}
      >
        <img className="object-cover w-full h-full" src={imgUrl} />
        <div className="spotName">{name}</div>
      </button>
    );
  };

  const renderSpotItem = ({ imgUrl, name }, index) => {
    return (
      <button
        className={`spotImageWrapper ${
          expanded ? "expanded" : "notExpanded"
        } mx-auto flex items-center`}
        onClick={setActiveIndex(index)}
      >
        <img className="object-cover w-full h-full" src={imgUrl} />
        {expanded && <div className="spotName">{name}</div>}
      </button>
    );
  };

  if (spots.length === 0) {
    return null;
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
        {spots.map(({ items: [mainSpot, suggestion1, suggestion2] }, index) => {
          return (
            <li className="spot flex items-center">
              {expanded &&
                activeSpotIndex === index &&
                renderSuggestionItem(suggestion1, index, 0)}
              {renderSpotItem(mainSpot, index)}
              {expanded &&
                activeSpotIndex === index &&
                renderSuggestionItem(suggestion2, index, 1)}
            </li>
          );
        })}
      </ul>
      <div className="logo">
        <Logo />
      </div>
    </div>
  );
};

export default SpotSidebar;
