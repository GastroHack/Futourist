import React from "react";

const Marker = ({ text, onClick }) => (
  <div
    style={{
      position: "absolute",
      top: "50%",
      left: "50%",
      width: "16px",
      height: "16px",
      backgroundColor: "#137dc5",
      border: "2px solid #137dc5",
      borderRadius: "50%",
      transform: "translate(-50%, -50%)",
    }}
    alt={text}
    onClick={onClick}
  />
);

export default Marker;
