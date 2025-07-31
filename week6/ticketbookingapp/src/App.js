import React, { useState } from 'react';
import Guest from './components/Guest';
import User from './components/User';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div style={{ textAlign: 'center', marginTop: '2rem' }}>
      <h1>Ticket Booking App</h1>

      {isLoggedIn ? (
        <>
          <User />
          <button onClick={handleLogout} style={btnStyle}>Logout</button>
        </>
      ) : (
        <>
          <Guest />
          <button onClick={handleLogin} style={btnStyle}>Login</button>
        </>
      )}
    </div>
  );
}

const btnStyle = {
  padding: '10px 20px',
  fontSize: '16px',
  marginTop: '20px',
  cursor: 'pointer',
  border: 'none',
  borderRadius: '5px',
  backgroundColor: '#007bff',
  color: 'white'
};

export default App;
