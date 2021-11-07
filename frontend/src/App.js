import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Overview from "./components/Overview";
import Splash from "./components/Splash/Splash";
import "./App.css";
import Form from "./components/Form/Form";

function App() {
  return (
    <Router>
      <Routes>
        <Route exact path="/" element={<Splash />} />
        <Route path="/overview" element={<Overview />} />
        <Route path="/form" element={<Form />} />
      </Routes>
    </Router>
  );
}

export default App;
