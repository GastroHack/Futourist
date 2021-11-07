import React from "react";
import Logo from "../../Logo.js";
import GeneralInfo from "./components/GeneralInfo/GeneralInfo";
import "./Form.css";

const Form = () => {
  return (
    <div className="wrapper">
      <GeneralInfo />
      <div className="logo">
        <Logo />
      </div>
    </div>
  );
};

export default Form;
