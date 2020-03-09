import React,  { Component } from "react";
import '../css/Image.css';
import axios from 'axios';
import Image from './Image';



class ImageDiagram extends Component {
  constructor(props){
    super(props)
    this.state = {
        imagesIDs: [],
        category: ' ',
        sensor: ' ',
        index: ' ',
        frequency: ' ',
        resolution: ' ',
        isVisible: true
    }
    this.urlPathId = props.sensor;
    this.generalPath = "http://127.0.0.1:3001/measurements/last/";
    this.pathId = this.generalPath.concat(this.urlPathId);
    this.path = this.pathId.concat("/2");

    // This binding is necessary to make `this` work in the callback
    this.handleClick = this.handleClick.bind(this);
  }
    
    handleClick() {
      this.setState(prevState => ({
        isVisible: !prevState.isVisible
      }));
    }

  componentDidMount(){
    axios.get(this.path, {
      method: 'GET',
      headers: {
      'Access-Control-Allow-Origin': '*',
      'Content-Type': 'application/json',
      }
      }).then(response => {
              
        const imagesIds = response.data.measurements.map(c => {
          return {
            name: c.data,
            timestamp: c.timestamp
          };
        });
        
        const newState = Object.assign({}, this.state, {
          imagesIDs:   imagesIds
        });
        
        this.setState(newState);
       
      }).catch(function (error) {
           console.log(error);

         });

    
    this.setState(function(state, props) {
      return {
        category: props.category,
        sensor: props.sensor,
        index: props.index,
        frequency:props.frequency,
        resolution: props.resolution
      };
    })
    this.interval = setInterval(() => {
      axios.get(this.path, {
        method: 'GET',
        headers: {
        'Access-Control-Allow-Origin': '*',
        'Content-Type': 'application/json',
        }
        }).then(response => {
                
          const imagesIds = response.data.measurements.map(c => {
            return {
              name: c.data,
              timestamp: c.timestamp
            };
          });
          
          const newState = Object.assign({}, this.state, {
            imagesIDs:   imagesIds
          });
          
          this.setState(newState);
         
        }).catch(function (error) {
             console.log(error);
  
           });
  
      
      this.setState(function(state, props) {
        return {
          category: props.category,
          sensor: props.sensor,
          index: props.index,
          frequency:props.frequency,
          resolution: props.resolution
        };
      })
    }, 100);
   
  }

  componentWillUnmount() {
    clearInterval(this.interval);
  }
  render(){
    const isHided = (this.state.isVisible);

    if(isHided){ 
      return (
        <div className="diagram">
            <div className="diagram-title-before">
              <p>Category: {this.state.category} | Sensor: {this.state.sensor} | TYPE: {this.state.index} <br/> Refresh Rate: {this.state.frequency}sec | Resolution: {this.state.resolution}</p>
                <button onClick={this.handleClick}>
                  {this.state.isVisible ? 'HIDE' : 'SHOW'}
                </button> 
            </div> 
            <h4>Captured Images</h4> 
            <div className="diagram-box">

                <div className="data">

                  {this.state.imagesIDs.map(c => 
                    <Image key={c.timestamp} id={c.name} timestamp={c.timestamp} parentId={this.urlPathId}/>
                  )}
                </div>


            </div>
                  
        </div>
      );
    }else{
      return(
        <div className="diagram">
          <div className="diagram-title-before">
            <p>Category: {this.state.category} | Sensor: {this.state.sensor} | TYPE: {this.state.index} <br/> Refresh Rate: {this.state.frequency}sec | Resolution: {this.state.resolution}</p>
            <button onClick={this.handleClick}>
              {this.state.isVisible ? 'HIDE' : 'SHOW'}
            </button> 
          </div>  
        </div>        
      );
      }
    }
}


export default ImageDiagram;