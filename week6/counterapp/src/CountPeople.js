import React, { Component } from 'react';

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0
    };
  }

  updateEntry = () => {
    this.setState(prevState => ({
      entryCount: prevState.entryCount + 1
    }));
  };

  updateExit = () => {
    this.setState(prevState => ({
      exitCount: prevState.exitCount + 1
    }));
  };

  render() {
    return (
      <div style={styles.container}>
        <h2>Mall Entry & Exit Counter</h2>
        <p><strong>People Entered:</strong> {this.state.entryCount}</p>
        <p><strong>People Exited:</strong> {this.state.exitCount}</p>

        <button onClick={this.updateEntry} style={styles.button}>Login</button>
        <button onClick={this.updateExit} style={styles.button}>Exit</button>
      </div>
    );
  }
}

const styles = {
  container: {
    border: '2px solid #444',
    padding: '20px',
    width: '300px',
    margin: '50px auto',
    borderRadius: '10px',
    textAlign: 'center',
    fontFamily: 'Arial'
  },
  button: {
    margin: '10px',
    padding: '10px 20px',
    fontSize: '16px'
  }
};

export default CountPeople;
