import React from "react";
import "./css/Category.css";
import axios from 'axios';

class Category extends React.Component {
    constructor(props) {
      super(props);
      this.state = {
        
        name: this.props.name,
        diagrams: [],
        
      };
      
    }


  componentDidMount(){
    axios.get('http://127.0.0.1:3001/categories', {
      method: 'GET',
      headers: {
      'Access-Control-Allow-Origin': '*',
      'Content-Type': 'application/json',
      }

  }).then(response => {
                
                const newCategories = response.data.categories.map(c => {
                  return {
                    category: c.category
                  };
                });
                
                const newState = Object.assign({}, this.state, {
                  categories: newCategories
                });

                this.setState(newState);
                
              })
         .catch(function (error) {
           console.log(error);

         });

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
                    category: c.category,
                    sensor: c.sensor,
                    
                  };
                });
                
                const newState = Object.assign({}, this.state, {
                  diagrams: newDiagrams
                });

                this.setState(newState);
              })
         .catch(function (error) {
           console.log(error);
         }
         )
        }, 1000);  
  }

  componentWillUnmount() {
    clearInterval(this.interval);
  }
  

    render() {
      return (

        <div className="category">
          <div className="category-box">
            
            <div className="dropdown">
                <button className="dropbtn">{this.state.name}</button>
                  <div className="dropdown-content">
                    {this.state.diagrams.map(c => 
                      {if(this.state.name === c.category)
                        return <div className="drpa">{c.sensor}</div>
                      else
                        return null;
                      }
                    )}
                  </div>
            </div>
          </div>
        </div>
        
      );
    }
}



export default Category;