import React from 'react';
import './App.css';

function App() {
  const items = [
    { name: 'Laptop', price: 80000 },
    { name: 'TV', price: 120000 },
    { name: 'Washing Machine', price: 50000 },
    { name: 'Mobile', price: 30000 },
    { name: 'Fridge', price: 70000 },
  ];

  return (
    <div className="container">
      <h2 className="header">Items Ordered :</h2>
      <table className="item-table">
        <thead>
          <tr>
            <th>Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {items.map((item, index) => (
            <tr key={index}>
              <td>{item.name}</td>
              <td>{item.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;
