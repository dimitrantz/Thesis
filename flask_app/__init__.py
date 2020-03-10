from flask import Flask
from config import Config


app = Flask(__name__)
from flask_app import routes
 