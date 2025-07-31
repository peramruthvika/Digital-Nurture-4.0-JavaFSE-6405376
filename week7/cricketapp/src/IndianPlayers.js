// src/IndianPlayers.js
import React from 'react';

const IndianPlayers = () => {
  const oddPlayers = ['Rohit', 'Gill', 'Jadeja', 'Samson', 'Kuldeep'];
  const evenPlayers = ['Kohli', 'Rahul', 'Pandya', 'Ashwin', 'Shami', 'Bumrah'];

  // Destructuring example
  const [p1, p2, p3, p4, p5] = oddPlayers;
  const [q1, q2, q3, q4, q5, q6] = evenPlayers;

  // Merge using spread operator
  const T20players = ['Surya', 'Pant'];
  const RanjiTrophyPlayers = ['Sarfaraz', 'Shubham'];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {[p1, p2, p3, p4, p5].map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {[q1, q2, q3, q4, q5, q6].map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h2>Merged Players (T20 + Ranji)</h2>
      <ul>
        {mergedPlayers.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
