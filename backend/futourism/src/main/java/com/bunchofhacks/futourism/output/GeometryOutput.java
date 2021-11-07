package com.bunchofhacks.futourism.output;

public class GeometryOutput {

    LocationOutput location;

    public LocationOutput getLocation() {
        return location;
    }

    public void setLocation(LocationOutput location) {
        this.location = location;
    }

    public GeometryOutput(String lat, String lng){
        location = new LocationOutput();
        location.setLat(lat);
        location.setLng(lng);
    }

    class LocationOutput {
        String lat;
        String lng;

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }
    }
}
