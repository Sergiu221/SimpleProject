import * as React from 'react';

class Header extends React.Component<{}, any> {
  constructor(props: any) {
    super(props);
    this.state = {
      adds: [],
      isLoading: false
    };
  }


  public render() {
    const addPostImage = require('../style/images/add.png');
    const addLogoImage = require('../style/images/people-logo.png');
    return (
      <nav className="navbar">
          <form method="post">
              <input className="search" name="search" placeholder="Cauta..."/>
              <button className="searchButton"/>
              <a href="lPost.php" className="navButton">
                  <img src={addPostImage} className="navImg"/>
                  <p className="navText">Add Post</p>
              </a>
              <a href="home.php" className="navButton">
                  <img src={addLogoImage} className="navImg"/>
                  <p className="navText"> Sergiu </p>
              </a>
          </form>
      </nav>
    );
  }
}

export default Header;
