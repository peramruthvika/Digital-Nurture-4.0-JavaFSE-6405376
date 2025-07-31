import React, { useState } from "react";
import "./App.css";
import CurrencyConverter from "./CurrencyConverter";

function App() {
  const [count, setCount] = useState(0);

  //  Multiple methods for Increment
  const increment = () => {
    setCount(prev => prev + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    console.log("Hello from React!");
    alert("Hello! You clicked Increment");
  };

  const sayMessage = (message) => {
    alert(message);
  };

  const handleClick = (e) => {
    e.preventDefault(); // synthetic event
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h2>React Events & Event Handling</h2>

      <h3>Counter: {count}</h3>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>

      <hr />

      <button onClick={() => sayMessage("Welcome to the Event App")}>
        Say Welcome
      </button>

      <hr />

      <button onClick={handleClick}>Synthetic Event (OnPress)</button>

      <hr />

      <CurrencyConverter />
    </div>
  );
}
export default App;  