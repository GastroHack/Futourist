import React, { useState } from "react";

import { Link } from "react-router-dom";
import "./Activities.css";

const Activities = () => {
  const activities = ["museum", "camera", "mountain", "mask"];
  const [activeIcon, setActiveIcon] = useState("");

  return (
    <div className="typeWrapper">
      <div className="mb-10">
        <label htmlFor="location">Activities</label>
      </div>

      <div>
        <div className="typeButtons">
          {activities.map(element => (
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
          <Link to="/typeOfTravel">Go back</Link>
        </button>
        <button className="next">
          <Link to="/activities">NEXT</Link>
        </button>
      </div>
    </div>
  );
};

export default Activities;
