package com.bunchofhacks.futourism.parser;

import com.bunchofhacks.futourism.model.Item;
import com.bunchofhacks.futourism.model.MediaObject;
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

    MediaObject outputMedia = new MediaObject();

    for (MediaObject mediaObject : item.getMediaObjects()){
      if (mediaObject.getRel().equals("imagegallery")){
        outputMedia = mediaObject;
        break;
      }
    }

    poiOutput.setImgUrl(outputMedia.getUrl());

    return poiOutput;
  }
}
