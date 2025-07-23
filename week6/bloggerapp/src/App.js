import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [view, setView] = useState('books');

  // Element variable rendering
  let content;
  if (view === 'books') {
    content = <BookDetails />;
  } else if (view === 'blogs') {
    content = <BlogDetails />;
  } else {
    content = <CourseDetails />;
  }

  // Array for dynamic button rendering
  const buttons = [
    { label: 'Books', value: 'books' },
    { label: 'Blogs', value: 'blogs' },
    { label: 'Courses', value: 'courses' },
  ];

  return (
    <div style={{ padding: '20px', fontFamily: 'sans-serif' }}>
      <h1>Blogger App</h1>

      {/* Rendering multiple buttons with map() */}
      {buttons.map(btn => (
        <button key={btn.value} onClick={() => setView(btn.value)} style={{ marginRight: '10px' }}>
          {btn.label}
        </button>
      ))}

      <hr />

      {/* Conditional rendering using element variable */}
      {content}

      <hr />

      {/* Inline ternary rendering */}
      <p>
        <strong>Currently Viewing:</strong>{' '}
        {view === 'books'
          ? 'Book Section'
          : view === 'blogs'
          ? 'Blog Section'
          : 'Course Section'}
      </p>
    </div>
  );
}

export default App;
