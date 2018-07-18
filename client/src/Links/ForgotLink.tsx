import * as React from 'react';

import './link.css';

class ForgotLink extends React.Component<{}, any> {
  constructor(props: any) {
    super(props);
    this.state = {
      adds: [],
      isLoading: false
    };
  }

  public render() {
    return (

      <div className="text-login-bottom">
        <span className="simple-login-text">Forgot </span>
        <span className="custom-link">
          Username / Password?
          </span>
      </div>

    );
  }
}

export default ForgotLink;
