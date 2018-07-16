import * as React from 'react';
import './Filter.css';

class Filter extends React.Component<{}, any>  {

  public render() {
    return (
      <div className="filter">
        <select className="Select" name="type" id="type">
          <option className="dropSelect" value="">ALL</option>

      </select>
      <select className="Select" name="city" id="city">
          <option className="dropSelect" value="">ALL Cities</option>

      </select>
      <select className="Select" name="category" id="category">
          <option className="dropSelect" value="">ALL</option>
      </select>
      </div>
    );
  }
}
export default Filter;
