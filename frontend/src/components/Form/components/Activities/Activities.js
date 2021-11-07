import React from "react";
import { Link } from "react-router-dom";
import "./Activities.css";

const Activities = () => {
  //   return <div>Placeholder for Activities</div>;
  const activities = ["museum", "camera", "mountain", "mask"];
  return (
    <div className="typeWrapper">
      <div className="mb-10">
        <label htmlFor="location">Activities</label>
      </div>

      <div>
        <div className="typeButtons">
          {activities.map((element) => (
            <div>
              <button className={`typeButton ${element}`}>
                <input
                  type="radio"
                  id={`${element}`}
                  name="transportation"
                  value={`${element}`}
                  className="radio"
                />
              </button>
            </div>
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

export default Activities;
