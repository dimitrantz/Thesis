# Thesis
Automatic generation of high-level interfaces to collect robot sensor data using the R4A platform


## Abstract
In software engineering, the term automatic programming describes a mechanism that creates a program which in turn allows scientists to code at a higher level of abstraction. Nowadays, robot applications, both in business and home environments are gaining traction, increasing the need for automatic software generation without errors. It is well known that robots are equipped with multitude of sensors, which play a key role in their operation and in accomplishing certain tasks. For this reason, it is often necessary to control the produced data, in order to build software systems. This diploma thesis aspires to take the first steps towards the process of automating the development of ready-to-run interfaces to collect robot sensor data.


Towards this direction, MDE (Model Driven Engineering) is employed. More specifically, once a subtractive model has been defined, a series of transformations takes place, resulting in a fully functional system. This way, the software development process is accelerated and software is produced with greater reliability.


Within the context of this diploma thesis, we have designed and implemented CoRSeDA (Collecting Robot Sensor Data Automatically), a system where the user interacts through a friendly graphical user interface and defines the features for the desired sensors of a robot. Based on the sensors and their parameters, the system generates automatically executable code, based on the R4A platform, to collect data from the specific robot. At the same time, a fully functional interface is generated providing information for the whole system. The data of the system and its sensors are displayed, along with any other information generated, in a web application created for that purpose. 


To test and evaluate this system, experiments were performed on the robot NAO, an autonomous, programmable humanoid robot developed by Aldebaran Robotics.


## Results


## Dependencies
```pip install -r requirements.txt```

### Eclipse Modeling Tools
Download Eclipse Modeling Tools here: http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/oxygen1a (newer versions work fine, checked 12/3/20)

Following the Help->Install New Software,  choose as a repository the version where you downloaded eclipse and enter 'ATL or Atlas Transformation Language' in the search bar.
Then again, following the Help->Install New Software,  choose as a repository the version where you downloaded eclipse and enter 'Acceleo' in the search bar.
Your setup for Eclipse Modeling Tools is now ready to go.

### Import Corseda

- Import as project file the two folders SensorProject,     SensorProjectGenerator and SensorProjectGenerator.ui


- Double click on SensorProject, in the model file right click on sensorProject.genmodel and select GenerateAll

- Open a new run-time and import as project files the tow folders MySensorSystem and SensorProject.odesing

- Open the represantations.aird of the MySensorSystem and start designing your system

- If you have a valid system the right click on MySensorSystem.sensorproject of the MySensorSystem and select "Acceleo Model To Text->Generate Code"

  <u>Attention</u>: In order to work locally you must change the path where images and audios will be saved!

  Open the AcousticSystemBase.mtl and change the path in line 70 to the path where you have extracted the ...."mythesis-app/public/audios/"

  Change also the VisionSystemBase.mtl and chance the path in line 65 to the path where you have extracted the ...."mythesis-app/public/images/"

### R4A Platfrom
```
__________      ___.           __  .__                   _____      _____  .__  .__   
\______   \ ____\_ |__   _____/  |_|__| ____   ______   /  |  |    /  _  \ |  | |  |  
 |       _//  _ \| __ \ /  _ \   __\  |/ ___\ /  ___/  /   |  |_  /  /_\  \|  | |  |  
 |    |   (  <_> ) \_\ (  <_> )  | |  \  \___ \___ \  /    ^   / /    |    \  |_|  |__
 |____|_  /\____/|___  /\____/|__| |__|\___  >____  > \____   |  \____|__  /____/____/
        \/           \/                    \/     \/       |__|          \/        
```
R4A Platform @ Aristotle University of Thessaloniki
https://github.com/robotics-4-all/r4a-framework

## Running tests

<u>Attention</u>:To run CoRSeDA you must first setup the R4A platform at the same network with the robot NAO.

1. open terminal

2. cd /r4a-framework/

3. source setup.sh

4. r4a-core-init nao



To run the generated code

1. open terminal

2. python main.py (of the files generated)


To run the generated API and the web application

1. open terminal

2. activate the virtual environment 'thesisenv'

3. run the flask app

4. run the react app
