from flask import  Flask, jsonify, request, render_template, send_from_directory, send_file, make_response, Response
from flask_cors import CORS

from PIL import Image
import wave, struct
from scipy.io import wavfile

import numpy as np
import os
from io import BytesIO 
from io import StringIO

import redis
from ast import literal_eval

from flask_app import app
CORS(app, resources={r"/*": {"origins": "*"}})
APP_ROOT = os.path.dirname(os.path.abspath(__file__))
redis_host = "localhost"
redis_port = 6379
redis_password = ""

@app.route('/', methods=['GET'])
@app.route('/index', methods=['GET'])
def home():
    return render_template('index.html')



@app.route('/logo')
def get_logo():
    return send_from_directory('./templates', 'logo_corseda.png')



@app.route('/categories')
def get_categories():

    categories_ids = retrieve_categories()
    return jsonify({'categories': categories_ids})
    


@app.route('/info/<name>')
def get_info(name):
    redisInfo = retrieve_sensor_info(name)
    return jsonify({'sensor_info': redisInfo})



@app.route('/sensors_parameters')
def get_sensors_parameters():  
    
    
    redisDiagramTitles = retrieve_sensors_parameters()
    redisDiagramTitles = sorted(redisDiagramTitles, key=lambda tup: 'category')
    return jsonify({'sensors_parameters': redisDiagramTitles})
   


@app.route('/sensors_parameters/<name>')
def get_sensor_parameters(name):  
    
    
    redisDiagramTitles = retrieve_sensors_parameters()
    
    for sensor in redisDiagramTitles:
        if name == sensor['sensor']:
            return jsonify({'sensor_parameters': sensor})



@app.route('/sensors_parameters/names')
def get_sensor_parameters_names():  
    
    
    redisDiagramTitles = retrieve_sensors_parameters()
    names = list()
    for sensor in redisDiagramTitles:
        names.append(sensor['sensor'])
    names = sorted(names)
    return jsonify({'sensors_names': names})
 


@app.route('/sensors_parameters/category/<name>')
def get_sensors_per_category(name):  
    
    sensors = list()
    redisDiagramTitles = retrieve_sensors_parameters()
    
    for sensor in redisDiagramTitles:
        if name == sensor['category']:
            sensors.append(sensor)
    return jsonify({'category_sensors': sensors})
    


@app.route('/measurements/all/<name>')
def get_all_measurements(name):
    
    redisDiagramTitles = retrieve_sensors_parameters()
    
    
    for sensor in redisDiagramTitles:
        sensorMeasurements = list()
        if sensor['sensor'] == name:       
                        
            sensorMeasurements = retrieve_all_measurements(name)
           
            return jsonify({'measurements': sensorMeasurements})
            
    return jsonify({'error': "Unexpected Error, sensors_patameters are not retrieved from redis database"})



@app.route('/measurements/last/<name>/<number>')
def get_last_measurements(name, number):
    
    redisDiagramTitles = retrieve_sensors_parameters()
        
    for sensor in redisDiagramTitles:
        
        if sensor['sensor'] == name:       
            
            sensorMeasurements = list()
            sensorMeasurements = retrieve_last_measurements(name, number)
            return jsonify({'measurements': sensorMeasurements})
            
    return jsonify({'error': "error"})



@app.route('/measurements/last/<name>')
def get_last_measurement(name):
    
    redisDiagramTitles = retrieve_sensors_parameters()
    
    for sensor in redisDiagramTitles:
        
        if sensor['sensor'] == name:       
            
            sensorMeasurement = retrieve_last_measurement(name)
            return jsonify({'measurements': sensorMeasurement})
                        
    return jsonify({'error': "error"})   
            



@app.route('/measurement/one/<sensorName>/<name>')
def get_image(sensorName,name):
    def generate(path):
                    with open(path, "rb") as fwav:
                        data = fwav.read(1024)
                        while data:
                            yield data
                            data = fwav.read(1024)    
     
    redisDiagramTitles = retrieve_sensors_parameters()
    
    category = ' '
    sensorMeasurements = list()
    
    for sensor in redisDiagramTitles: 
        if sensor['sensor'] == sensorName:

            category = sensor['category']
            sensorMeasurements = retrieve_all_measurements(sensorName)
            
    
    if category == 'VISION':
        
        for pic in sensorMeasurements:
            
            if pic['data'] == name:
                
                img = Image.open('./images/'+name, 'r')
                img_io = BytesIO()
                img.save(img_io, format='PNG', quality=70)
                img_io.seek(0)
                return send_file(img_io, mimetype='image/png')

    elif category == 'ACOUSTIC':
        

        for audioFile in sensorMeasurements:
            if audioFile['data'] == name:
                path = './audios/'+name
                
                return Response(generate(path), mimetype="audio/x-wav")
    



def retrieve_sensor_info(key):
    '''Retrieves from redis technical information about a sensor of the system.'''

    r = redis.StrictRedis(host=redis_host, port=redis_port,\
                          password=redis_password, decode_responses=True)
    new_key = 'info_' + key
    if (new_key) in r.keys():
        
        retrievedMessage = r.lrange(new_key, 0, -1)
        message = str(retrievedMessage)
        message = literal_eval(message) 

        return message
    



def retrieve_sensors_parameters():

    r = redis.StrictRedis(host=redis_host, port=redis_port,\
                          password=redis_password, decode_responses=True)

    sensors_parameters = list()
   
    redisDiagramTitles = r.lrange("sensors_parameters",0,-1)
    
    for diagramTitle in redisDiagramTitles:
        diagramTitle =  str(diagramTitle)
        diagramTitle = literal_eval(diagramTitle)
        sensors_parameters.append(diagramTitle)
    return sensors_parameters



def retrieve_categories():
    '''Retrieves from redis the categories of the system.'''

    r = redis.StrictRedis(host=redis_host, port=redis_port,\
                          password=redis_password, decode_responses=True)

    categories_ids = []
    redisCategories = r.lrange('categories',0,-1)
    
    for category in redisCategories:
        category =  str(category)
        categories_ids.append({"category": category})

    categories_ids = sorted(categories_ids)
    return categories_ids



def retrieve_last_measurement(key):
    '''Retrieves from redis the last measurement associated to a specific key.'''
    
    r = redis.StrictRedis(host=redis_host, port=redis_port,\
                          password=redis_password, decode_responses=True)
    
    if (key) in r.keys():
        
        retrievedMessage = r.lrange(key, 0, 0)
        message = str(retrievedMessage)
        message = literal_eval(message)         
        
        return message



def retrieve_all_measurements(key):
    '''Retrieves from redis all measurements associated to a specific key.'''
       
    r = redis.StrictRedis(host=redis_host, port=redis_port,\
                          password=redis_password, decode_responses=True)
    
    if (key) in r.keys():
        
        retrievedMessage = r.lrange(key, 0, -1)
        decodedMessage = list()
        for message in retrievedMessage:
            message = str(message)
            message = literal_eval(message)
            decodedMessage.append(message)
        
        return decodedMessage
   



def retrieve_last_measurements(key, number):
    '''Retrieves from redis the last <number> of measurements associated to a specific sensor.'''
       
    r = redis.StrictRedis(host=redis_host, port=redis_port,\
                          password=redis_password, decode_responses=True)
    number = int(number) -1
    if (key) in r.keys():

        if number != 0:
    
            retrievedMessage = r.lrange(key, 0, number)
            decodedMessage = list()
            for message in retrievedMessage:
                message = str(message)
                message = literal_eval(message)
                decodedMessage.append(message)

            return decodedMessage
        else:
            retrievedMessage = r.lrange(key, 0, 0)
            message = str(retrievedMessage)
            message = literal_eval(message)         
        
            return message