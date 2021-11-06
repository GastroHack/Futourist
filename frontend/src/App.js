import Overview from "./components/Overview";

function App() {
  return (
    <div className="">
      <header className="text-2xl">
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
      <Overview />
    </div>
  );
}

export default App;
