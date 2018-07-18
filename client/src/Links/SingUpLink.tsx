import * as React from 'react';

import './link.css';

class SingUpLink extends React.Component<{}, any> {
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
        <span className="simple-login-text">Create an account? </span>
        <span className="custom-link">
          Sing up
          </span>
      </div>

    );
  }
}

export default SingUpLink;
