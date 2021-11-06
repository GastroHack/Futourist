import React from "react";

const Marker = ({ text, onClick }) => (
  <div
    style={{
      position: "absolute",
      top: "50%",
      left: "50%",
      width: "24px",
      height: "24px",
      backgroundColor: "#FF0000",
      border: "2px solid #FF0000",
      borderRadius: "100%",
      transform: "translate(-50%, -50%)",
    }}
    alt={text}
    onClick={onClick}
  />
);

export default Marker;
