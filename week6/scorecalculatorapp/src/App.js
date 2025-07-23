import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <h1>Student Management Portal - Score Calculator</h1>
      <CalculateScore name="Ruthvika" school="Adarsh Vidyalaya High School" total={450} goal={5} />
    </div>
  );
}

export default App;
