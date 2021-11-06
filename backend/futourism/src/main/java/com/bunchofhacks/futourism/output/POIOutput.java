package com.bunchofhacks.futourism.output;

import com.fasterxml.jackson.annotation.JsonProperty;

public class POIOutput {
  private String formattedAddress;
  private GeometryOutput geometry;
  private String name;
  private String imgUrl;

  @JsonProperty("formatted_address")
  public String getFormattedAddress() {
    return formattedAddress;
  }

  public void setFormattedAddress(String formattedAddress) {
    this.formattedAddress = formattedAddress;
  }

  public GeometryOutput getGeometry() {
    return geometry;
  }

  public void setGeometry(GeometryOutput geometry) {
    this.geometry = geometry;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }
}
