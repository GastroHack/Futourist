import React from "react";
import { Link } from "react-router-dom";
import "./TypeOfTravel.css";

const TypeOfTravel = () => {
  const types = ["diamond", "piggy", "family", "compass"];
  return (
    <div className="typeWrapper">
      <div className="mb-10">
        <label htmlFor="location">Type of Travel</label>
      </div>

      <div>
        <div className="typeButtons">
          {types.map((element) => (
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

export default TypeOfTravel;
