import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Overview from "./components/Overview";
import Splash from "./components/Splash/Splash";
import "./App.css";

function App() {
  return (
    <Router>
      <Routes>
        <Route exact path="/" element={<Splash />} />
        <Route path="/overview" element={<Overview />} />
      </Routes>
    </Router>
  );
}

export default App;
