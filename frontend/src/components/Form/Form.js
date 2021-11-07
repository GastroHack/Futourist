import React, { useState } from "react";
import Logo from "../../Logo.js";
import GeneralInfo from "./components/GeneralInfo/GeneralInfo";
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
