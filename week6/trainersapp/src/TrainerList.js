// src/TrainerList.js
import React from 'react';
import { Link } from 'react-router-dom';

const TrainerList = ({ data }) => {
  return (
    <div>
      <h2>Trainers List</h2>
      <ul>
        {data.map((trainer) => (
          <li key={trainer.TrainerId}>
            <Link to={`/trainers/${trainer.TrainerId}`}>{trainer.Name}</Link>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default TrainerList;
