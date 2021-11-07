import React from "react";
import { Link } from "react-router-dom";
import Logo from "../../Logo.js";

const Splash = () => (
  <div className="flex justify-center h-screen">
    <Link to="/form" className="w-full h-full flex p-24">
      <Logo />
    </Link>
  </div>
);
export default Splash;
