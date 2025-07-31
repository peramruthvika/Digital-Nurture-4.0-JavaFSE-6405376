// src/ComplaintRegister.js
import React, { useState } from 'react';

function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const refNumber = Math.floor(Math.random() * 1000000);
    alert(`Complaint Registered!\nEmployee: ${employeeName}\nComplaint: ${complaint}\nReference No: ${refNumber}`);
    // Reset the form after submission
    setEmployeeName('');
    setComplaint('');
  };

  return (
    <div style={styles.container}>
      <h2>Complaint Registration</h2>
      <form onSubmit={handleSubmit}>
        <div style={styles.inputGroup}>
          <label>Employee Name:</label><br />
          <input
            type="text"
            value={employeeName}
            onChange={(e) => setEmployeeName(e.target.value)}
            required
          />
        </div>

        <div style={styles.inputGroup}>
          <label>Complaint:</label><br />
          <textarea
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            rows="4"
            required
          />
        </div>

        <button type="submit">Submit Complaint</button>
      </form>
    </div>
  );
}

const styles = {
  container: {
    width: '400px',
    margin: '50px auto',
    padding: '20px',
    border: '2px solid #888',
    borderRadius: '10px',
    backgroundColor: '#f8f8f8',
    fontFamily: 'Arial, sans-serif',
  },
  inputGroup: {
    marginBottom: '15px'
  }
};

export default ComplaintRegister;
