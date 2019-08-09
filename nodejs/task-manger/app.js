const express = require('express')
const bodyParser = require('body-parser')
const usercontroller = require('./controllers/userController')
const taskController = require('./controllers/taskController')
var cors = require('cors')

const port = 9000
let app = express();
app.use(cors())
app.use(bodyParser.urlencoded({
  extended: false
}));
app.use(bodyParser.json());
app.use(express.static('public'))
let server = require('http').createServer(app)
let usercontrol = new usercontroller(app)
let taskcontrol = new taskController(app)
var swaggerJSDoc = require('swagger-jsdoc');
var swaggerDefinition = {
  openapi: '3.0.0',
  info: {
    title: 'TaskManager API documentation',
    version: '0.0.1',
    description: '<h2>CopyRight &copy; SwabhavTechlabs<h2>',
  },
  host: `localhost:${port}`,
  basePath: '/',
};

var options = {
  // import swaggerDefinitions
  swaggerDefinition: swaggerDefinition,
  // path to the API docs
  apis: ['./controllers/*.js'],
};
var swaggerSpec = swaggerJSDoc(options);
app.get('/swagger.json', function (req, res) {
  res.setHeader('Content-Type', 'application/json');
  res.send(swaggerSpec);
});
//swagger ends
app.get('/spa/',(req,res)=>{
  res.sendFile('./public/index.html')
})
server.listen(port)