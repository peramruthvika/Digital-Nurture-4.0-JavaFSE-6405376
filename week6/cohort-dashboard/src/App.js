

import { CohortsData } from "./Cohort";
import "./App.css";

function App() {
  return (
    <div className="cohort-container">
      {CohortsData.map((cohort, index) => (
        <div key={index} className="cohort-card">
          <h3>{cohort.cohortCode}</h3>
          <p><strong>Start Date:</strong> {cohort.startDate}</p>
          <p><strong>Technology:</strong> {cohort.technology}</p>
          <p><strong>Trainer:</strong> {cohort.trainerName}</p>
          <p><strong>Coach:</strong> {cohort.coachName}</p>
          <p><strong>Status:</strong> {cohort.currentStatus}</p>
        </div>
      ))}
    </div>
  );
}

export default App;

