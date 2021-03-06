import React, { useState } from "react";
import Logo from "../../Logo";

import "./SpotSidebar.css";

const DEFAULT_IMG_URL =
  "https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.alittlestyle.de%2Fwp-content%2Fuploads%2Fportfolio%2Fvingster_honig_glas_1200.jpg&f=1&nofb=1";

const SpotSidebar = ({ spots = [], updateSpots }) => {
  const [expanded, setExpanded] = useState(false);
  const [activeSpotIndex, setActiveSpotIndex] = useState(0);

  const toggleExpanded = () => {
    setExpanded(!expanded);
  };

  const setActiveIndex = (index, suggestionIndex) => () => {
    if (!expanded) {
      toggleExpanded();
      setActiveSpotIndex(index);
    }

    setActiveSpotIndex(index);
    if (suggestionIndex !== undefined) {
      updateSpots(index, suggestionIndex);
    }
  };

  const renderSuggestionItem = ({ imgUrl, name }, index, suggestionIndex) => {
    let imageSrc = imgUrl || DEFAULT_IMG_URL;

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

  const renderSpotItem = ({ imgUrl, name }, index) => {
    let imageSrc = imgUrl || DEFAULT_IMG_URL;

    return (
      <button
        className={`spotImageWrapper ${
          expanded ? "expanded" : "notExpanded"
        } mx-auto flex items-center`}
        onClick={setActiveIndex(index)}
      >
        <img className="object-cover w-full h-full" src={imageSrc} />
        {expanded && <div className="spotName">{name}</div>}
      </button>
    );
  };

  if (spots.length === 0) {
    return null;
  }

  const arrowButton = (
    <button
      onClick={toggleExpanded}
      className="arrowButton absolute left-full w-5 h-10 rounded-r text-gray-500 bg-gray-200 text-center"
    >
      {expanded ? "<" : ">"}
    </button>
  );

  return (
    <div
      className={`fixed sidebar ${
        expanded ? "sidebarExpanded" : ""
      } h-screen bg-white rounded p-3 shadow-lg`}
    >
      {arrowButton}
      <div
        className={`title ${expanded ? "titleExpanded" : ""} text-center mb-5`}
      >
        STOPS
      </div>
      <ul className="space-y-6 text-sm">
        {spots.map(([mainSpot, suggestion1, suggestion2], index) => {
          return (
            <li
              className="spot flex items-center"
              key={`${mainSpot.id}${index}`}
            >
              {expanded &&
                activeSpotIndex === index &&
                renderSuggestionItem(suggestion1, index, 1)}
              {renderSpotItem(mainSpot, index)}
              {expanded &&
                activeSpotIndex === index &&
                renderSuggestionItem(suggestion2, index, 2)}
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
