import * as React from 'react';

// import PostImage from '../style/images/add.png';
// import LogoImage from '../style/images/people-logo.png';
class Header extends React.Component<{}, any> {
  constructor(props: any) {
    super(props);
    this.state = {
      adds: [],
      isLoading: false
    };
  }

  public render() {
    return (
      <nav className="navbar">
        <div>
          Here will be the Header.
        </div>
      </nav>
    );
  }
}

export default Header;
