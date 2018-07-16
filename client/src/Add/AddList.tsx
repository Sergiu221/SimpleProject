import * as React from 'react';
import Add from './Add';
import './AppList.css';
class AddList extends React.Component<{}, any> {
  constructor(props: any) {
    super(props);
    this.state = {
      adds: [],
      isLoading: false
    };
  }





  public componentDidMount() {
    this.setState({isLoading: true});
    fetch('http://localhost:8080/adds/adds-view')
      .then(response => response.json())
      .then(data => this.setState({adds: data, isLoading: false}));
  }
  public render() {
    const {adds, isLoading} = this.state;
    if (isLoading) {
      return <p>Loading...</p>;
    }
    return (
      <div className="container" id="show_anunt">
        {adds.map((add: any) =>
          <div key={add.id} >
            <Add id={add.id}
                 username={add.username}
                 category={add.category}
                 city={add.city}
                 description={add.description}
                 image={add.image}
                 type={add.type}
                 date=  {add.date} />
           </div>
        )}
      </div>
    );
  }



}

export default AddList;
