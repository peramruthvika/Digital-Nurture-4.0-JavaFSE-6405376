import React, { useState } from 'react';

function Register() {
  const [formData, setFormData] = useState({
    name: '',
    email: '',
    password: ''
  });

  const [errors, setErrors] = useState({});

  const validate = () => {
    const err = {};
    if (formData.name.trim().length < 5) {
      err.name = 'Name must be at least 5 characters long';
    }
    if (!formData.email.includes('@') || !formData.email.includes('.')) {
      err.email = 'Enter a valid email with @ and .';
    }
    if (formData.password.length < 8) {
      err.password = 'Password must be at least 8 characters long';
    }
    return err;
  };

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData(prev => ({ ...prev, [name]: value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const validationErrors = validate();
    setErrors(validationErrors);

    if (Object.keys(validationErrors).length === 0) {
      alert('Registration Successful!\n' + JSON.stringify(formData, null, 2));
      setFormData({ name: '', email: '', password: '' });
    }
  };

  return (
    <div style={{ margin: '2rem' }}>
      <h2>Register</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Name: </label><br />
          <input
            type="text"
            name="name"
            value={formData.name}
            onChange={handleChange}
          />
          {errors.name && <p style={{ color: 'red' }}>{errors.name}</p>}
        </div>

        <div>
          <label>Email: </label><br />
          <input
            type="email"
            name="email"
            value={formData.email}
            onChange={handleChange}
          />
          {errors.email && <p style={{ color: 'red' }}>{errors.email}</p>}
        </div>

        <div>
          <label>Password: </label><br />
          <input
            type="password"
            name="password"
            value={formData.password}
            onChange={handleChange}
          />
          {errors.password && <p style={{ color: 'red' }}>{errors.password}</p>}
        </div>

        <button type="submit" style={{ marginTop: '10px' }}>Register</button>
      </form>
    </div>
  );
}

export default Register;
