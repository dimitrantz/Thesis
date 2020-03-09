import React,  { Component } from "react";
import '../css/Diagram.css';
import axios from 'axios';
import Timestamp from 'react-timestamp';


class DistanceDiagram extends Component {
  constructor(props){
    super(props)
    this.state = {
        measurements: [],
        category: ' ',
        sensor: ' ',
        index: ' ',
        frequency: ' ',
        minDistanceAccepted: ' ',
        maxDistanceAccepted: ' ',
        alarmValue: ' ',
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
                    data: c.data,
                    timestamp: c.timestamp
                  };
                });
                
                const newState = Object.assign({}, this.state, {
                  measurements: measurement
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
            minDistanceAccepted: props.minDistanceAccepted,
            maxDistanceAccepted: props.maxDistanceAccepted,
            frequency: props.frequency,
            alarmValue: props.alarmValue
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
                      data: c.data,
                      timestamp: c.timestamp
                    };
                  });
                  
                  const newState = Object.assign({}, this.state, {
                    measurements: measurement
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
              minDistanceAccepted: props.minDistanceAccepted,
              maxDistanceAccepted: props.maxDistanceAccepted,
              frequency: props.frequency,
              alarmValue: props.alarmValue
            };
          })

         
          
    }, 1);

  }

  componentWillUnmount() {
    clearInterval(this.interval);
  }
  
  render(){

    const isHided = (this.state.isVisible);

      if(isHided){  

        if(this.state.alarmValue === 'None')  
          return (         
              <div className="diagram">
              <div className="diagram-title-before">
                <p>Category: {this.state.category} | Sensor: {this.state.sensor} | TYPE: {this.state.index} | Refresh Rate: {this.state.frequency}sec <br/> Minimum Distance: {this.state.minDistanceAccepted}m | Maximum Distance: {this.state.maxDistanceAccepted}m | AlarmValue(m): {this.state.alarmValue}</p>
                 <button onClick={this.handleClick}>
                  {this.state.isVisible ? 'HIDE' : 'SHOW'}
                </button> 
              </div> 
                  <div className="diagram-title">
                          <div className="subtitle">Distance Data Measured (m)</div>
                          <div className="subtitle">Date of Measure</div>
                  </div>
                  <div className="diagram-box">

                      <div className="diagram-measurements">

                        {this.state.measurements.map(c => 
                              <div className='data_measure'>
                                  <p class="colA">{c.data}</p>
                                  <p class="colB"><Timestamp key={c.timestamp} time={c.timestamp} format='full' includeDay />   </p>             
                        
                              </div>
                        )}
                        
                      </div>
                        
                  </div>
                        
              </div>);

                        
        else
          return (
            <div className="diagram">
            <div className="diagram-title-before">
                <p>Category: {this.state.category} | Sensor: {this.state.sensor} | TYPE: {this.state.index} | Refresh Rate: {this.state.frequency}sec <br/> Minimum Distance: {this.state.minDistanceAccepted}m | Maximum Distance: {this.state.maxDistanceAccepted}m | AlarmValue(m): {this.state.alarmValue}</p>
                 <button onClick={this.handleClick}>
                  {this.state.isVisible ? 'HIDE' : 'SHOW'}
                </button> 
              </div> 
            
            <div className="diagram-title"> 
                    <div className="subtitle">Distance Data Measured (m)</div>
                    <div className="subtitle">Date of Measure</div>
            </div>
            <div className="diagram-box">

                <div className="diagram-measurements">

                  {this.state.measurements.map(c => 
                    {if(this.state.alarmValue >= c.data)
                            return (
                              <div className='data_measure'>
                                <p className="colA-red">{c.data}</p>
                                <p className="colB-red"><Timestamp key={c.timestamp} time={c.timestamp} format='full' includeDay />   </p>             
                              </div>
                            );
                          else
                            return (
                              <div className='data_measure'>
                                <p className="colA">{c.data}</p>
                                <p className="colB"><Timestamp key={c.timestamp} time={c.timestamp} format='full' includeDay />   </p>             
                              </div>
                            );
                          }
                        
                  )}
                        
                </div>
                        
            </div>
                        
            </div>);
      }else{
        return (
          <div className="diagram">
            <div className="diagram-title-before">
                <p>Category: {this.state.category} | Sensor: {this.state.sensor} | TYPE: {this.state.index} | Refresh Rate: {this.state.frequency}sec <br/> Minimum Distance: {this.state.minDistanceAccepted}m | Maximum Distance: {this.state.maxDistanceAccepted}m | AlarmValue(m): {this.state.alarmValue}</p>
                 <button onClick={this.handleClick}>
                  {this.state.isVisible ? 'HIDE' : 'SHOW'}
                </button> 
              </div> 
          </div>
        );
      }
      
      }
}


export default DistanceDiagram;