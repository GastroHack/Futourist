package com.bunchofhacks.futourism.parser;

import com.bunchofhacks.futourism.model.Item;
import com.bunchofhacks.futourism.output.GeometryOutput;
import com.bunchofhacks.futourism.output.POIOutput;

public class POIOutputMapper {
  public static POIOutput map(Item item) {
    POIOutput poiOutput = new POIOutput();

    poiOutput.setId(item.getId());

    String formattedAddress =
        String.format(
            "%s, %s, %s, %s", item.getStreet(), item.getCity(), item.getZip(), item.getCountry());

    poiOutput.setFormattedAddress(formattedAddress);
    poiOutput.setName(item.getTitle());

    String lat = item.getGeo().getMain().getLatitude();
    String lng = item.getGeo().getMain().getLongitude();
    poiOutput.setGeometry(new GeometryOutput(lat, lng));

    poiOutput.setImgUrl(item.getMediaObjects()[item.getMediaObjects().length - 1].getUrl());

    return poiOutput;
  }
}
