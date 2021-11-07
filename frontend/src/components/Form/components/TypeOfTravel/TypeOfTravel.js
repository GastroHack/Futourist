import React, { useState } from "react";

import { Link } from "react-router-dom";
import "./TypeOfTravel.css";

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
        <button className="next">
          <Link to="/activities">NEXT</Link>
        </button>
      </div>
    </div>
  );
};

export default TypeOfTravel;
