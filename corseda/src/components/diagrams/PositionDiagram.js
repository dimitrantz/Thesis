import React,  { Component } from "react";
import '../css/Diagram.css';
import axios from 'axios';
import Timestamp from 'react-timestamp';


class PositionDiagram extends Component {
  constructor(props){
    super(props)
    this.state = {
        measurements: [],
        category: ' ',
        sensor: ' ',
        index: ' ',
        frequency: ' ',
        origin: ' ',
        target: ' ',
        isVisible: true
    }
    this.urlPathId = props.sensor;
    this.generalPath = "http://127.0.0.1:3001/measurements/last/";
    this.pathId = this.generalPath.concat(this.urlPathId);
    this.path = this.pathId.concat("/10");

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
      })
         .then(response => {
                
                const measurement = response.data.measurements.map(c => {
                  return {
                    pose: c.pose,
                    timestamp: c.timestamp,
                  };
                });
                
                const newState = Object.assign({}, this.state, {
                  measurements:   measurement
                });
                
                this.setState(newState);
              })
         .catch(function (error) {
           console.log(error);

         });


    this.setState(function(state, props) {
      return {
        category: props.category,
        sensor: props.sensor,
        index: props.index,
        frequency: props.frequency,
        origin: props.origin,
        target: props.target

      };
    })
    this.interval = setInterval(() => {

      axios.get(this.path, {
        method: 'GET',
        headers: {
        'Access-Control-Allow-Origin': '*',
        'Content-Type': 'application/json',
        }
        })
           .then(response => {
                  
                  const measurement = response.data.measurements.map(c => {
                    return {
                      pose: c.pose,
                      timestamp: c.timestamp,
                    };
                  });
                  
                  const newState = Object.assign({}, this.state, {
                    measurements:   measurement
                  });
                  
                  this.setState(newState);
                })
           .catch(function (error) {
             console.log(error);
  
           });
  
  
      this.setState(function(state, props) {
        return {
          category: props.category,
          sensor: props.sensor,
          index: props.index,
          frequency: props.frequency,
          origin: props.origin,
          target: props.target
        };
      })
    }, 1);

  }

  componentWillUnmount() {
    clearInterval(this.interval);
  }

  render(){
    const isHided = (this.state.isVisible);
    var isTframe = false;
    if (this.state.origin){
      isTframe = true;
    }

    if(isHided){ 

      if(isTframe){
        return (
            <div className="diagram">
              <div className="diagram-title-before">
                  <p>Category: {this.state.category} |   Origin: {this.state.origin} | Target: {this.state.target} | Refresh Rate: {this.state.frequency}sec <br/> Sensor: {this.state.sensor}</p>
                  <button onClick={this.handleClick}>
                     {this.state.isVisible ? 'HIDE' : 'SHOW'}
                  </button> 
              </div> 
              <div className="diagram-title">
                  <div className="subtitle">Position Data Measured (rad)</div>
                  <div className="subtitle">Date of Measure</div>
              </div>
              <div className="diagram-box">
                  
                  <div className="diagram-measurements">
                                    
                    {this.state.measurements.map(c => 
                          <div className='data_measure'>
                              <p className="colA">
                                  Pitch: {c.pose.pitch} <br/> Roll: {c.pose.roll} <br/> Yaw: {c.pose.yaw} <br/> X: {c.pose.x} <br/> Y: {c.pose.y} <br/> Z: {c.pose.z}
                              </p>
                              <p class="colB"><Timestamp key={c.timestamp} time={c.timestamp} format='full' includeDay />   </p>             
                          
                          </div>
                    )}

                  </div>
                  
               </div>
              </div>);
      }else{
      return (

            <div className="diagram">
              <div className="diagram-title-before">
                  <p>Category: {this.state.category} | Sensor: {this.state.sensor} | TYPE: {this.state.index} <br/> Refresh Rate: {this.state.frequency}sec</p>
                  <button onClick={this.handleClick}>
                     {this.state.isVisible ? 'HIDE' : 'SHOW'}
                  </button> 
              </div> 
              <div className="diagram-title">
                  <div className="subtitle">Position Data Measured (rad)</div>
                  <div className="subtitle">Date of Measure</div>
              </div>
              <div className="diagram-box">
                  
                  <div className="diagram-measurements">
                                    
                    {this.state.measurements.map(c => 
                          <div className='data_measure'>
                              <p className="colA">
                                  Pitch: {c.pose.pitch} | Roll: {c.pose.roll} | Yaw: {c.pose.yaw} <br/> X: {c.pose.x} | Y: {c.pose.y} | Z: {c.pose.z}
                              </p>
                              <p class="colB"><Timestamp key={c.timestamp} time={c.timestamp} format='full' includeDay />   </p>             
                          
                          </div>
                    )}

                  </div>
                  
              </div>
        </div>
          
      );}
      }else{

        if(isTframe){
            return(
              <div className="diagram">
                <div className="diagram-title-before">
                    <p>Category: {this.state.category} | Sensor: {this.state.sensor} | TYPE: {this.state.index} <br/> Refresh Rate: {this.state.frequency}sec |  Origin: {this.state.origin} | Target: {this.state.target}</p>
                    <button onClick={this.handleClick}>
                      {this.state.isVisible ? 'HIDE' : 'SHOW'}
                    </button> 
                </div> 
              </div>
          );
        }else{
          return(
              <div className="diagram">
                <div className="diagram-title-before">
                    <p>Category: {this.state.category} | Sensor: {this.state.sensor} | TYPE: {this.state.index} <br/> Refresh Rate: {this.state.frequency}sec</p>
                    <button onClick={this.handleClick}>
                      {this.state.isVisible ? 'HIDE' : 'SHOW'}
                    </button> 
                </div> 
              </div>
          );
      }
      }
    }
}


export default PositionDiagram;