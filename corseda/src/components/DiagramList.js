import React, {Component} from "react";

import DistanceDiagram from "./diagrams/DistanceDiagram";
import ElectricDiagram from "./diagrams/ElectricDiagram";
import PressureDiagram from "./diagrams/PressureDiagram";
import SpeedDiagram from "./diagrams/SpeedDiagram";
import PositionDiagram from "./diagrams/PositionDiagram";
import PostureDiagram from "./diagrams/PostureDiagram";
import ImageDiagram from "./diagrams/ImageDiagram";
import AcousticDiagram from "./diagrams/AcousticDiagram";

import axios from 'axios';


class DiagramList extends Component{
  constructor(props){
    super(props)
    this.state = {
        diagrams: []
    }
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
                  switch(c.category){
                    case 'DISTANCE':
                      return {
                        category: c.category,
                        sensor: c.sensor,
                        index: c.index,
                        frequency: c.frequency,
                        maxDistanceAccepted: c.maxDistanceAccepted,
                        minDistanceAccepted: c.minDistanceAccepted,
                        alarmValue: c.alarmValue
                      };
                    case 'ELECTRIC':
                      return {
                        category: c.category,
                        sensor: c.sensor,
                        index: c.index,
                        frequency: c.frequency,
                        alarmValue: c.alarmValue
                      };
                    case 'VISION':
                      return {
                        category: c.category,
                        sensor: c.sensor,
                        index: c.index,
                        frequency: c.frequency,
                        resolution: c.resolution
                      };
                    case 'ACOUSTIC':
                    return {
                      category: c.category,
                      sensor: c.sensor,
                      index: c.index,
                      frequency: c.frequency,
                      recordTime: c.recordTime
                    };
                    case 'POSITION':
                      return {
                        category: c.category,
                        sensor: c.sensor,
                        index: c.index,
                        frequency: c.frequency,
                        origin: c.origin,
                        target: c.target
                      };
                    default:
                      return {
                        category: c.category,
                        sensor: c.sensor,
                        index: c.index,
                        frequency: c.frequency
                      };
                  }
                });
                
                const newState = Object.assign({}, this.state, {
                  diagrams: newDiagrams
                });

                this.setState(newState);
              })
         .catch(function (error) {
           console.log(error);

         });}, 100);
  }

  render(){
    return (
      <div className="diagram-list">
  
            
          {this.state.diagrams.map(c => {

              switch(c.category) {
                case 'DISTANCE':
                  return <DistanceDiagram key={c.sensor} category={c.category} sensor={c.sensor} index={c.index} frequency={c.frequency} minDistanceAccepted={c.minDistanceAccepted} maxDistanceAccepted={c.maxDistanceAccepted} alarmValue={c.alarmValue}/>;
                case 'SPEED':
                  return <SpeedDiagram key={c.sensor} category={c.category} sensor={c.sensor} index={c.index} frequency={c.frequency}/>;
                case 'PRESSURE':
                  return <PressureDiagram key={c.sensor} category={c.category} sensor={c.sensor} index={c.index} frequency={c.frequency}/>;
                case 'POSITION':
                  return <PositionDiagram key={c.sensor} category={c.category} sensor={c.sensor} index={c.index} frequency={c.frequency} origin={c.origin} target={c.target} />;
                case 'VISION':
                  return <ImageDiagram key={c.sensor} category={c.category} sensor={c.sensor} index={c.index} frequency={c.frequency} resolution={c.resolution}/>;
                case 'ACOUSTIC':
                  return <AcousticDiagram key={c.sensor} category={c.category} sensor={c.sensor} index={c.index} frequency={c.frequency} recordTime={c.recordTime}/>;
                case 'ELECTRIC':
                  return <ElectricDiagram key={c.sensor} category={c.category} sensor={c.sensor} index={c.index} frequency={c.frequency} alarmValue={c.alarmValue}/>;
                case 'POSTURE':
                  return <PostureDiagram key={c.sensor} category={c.category} sensor={c.sensor} index={c.index} frequency={c.frequency}/>;  
                  default:      return null;
              }       
            }
          )
          }
        
         
      </div>
    );
  }


}


export default DiagramList;
