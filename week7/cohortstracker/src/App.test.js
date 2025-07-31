import { render, screen } from '@testing-library/react';
import App from './App';

test('renders cohort tracker title', () => {
  render(<App />);
  const heading = screen.getByText(/Cohorts Details/i);
  expect(heading).toBeInTheDocument();
});
