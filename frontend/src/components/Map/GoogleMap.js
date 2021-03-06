import React from "react";

import GoogleMapReact from "google-map-react";

const GoogleMap = ({ children, ...props }) => (
  <div className="w-screen h-screen">
    <div style={{ width: "100%", height: "100%" }}>
      <GoogleMapReact
        bootstrapURLKeys={{
          key: 'AIzaSyAdhUldBaCzhef3XZzneS2p6cg2tMrAmjA',
        }}
        {...props}
      >
        {children}
      </GoogleMapReact>
    </div>
  </div>
);

export default GoogleMap;
