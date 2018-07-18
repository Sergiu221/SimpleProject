import * as React from 'react';
import { Link } from 'react-router-dom';
import ForgotLink from '../Links/ForgotLink';

import SingUpLink from '../Links/SingUpLink';
import './login.css';

class Login extends React.Component<{}, any> {
  public render() {
    return (
      <div className="container-login">
        <div className="wrap-login">
          <form className="login-form">
            <span className="login-title">
              Account Login
            </span>
            <div className="wrap-input validate-input" data-validate="Valid email is required:ex@abc.xyx">
              <input className="input-login" type="text" name="email" placeholder="Email" />
            </div>
            <div className="wrap-input validate-input" data-validate="Password is required">
              <input className="input-login" type="password" name="pass" placeholder="Password" />
            </div>
            <div className="container-login-btn">
              <button className="login-btn">SING IN</button>
            </div>
            <Link to="/" style={{ textDecoration: 'none' }}> <ForgotLink /> </Link>
            <Link to="/" style={{ textDecoration: 'none' }}> <SingUpLink /> </Link>
          </form>
        </div>
      </div>
    );
  }
}

export default Login;
