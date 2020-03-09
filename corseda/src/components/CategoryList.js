import React, {Component} from "react";
import Category from "./Category";
import axios from 'axios';


class CategoryList extends Component{
  constructor(props){
    super(props)
    this.state = {
      categories: []
    }
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

        
        }, 1000);  
  }

  componentWillUnmount() {
    clearInterval(this.interval);
  }
  render(){
    
    return (
      <div className="category-list">

          {this.state.categories.map(c => 
            
              <Category key={c.category} name={c.category} />
              
            )}
          
      </div>
    );
  }


}


export default CategoryList;