import Filter from '../src/Filter/Filter';
import Header from '../src/Header/Header';
import App from './App';
import registerServiceWorker from './registerServiceWorker';


import * as React from 'react';
import * as ReactDOM from 'react-dom';
import './index.css';

ReactDOM.render(
  <body>
  <Header/>
  <Filter/>
  <App />
</body>,
  document.getElementById('root') as HTMLElement
);
registerServiceWorker();
