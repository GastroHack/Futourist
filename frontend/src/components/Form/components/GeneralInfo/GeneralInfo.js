import React, { useState } from "react";
import { Link } from "react-router-dom";
import "./GeneralInfo.css";
import Logo from "../../../../Logo";

const GeneralInfo = () => {
  const meansOfTransport = ["walk", "bike", "train", "car"];
  const [location] = useState("Zell am See-Kaprun");

  const [activeIcon, setActiveIcon] = useState("");

  const [range, setRange] = useState(1);

  return (
    <div>
      <div className="mb-10">
        <label htmlFor="location">Location/City</label>
        <input
          id="location"
          type="text"
          defaultValue={location}
          className="block w-full px-4 py-2 mt-2 text-gray-700 bg-white border border-gray-300 rounded-md dark:bg-gray-800 dark:text-gray-300 dark:border-gray-600 focus:border-blue-500 dark:focus:border-blue-500 focus:outline-none focus:ring"
        />
      </div>

      <div className="mb-10">
        <label htmlFor="range">{`Radius: ${range} km`}</label>
        <input
          type="range"
          id="range"
          min="0"
          max="100"
          step="1"
          value={range}
          className="block w-full mt-2 range"
          onChange={e => setRange(e.target.value)}
        />
      </div>

      <div>
        <label>Transportation</label>
        <div className="buttons">
          {meansOfTransport.map((element, i) => (
            <div
              key={element}
              id={element}
              className={`button ${element} ${
                activeIcon === element && "border-2"
              }`}
              onClick={e => setActiveIcon(element)}
            />
          ))}
        </div>
      </div>
      <div className="buttonWrapper">
        <button className="next">
          <Link to="/typeOfTravel">NEXT</Link>
        </button>
      </div>
      <div className="logo">
        <Logo />
      </div>
    </div>
  );
};

export default GeneralInfo;
