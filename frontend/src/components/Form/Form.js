import React, { useState } from "react";
import Logo from "../../Logo.js";
import "./Form.css";

const transportationData = [
  {
    id: "luxury",
    value: "luxury",
    label: "Luxury",
  },
  {
    id: "family",
    value: "family",
    label: "Family",
  },
  {
    id: "adventurous",
    value: "adventurous",
    label: "Adventurous",
  },
  {
    id: "budget",
    value: "budget",
    label: "On budget",
  },
];

const activitiesData = [
  {
    id: "museum",
    value: "museum",
    label: "Museum",
  },
  {
    id: "photography",
    value: "photography",
    label: "Photography",
  },
  {
    id: "outdoorActivities",
    value: "outdoorActivities",
    label: "Outdoor activities",
  },
  {
    id: "entertainment",
    value: "entertainment",
    label: "Entertainment",
  },
];

const GeneralInfo = () => {
  const [location] = useState("Zell am See-Kaprun");
  const [range, setRange] = useState(1);
  return (
    <div>
      <div className="mb-10">
        <label htmlFor="location">Location/City</label>
        <input
          id="location"
          type="text"
          value={location}
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
          onChange={(e) => setRange(e.target.value)}
        />
      </div>

      <div>
        <label>Transportation</label>
        <div className="buttons">
          <div>
            <button className="button walk">
              <input
                type="radio"
                id="walk"
                name="transportation"
                value="walk"
                className="radio"
              />
            </button>
          </div>
          <div>
            <button className="button bike">
              <input
                type="radio"
                id="bike"
                name="transportation"
                value="bike"
                className="radio"
              />
            </button>
          </div>
          <div>
            <button className="button train">
              <input
                type="radio"
                id="train"
                name="transportation"
                value="train"
                className="radio"
              />
            </button>
          </div>
          <div>
            <button className="button car">
              <input
                type="radio"
                id="car"
                name="transportation"
                value="car"
                className="radio"
              />
            </button>
          </div>
        </div>
      </div>
      {/* <div className="w-full mt-2">
          <input type="radio" id="bike" name="transportation" value="bike" />
          <label className="ml-2" htmlFor="bike">
            Bike
          </label>
        </div>
        <div>
          <input type="radio" id="car" name="transportation" value="car" />
          <label className="ml-2" htmlFor="car">
            Car
          </label>
        </div>
        <div>
          <input
            type="radio"
            id="publicTransportation"
            name="transportation"
            value="publicTransportation"
          />
          <label className="ml-2" htmlFor="publicTransportation">
            Public transportation
          </label>
        </div>
        <div>
          <input
            type="radio"
            id="byWalk"
            name="transportation"
            value="byWalk"
          />
          <label className="ml-2" htmlFor="byWalk">
            By walk
          </label>
        </div> */}
    </div>
  );
};

const Form = () => {
  return (
    <div className="wrapper">
      <form>
        <GeneralInfo />
        {/* <div className="grid grid-cols-1 gap-6 mt-4 sm:grid-cols-2">

        <div>
          <label className="text-gray-700 dark:text-gray-200">
            Mode of transportation
          </label>

          <div className="w-full">
            <input type="radio" id="bike" name="transportation" value="bike" />
            <label className="ml-2" htmlFor="bike">
              Bike
            </label>
          </div>
          <div>
            <input type="radio" id="car" name="transportation" value="car" />
            <label className="ml-2" htmlFor="car">
              Car
            </label>
          </div>
          <div>
            <input
              type="radio"
              id="publicTransportation"
              name="transportation"
              value="publicTransportation"
            />
            <label className="ml-2" htmlFor="publicTransportation">
              Public transportation
            </label>
          </div>
          <div>
            <input
              type="radio"
              id="byWalk"
              name="transportation"
              value="byWalk"
            />
            <label className="ml-2" htmlFor="byWalk">
              By walk
            </label>
          </div>
        </div>
        <div>
          <label className="text-gray-700 dark:text-gray-200">
            Mode of transportation
          </label>

          {transportationData.map(({ label, id, value }) => {
            return (
              <div key={id}>
                <input
                  type="checkbox"
                  id={id}
                  name="typeOfTravel"
                  value={value}
                />
                <label className="ml-2" htmlFor="budget">
                  {label}
                </label>
              </div>
            );
          })}
        </div>
        <div>
          <label className="text-gray-700 dark:text-gray-200">Activities</label>

          {activitiesData.map(({ label, id, value }) => {
            return (
              <div key={id}>
                <input
                  type="checkbox"
                  id={id}
                  name="typeOfTravel"
                  value={value}
                />
                <label className="ml-2" htmlFor="budget">
                  {label}
                </label>
              </div>
            );
          })}
        </div>
      </div>

      <div className="flex justify-end mt-6">
        <button className="px-6 py-2 leading-5 text-white transition-colors duration-200 transform bg-gray-700 rounded-md hover:bg-gray-600 focus:outline-none focus:bg-gray-600">
          Save
        </button>
      </div> */}
      </form>
      <div className="logo">
        <Logo />
      </div>
    </div>
  );
};

export default Form;
