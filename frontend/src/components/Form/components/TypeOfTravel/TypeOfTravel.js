import React, { useState } from "react";

import { Link } from "react-router-dom";
import "./TypeOfTravel.css";
import Logo from "../../../../Logo";

const TypeOfTravel = () => {
  const types = ["diamond", "piggy", "family", "compass"];
  const [activeIcon, setActiveIcon] = useState("");

  return (
    <div className="typeWrapper">
      <div className="mb-10">
        <label htmlFor="location">Type of Travel</label>
      </div>

      <div>
        <div className="typeButtons">
          {types.map(element => (
            <div
              key={element}
              id={element}
              className={`typeButton ${element} ${
                activeIcon === element ? "border-4" : "border"
              }`}
              onClick={e => setActiveIcon(element)}
            />
          ))}
        </div>
      </div>
      <div className="buttonWrapper">
        <button className="goToBack">
          <Link to="/form">Go back</Link>
        </button>
        <button className="next">
          <Link to="/activities">NEXT</Link>
        </button>
      </div>
      <div className="logo">
        <Logo />
      </div>
    </div>
  );
};

export default TypeOfTravel;
