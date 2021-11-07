import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Overview from "./components/Overview";
import Splash from "./components/Splash/Splash";
import "./App.css";
import Form from "./components/Form/Form";
import TypeOfTravel from "./components/Form/components/TypeOfTravel/TypeOfTravel";
import Activities from "./components/Form/components/Activities/Activities";

function App() {
  return (
    <Router>
      <Routes>
        <Route exact path="/" element={<Splash />} />
        <Route path="/overview" element={<Overview />} />
        <Route path="/form" element={<Form />} />
        <Route path="/typeOfTravel" element={<TypeOfTravel />} />
        <Route path="/activities" element={<Activities />} />
      </Routes>
    </Router>
  );
}

export default App;
