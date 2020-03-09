import React,  { Component } from "react";
import '../css/Diagram.css';
import axios from 'axios';
import Timestamp from 'react-timestamp';
import Audio from '../diagrams/Audio';


class AcousticDiagram extends Component {
  constructor(props){
    super(props)
    this.state = {
        audioIDs: [],
        category: ' ',
        sensor: ' ',
        index: ' ',
        frequency: ' ',
        recordTime: ' ',
        isVisible: true
    } 
    this.urlPathId = props.sensor;
    this.generalPath = "http://127.0.0.1:3001/measurements/last/";
    this.pathId = this.generalPath.concat(this.urlPathId);
    this.path = this.pathId.concat("/4");
      
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
      'Content-Type': 'multipart/form-data',
      }
      }).then(response => {
              
          const audioIds = response.data.measurements.map(c => {
            
            return {
              name: c.data,
              timestamp: c.timestamp
            };
            
          });
          
          const newState = Object.assign({}, this.state, {
            audioIDs:   audioIds
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
        recordTime: props.recordTime
      };
    })
    this.interval = setInterval(() => {
      axios.get(this.path, {
        method: 'GET',
        headers: {
        'Access-Control-Allow-Origin': '*',
        'Content-Type': 'multipart/form-data',
        }
        }).then(response => {
                
            const audioIds = response.data.measurements.map(c => {
              
              return {
                name: c.data,
                timestamp: c.timestamp
              };
              
            });
            
            const newState = Object.assign({}, this.state, {
              audioIDs:   audioIds
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
          recordTime: props.recordTime
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
      return (
        <div className="diagram">
            <div className="diagram-title-before">
              <p>Category: {this.state.category} | Sensor: {this.state.sensor} <br/> TYPE: {this.state.index} | Refresh Rate: {this.state.frequency}sec | Record Time: {this.state.recordTime}sec</p>
              <button onClick={this.handleClick}>
                {this.state.isVisible ? 'HIDE' : 'SHOW'}
              </button> 
            </div> 
            <div className="diagram-title">
                    <div className="subtitle">Audios Recorded</div>
                    <div className="subtitle">Date of Record</div>
            </div>    
            <div className="diagram-box">
                
              <div className="diagram-measurements">
                                 
                {this.state.audioIDs.map(c => 
                      <div className='data_measure'>
                          <Audio key={c.name} name={c.name} parentId={this.urlPathId} />
                          <p class="colB"><Timestamp key={c.timestamp} time={c.timestamp} format='full' includeDay />   </p>             
                      
                      </div>
                )}

              </div>
                
            </div>
        </div>
      );
      }else{
        return(
          <div className="diagram">
            <div className="diagram-title-before">
              <p>Category: {this.state.category} | Sensor: {this.state.sensor} <br/> TYPE: {this.state.index} | Refresh Rate: {this.state.frequency}sec | Record Time: {this.state.recordTime}sec</p>
              <button onClick={this.handleClick}>
                {this.state.isVisible ? 'HIDE' : 'SHOW'}
              </button> 
            </div> 
          </div>
        );

      }
    }
}


export default AcousticDiagram;