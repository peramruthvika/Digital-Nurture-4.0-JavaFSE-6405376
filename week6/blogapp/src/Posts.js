import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
      errorMessage: ''
    };
  }

  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => {
        if (!response.ok) {
          throw new Error('Failed to fetch posts');
        }
        return response.json();
      })
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        this.setState({ hasError: true, errorMessage: error.message });
      });
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert(`Something went wrong: ${error}`);
    this.setState({ hasError: true, errorMessage: error.toString() });
  }

  render() {
    if (this.state.hasError) {
      return <h2>Error: {this.state.errorMessage}</h2>;
    }

    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.slice(0, 10).map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
