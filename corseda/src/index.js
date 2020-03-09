import ReactDOM from 'react-dom';
import React from "react";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";

import Home from './Home';
import Datameasuring from './DataMeasuring';


import './css/Navigation.css';


const home = () => <Home />;
const data = () => <Datameasuring />;

const AppRouter = () => (
  <Router>
    <div className="App-header">
        <ul className='pure-menu-list'>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <a href="https://r4a.issel.ee.auth.gr/" className="pure-menu-link">R4A Group</a>
          </li>
          <li >
            <a href="https://en.wikipedia.org/wiki/Nao_(robot)" className="pure-menu-link">NAO Robot</a>
          </li>
          <li>
            <Link to="/datameasuring/">Data Measuring</Link>
          </li>
        </ul> 

        <Route path="/" exact component={home} />
        <Route path="/home/" component={home} />
        <Route path="/datameasuring/" component={data} />
    </div>
  </Router>
);
  
  // ========================================
  
ReactDOM.render(
    <AppRouter />,
    document.getElementById('root')
  );
  

  
  