// src/App.js
import React, { useEffect, useState } from 'react';
import GitClient from './GitClient';

function App() {
  const [repos, setRepos] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const gitClient = new GitClient();
    gitClient.getRepositories('techiesyed').then(setRepos).finally(() => setLoading(false));
  }, []);

  return (
    <div style={{ padding: '20px' }}>
      <h1>Repositories for techiesyed</h1>
      {loading ? (
        <p>Loading...</p>
      ) : (
        <ul>
          {repos.map((repo, index) => (
            <li key={index}>{repo}</li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default App;
