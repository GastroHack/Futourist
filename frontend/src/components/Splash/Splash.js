import React from "react";
import { Link } from "react-router-dom";
import Logo from "../../Logo.js";
import "./Splash.css";

const Splash = () => (
  <div className="flex flex-col justify-center h-screen mx-24">
    <Logo className="w-full" />
    <Link to="/form" className="flex mx-auto mt-12">
      <button className="startJourney px-5 w-auto whitespace-nowrap">
        Start your Adventure!
      </button>
    </Link>
  </div>
);
export default Splash;
