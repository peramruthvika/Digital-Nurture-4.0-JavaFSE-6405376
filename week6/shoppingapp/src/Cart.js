import React from 'react';

const Cart = ({ items }) => {
  return (
    <div style={{ display: 'inline-block', border: '2px solid grey', padding: '10px' }}>
      <table border="1" cellPadding="10" style={{ borderCollapse: 'collapse', color: 'teal' }}>
        <thead>
          <tr style={{ color: 'green' }}>
            <th>Name</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {items.map((item, idx) => (
            <tr key={idx}>
              <td>{item.name}</td>
              <td>{item.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Cart;
