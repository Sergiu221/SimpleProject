import registerServiceWorker from './registerServiceWorker';

import  * as React from 'react';
import  * as ReactDOM from 'react-dom';
import { BrowserRouter, Route } from 'react-router-dom';
import './index.css';

import App from './App';
import Login from './Login/Login';

ReactDOM.render(
  <BrowserRouter>
    <div>
      <Route  exact={true} path="/login" component={Login} />
      <Route  exact={true} path="/home" component={App} />
    </div>
  </BrowserRouter>,
  document.getElementById('root') as HTMLElement
);
registerServiceWorker();
