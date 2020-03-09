import React, { Component } from 'react';

import './css/DataMeasuring.css';
import nao_image from './static/nao-image.png';
import CategoryList from './components/CategoryList';
import DiagramList from './components/DiagramList';

import axios from 'axios';

class DataMeasuring extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isToggleOn: true,
      diagrams: []
    };

    // This binding is necessary to make `this` work in the callback
    this.handleClick = this.handleClick.bind(this);
  }


  handleClick() {
    this.setState(prevState => ({
      isToggleOn: !prevState.isToggleOn
    }));
  }

  componentDidMount(){



    this.interval = setInterval(() => {     
      axios.get("http://127.0.0.1:3001/sensors_parameters", {
      method: 'GET',
      headers: {
      'Access-Control-Allow-Origin': '*',
      'Content-Type': 'application/json',
      }
      })
         .then(response => {
                
                const newDiagrams = response.data.sensors_parameters.map(c => {
                  return {
                    index: c.index,
                    category: c.category
                  };
                });
                
                const newState = Object.assign({}, this.state, {
                  diagrams: newDiagrams
                });

                this.setState(newState);
              })
         .catch(function (error) {
           console.log(error);

         });}, 1000);
  }

  render() {
      const isLoaded = !(this.state.isToggleOn);

      if(isLoaded){
        return (
          <div className="DataMesuring-content">
            
            
            <div className="DataMeasuring-content">
  
              <div className="col1">
                
                <div className="row1">
                <button  onClick={this.handleClick}>
                  {this.state.isToggleOn ? 'LOAD' : 'STOP'}
                </button>
  
  
                </div>
  
                <div className="row2">
                  <h4>SENSORS</h4>
                  <CategoryList />
                </div>
  
              </div>
  
              <div className="col2">
                <h4>DATA DIAGRAMS</h4>
                
                <DiagramList />
              </div>
  
              <div className="col3">
                <img src={nao_image}  alt="nao-logo"/>
                {this.state.diagrams.map(c => {
                  switch(c.index) {
                      case 'top':
                        return <span className="points-camera"></span>
                      case 'bottom':
                        return <span className="points-camera"></span>
                      case 'left':
                        return <span className="points-sonar"></span>
                      case 'right':
                        return <span className="points-sonar"></span>
                      case 'battery':
                        return <span className="points-battery"></span>
                      case 'RFoot_Bumper_Left':
                        return <span className="points-foot-bumber"></span>
                      case 'RFoot_Bumper_Right':
                        return <span className="points-foot-bumber"></span>
                      case 'LFoot_Bumper_Left':
                        return <span className="points-foot-bumber"></span>
                      case 'LFoot_Bumper_Right':
                        return <span className="points-foot-bumber"></span>
                      case 'Head_Touch_Rear':
                        return <span className="points-head-tactiles"></span>
                      case 'Head_Touch_Front':
                        return <span className="points-head-tactiles"></span>
                      case 'Head_Touch_Middle':
                        return <span className="points-head-tactiles"></span>
                      case 'HeadYaw':
                        return <span className="points-head-joints"></span>
                      case 'HeadPitch':
                        return <span className="points-head-joints"></span>
                      case 'RHand_Touch_Back':
                        return <span className="points-hand-tactiles"></span>
                      case 'RHand_Touch_Left':
                        return <span className="points-hand-tactiles"></span>
                      case 'RHand_Touch_Right':
                        return <span className="points-hand-tactiles"></span>
                      case 'LHand_Touch_Back':
                        return <span className="points-hand-tactiles"></span>
                      case 'LHand_Touch_Left':
                        return <span className="points-hand-tactiles"></span>
                      case 'LHand_Touch_Right':
                        return <span className="points-hand-tactiles"></span>
                      case 'LHipYawPitch':
                        return <span className="points-hip-joints"></span>
                      case 'LHipRoll':
                        return <span className="points-hip-joints"></span>
                      case 'LHipPitch':
                        return <span className="points-hip-joints"></span>
                      case 'RHipYawPitch':
                        return <span className="points-hip-joints"></span>
                      case 'RHipRoll':
                        return <span className="points-hip-joints"></span>
                      case 'RHipPitch':
                        return <span className="points-hip-joints"></span>
                      case 'RKneePitch':
                        return <span className="points-knee-joints"></span>
                      case 'LKneePitch':
                        return <span className="points-ankle-joints"></span>
                      case 'LAnklePitch':
                        return <span className="points-ankle-joints"></span>
                      case 'LAnkleRoll':
                        return <span className="points-ankle-joints"></span>
                      case 'RAnklePitch':
                        return <span className="points-ankle-joints"></span>
                      case 'RAnkleRoll':
                        return <span className="points-ankle-joints"></span>
                      case 'LWristYaw':
                        return <span className="points-wrist-joints"></span>
                      case 'RWristYaw':
                        return <span className="points-wrist-joints"></span>
                      case 'LElbowYaw':
                        return <span className="points-elbow-joints"></span>
                      case 'LElbowRoll':
                        return <span className="points-elbow-joints"></span>
                      case 'RElbowYaw':
                        return <span className="points-elbow-joints"></span>
                      case 'RElbowRoll':
                        return <span className="points-elbow-joints"></span>
                      case 'LShoulderPitch':
                        return <span className="points-shoulder-joints"></span>
                      case 'LShoulderRoll':
                        return <span className="points-shoulder-joints"></span>
                      case 'RShoulderPitch':
                        return <span className="points-shoulder-joints"></span>
                      case 'RShoulderRoll':
                        return <span className="points-shoulder-joints"></span>
                      case 'Torso':
                        return null;
                      case 'Robot':
                        return null;
                      case 'Localization':
                        return null;
                      default: 
                      {
                        if (c.category === 'POSITION')
                          return null;
                        else if (c.category === 'ACOUSTIC')
                          return (  
                          <div>
                           <span className="points-acoustic-up-mics"></span>
                           <span className="points-acoustic-down-mics"></span>
                          </div> 
                          );
                        else
                          return null;
                          }

                    } 
                    
                })}
              </div>
            </div>
            <div className="DataMeasuring-footer">
                <p className="Copyright">Copyright © 2019 | Aristotle University of Thessaloniki | Thesis Dimitra Ntzioni</p>
            </div>
          </div>
        );
      } else {
        return (
          <div className="DataMesuring-content">   
            <div className="DataMeasuring-content">
  
              <div className="col1">
                
                <div className="row1">
                <button  onClick={this.handleClick}>
                  {this.state.isToggleOn ? 'LOAD' : 'STOP'}
                </button>
                </div>
  
                <div className="row2">
                  <h4>SENSORS</h4>
                </div>
              </div>
  
              <div className="col2">
                <h4>DATA DIAGRAMS</h4>
                
              </div>
  
              <div className="col3">
                <img src={nao_image}  alt="nao-logo"/>
                
              </div>
            </div>
            <div className="DataMeasuring-footer">
                <p className="Copyright">Copyright © 2020 | Aristotle University of Thessaloniki | Thesis Dimitra Ntzioni</p>
            </div>
          </div>
        );
      }
     
    }
  }
  
  export default DataMeasuring;