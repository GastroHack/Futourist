import SpotSidebar from "./components/SpotSidebar/SpotSidebar";
import Overview from "./components/Overview";

function App() {
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

  return (
    <div className="">
      <SpotSidebar spots={spots} />
      <Overview />
    </div>
  );
}

export default App;
