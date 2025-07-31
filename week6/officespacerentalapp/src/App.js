import React from "react";
import officeImg from "./office.jpeg"; // You can add any office image in public or src

function App() {
  // Object with office details
  const office = {
    name: "Innovate Workspaces",
    rent: 55000,
    address: "Hitech City, Hyderabad"
  };

  // Array of offices
  const officeSpaces = [
    { name: "StartHub", rent: 45000, address: "Kondapur, Hyderabad" },
    { name: "SkyOffice", rent: 70000, address: "Madhapur, Hyderabad" },
    { name: "EcoSpaces", rent: 60000, address: "Gachibowli, Hyderabad" },
    { name: "UrbanDesk", rent: 58000, address: "Banjara Hills, Hyderabad" }
  ];

  return (
    <div style={{ textAlign: "center", padding: "20px", fontFamily: "Arial" }}>
      {/* JSX Heading */}
      <h1>Office Space Rental Portal</h1>

      {/* Image Attribute */}
      <img src={officeImg} alt="Office Space" width="300" />

      {/* Single Office Object */}
      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p>
        <strong>Rent:</strong>{" "}
        <span style={{ color: office.rent < 60000 ? "red" : "green" }}>
          ₹{office.rent}
        </span>
      </p>
      <p><strong>Address:</strong> {office.address}</p>

      {/* List of Office Spaces */}
      <h2>Available Spaces</h2>
      <ul>
        {officeSpaces.map((o, index) => (
          <li key={index} style={{ marginBottom: "10px" }}>
            <strong>{o.name}</strong> –{" "}
            <span style={{ color: o.rent < 60000 ? "red" : "green" }}>
              ₹{o.rent}
            </span>{" "}
            | {o.address}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;
