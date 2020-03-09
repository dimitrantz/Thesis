import React,  { Component } from "react";
import '../css/Audio.css';
import axios from 'axios';

class Music extends Component {
    constructor(props) {
    super(props);
    this.state = {
      audio:' ',
      loading: true,
      play: false,
      pause: true,
    };
    
    this.urlPathId = props.name;
    this.generalPath = "http://127.0.0.1:3001/measurement/one/";
    this.generalParentPath = this.generalPath.concat(props.parentId + "/");
    this.path = this.generalParentPath.concat(this.urlPathId);
    this.audio = new Audio(this.path);
  }


  componentDidMount(){
    axios.get(this.path, {
      method: 'GET',
      headers: {
      'Access-Control-Allow-Origin': '*',
      'Content-Type': 'audio/wav',
      }
      }).then(audio => {
    
        this.setState({audio, loading:false});
        
      }).catch(function (error) {
           console.log(error);

         });
  }

  play = () => {
        this.setState({ play: true, pause: false });
        this.audio.play();
  }
    
  pause = () => {
        this.setState({ play: false, pause: true });
        this.audio.pause();
  }
    
  render(){
    
    if (this.state.loading) {
      return <h4>loading</h4>;
    }
    return (
      <div className="audio_buttons">
        <p>File name: <br/>{this.props.name}</p>
        <div className="button-box">
         <button onClick={this.play}>Play ►</button>
         <button onClick={this.pause}>Pause ⌷⌷</button>
      
        </div>
        </div>
    );
  }
  
  
}

export default Audio;