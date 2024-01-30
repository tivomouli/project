import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import Navbar from './components/Navbar';
import Home from './components/pages/Home';
import Projects from './components/pages/Projects';
import About from './components/pages/About';
import Cosmo from './components/pages/Cosmo';
import Mosaic from './components/pages/Mosaic';

function App() {
  return (
    <Router>
      <div className="app-container">
        <Navbar />
        <Switch>
          <Route path='/' exact component={Home} />
          <Route path='/projects' component={Projects} />
          <Route path='/about' component={About} />
          <Route path='/cosmo' component={Cosmo} />
          <Route path='/mosaic' component={Mosaic} />
        </Switch>
      </div>
    </Router>
  );
}

export default App;


