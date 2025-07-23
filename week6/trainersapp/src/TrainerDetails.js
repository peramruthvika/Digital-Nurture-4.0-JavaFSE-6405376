// src/TrainerDetails.js
import React from 'react';
import { useParams } from 'react-router-dom';
import { trainers } from './TrainersMock';

const TrainerDetails = () => {
  const { id } = useParams();
  const trainer = trainers.find((t) => t.TrainerId === parseInt(id));

  return (
    <div>
      {trainer ? (
        <>
          <h2>{trainer.Name}</h2>
          <p>Email: {trainer.Email}</p>
          <p>Phone: {trainer.Phone}</p>
          <p>Technology: {trainer.Technology}</p>
          <p>Skills: {trainer.Skills.join(', ')}</p>
        </>
      ) : (
        <p>Trainer not found</p>
      )}
    </div>
  );
};

export default TrainerDetails;
