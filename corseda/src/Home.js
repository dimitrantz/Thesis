import React, { Component } from 'react';

import './css/Home.css';


class Home extends Component {
  render() {
    return (
      
    <body className="Home-content">

        <div className="Home-body">
            <h4>Thesis Abstract</h4>
            <p className="Description">
            In software engineering, the term automatic programming describes 
            a mechanism that creates a program which in turn allows scientists 
            to code at a higher level of abstraction. Nowadays, robot applications, 
            both in business and home environments are gaining traction, increasing 
            the need for automatic software generation without errors. It is well 
            known that robots are equipped with multitude of sensors, which play a 
            key role in their operation and in accomplishing certain tasks. For this 
            reason, it is often necessary to control the produced data, in order to 
            build software systems. This diploma thesis aspires to take the first steps 
            towards the process of automating the development of ready-to-run interfaces 
            to collect robot sensor data.     
            <br/><br/>        
            Towards this direction, MDE (Model Driven Engineering) is employed. More specifically, 
            once a subtractive model has been defined, a series of transformations takes place, 
            resulting in a fully functional system. This way, the software development process is 
            accelerated and software is produced with greater reliability.
            <br/><br/>
            Within the context of this diploma thesis, we have designed and implemented CoRSeDA 
            (Collecting Robot Sensor Data Automatically), a system where the user interacts through 
            a friendly graphical user interface and defines the features for the desired sensors of 
            a robot. Based on the sensors and their parameters, the system generates automatically 
            executable code, based on the R4A platform, to collect data from the specific robot. 
            At the same time, a fully functional interface is generated providing information for 
            the whole system. The data of the system and its sensors are displayed, along with any 
            other information generated, in a web application created for that purpose.             
            <br/><br/>
            To test and evaluate this system, experiments were performed on the robot NAO, 
              an autonomous, programmable humanoid robot developed by Aldebaran Robotics.
            </p>
            <h4>Supervisors</h4>
            <p className="Description"> 
            <br/>               
            Assistant Prof: Andreas Symeonidis<br/>
            Postdoctoral Researcher: Christopher Zolotas
            </p>
            
        </div>


        <div className="Home-footer">
            <p className="Copyright">Copyright © 2020 | Aristotle University of Thessaloniki | Thesis Dimitra Ntzioni</p>
        </div>
    </body>
      
    );
  }
}

export default Home;