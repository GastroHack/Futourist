import React from "react";
import SpotSidebar from "./SpotSidebar/SpotSidebar";
import Map from "./Map";

const Overview = () => {
  const spots = [
    {
      name: "Kristallwelten",
      image:
        "https://d18z89ggtjsooz.cloudfront.net/cache-buster-1598280487/website/var/tmp/image-thumbnails/40000/42126/thumb__lightbox/swarovski.jpeg",
      suggestions: [
        {
          name: "Test Spot",
          image:
            "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.sage-immobilien.at%2Fwp-content%2Fuploads%2F2016%2F03%2Fzell-am-see-von-oben-1.jpg&f=1&nofb=1",
        },
        {
          name: "test spot 2",
          image:
            "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.sage-immobilien.at%2Fwp-content%2Fuploads%2F2016%2F03%2Fzell-am-see-1-495x400.jpg&f=1&nofb=1",
        },
      ],
    },
    {
      name: "Test Spot",
      image:
        "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.sage-immobilien.at%2Fwp-content%2Fuploads%2F2016%2F03%2Fzell-am-see-von-oben-1.jpg&f=1&nofb=1",
      suggestions: [
        {
          name: "Test Spot2",
          image:
            "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.sage-immobilien.at%2Fwp-content%2Fuploads%2F2016%2F03%2Fzell-am-see-von-oben-1.jpg&f=1&nofb=1",
        },
        {
          name: "test spot34",
          image:
            "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.sage-immobilien.at%2Fwp-content%2Fuploads%2F2016%2F03%2Fzell-am-see-1-495x400.jpg&f=1&nofb=1",
        },
      ],
    },
    {
      name: "test spot 2",
      image:
        "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.sage-immobilien.at%2Fwp-content%2Fuploads%2F2016%2F03%2Fzell-am-see-1-495x400.jpg&f=1&nofb=1",
      suggestions: [
        {
          name: "Test Spot2",
          image:
            "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.sage-immobilien.at%2Fwp-content%2Fuploads%2F2016%2F03%2Fzell-am-see-von-oben-1.jpg&f=1&nofb=1",
        },
        {
          name: "test spot34",
          image:
            "https://external-content.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.sage-immobilien.at%2Fwp-content%2Fuploads%2F2016%2F03%2Fzell-am-see-1-495x400.jpg&f=1&nofb=1",
        },
      ],
    },
  ];

  // let spots = [];
  // useEffect(() => {
  //   fetch("https://api.futourist.live/scenario1")
  //     .then((response) => response.json())
  //     .then((data) => {
  //       const { event, gastro, hotel, poi, tour } = data;

  // 			Object.entries(data).forEach(([key, value]) => {
  // 				value.forEach(() => {

  // 				})
  // 			});
  //     });
  // });

  return (
    <div>
      <SpotSidebar spots={spots} />
      <Map />
    </div>
  );
};

export default Overview;