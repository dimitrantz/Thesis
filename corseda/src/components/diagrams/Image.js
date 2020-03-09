import React,  { Component } from "react";
import Timestamp from 'react-timestamp';
import "../css/Image.css";
import axios from 'axios';

class Image extends Component {
  constructor(props){
    super(props)
    this.state = {
        image: "",
        loading: true
    }
    
    this.urlPathId = props.id;
    this.generalPath = "http://127.0.0.1:3001/measurement/one/";
    this.generalParentPath = this.generalPath.concat(props.parentId + "/");
    this.path = this.generalParentPath.concat(this.urlPathId);
  }


  componentDidMount(){

    axios.get(this.path, {
      method: 'GET',
      headers: {
      'Access-Control-Allow-Origin': '*',
      'Content-Type': 'image/png',
      }
      }).then(image => {
    
        this.setState({image, loading:false});
        
      }).catch(function (error) {
           console.log(error);

         });
  }
  
  render(){
    if (this.state.loading) {
        return <h4>loading</h4>;
      }
  
      return (
        <div className="captured_image">
            <img src={this.path} alt="logo" />
            <p className="desc">Date: <Timestamp time={this.props.timestamp} format='full' includeDay /></p>
                           
                    
        </div>
      );
    }
        
}

export default Image;