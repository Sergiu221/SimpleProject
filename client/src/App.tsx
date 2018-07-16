import * as React from 'react';
import './App.css';

import AddList from './Add/AddList';

class App extends React.Component<{}, any>  {

  public render() {
    return (
      <div className="App">
        <AddList/>
      </div>
    );
  }
}
export default App;
