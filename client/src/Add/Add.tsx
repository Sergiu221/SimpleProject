import * as React from 'react';
import './Add.css';
export interface IAddClassProps {id:number;
                                username:string;
                                category:string;
                                city:string;
                                description:string;
                                image:string;
                                type:string;
                                date:Date;}
class Add extends  React.Component<IAddClassProps>{

  public render(){
      const images = importAll(require.context('./imagesAdds', false));
    return ( <div className='element' id='show_add'>
            <p id='show_add_top'>{this.props.username} {this.props.type}</p>
            <div><img id='anouncePhoto' src={images[this.props.image]}/>
            <button>Report</button>
            <p id='anounceDescription'>{this.props.description}</p></div>
            <p id='show_city'>City:{this.props.city}</p>

            <p id='show_date'>Date:{this.props.date}</p>
            </div>
           );
          }

}
  function importAll(r:any) {
    const images = {};
    r.keys().map((item:any, index:any) => { images[item.replace('./', '')] = r(item); });
    return images;
}
export default Add;
