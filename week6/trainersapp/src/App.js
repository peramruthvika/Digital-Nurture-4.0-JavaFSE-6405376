// src/App.js
import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainerList from './TrainerList';
import TrainerDetails from './TrainerDetails';
import { trainers } from './TrainersMock';

const App = () => {
  return (
    <Router>
      <nav>
        <ul style={{ display: 'flex', gap: '20px' }}>
          <li><Link to="/">Home</Link></li>
          <li><Link to="/trainers">Trainers</Link></li>
        </ul>
      </nav>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/trainers" element={<TrainerList data={trainers} />} />
        <Route path="/trainers/:id" element={<TrainerDetails />} />
      </Routes>
    </Router>
  );
};

export default App;
