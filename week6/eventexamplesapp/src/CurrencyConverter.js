import React, { useState } from "react";

const CurrencyConverter = () => {
  const [rupees, setRupees] = useState("");
  const [euro, setEuro] = useState(null);

  const handleChange = (e) => {
    setRupees(e.target.value);
  };

  const handleSubmit = () => {
    const converted = (parseFloat(rupees) / 90).toFixed(2); // simple rate
    setEuro(converted);
  };

  return (
    <div>
      <h3>Currency Converter</h3>
      <input
        type="number"
        placeholder="Enter amount in INR"
        value={rupees}
        onChange={handleChange}
      />
      <button onClick={handleSubmit}>Convert</button>
      {euro && (
        <p>Equivalent in Euro: <strong>€{euro}</strong></p>
      )}
    </div>
  );
};

export default CurrencyConverter;
