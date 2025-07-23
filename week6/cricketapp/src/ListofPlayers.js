// src/ListofPlayers.js
import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Rohit", score: 85 },
    { name: "Kohli", score: 95 },
    { name: "Gill", score: 45 },
    { name: "Rahul", score: 60 },
    { name: "Jadeja", score: 75 },
    { name: "Pandya", score: 68 },
    { name: "Samson", score: 90 },
    { name: "Ashwin", score: 55 },
    { name: "Shami", score: 80 },
    { name: "Bumrah", score: 65 },
    { name: "Kuldeep", score: 50 },
  ];

  // Filter players with score < 70 using arrow function
  const lowScorers = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h2>Players Scoring Below 70</h2>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
