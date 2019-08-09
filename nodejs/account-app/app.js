const express = require('express')
const app = express()

const server = require('http').createServer(app)
const contactcontroller = require('./controllers/contactcontroller')
app.get('/api/v1/contacts',async(reqest,response,next)=>{
  let data = await contactcontroller.getContacts()
   response.send(data)
})
app.get('/api/v1/contacts/:id',async(reqest,response)=>{
   let id = reqest.params.id;
   let data = await contactcontroller.getContact(id)
   response.send(data)
})
const port=9000;

app.use(express.static('public'))

//swagger starts
var swaggerJSDoc = require('swagger-jsdoc');
var swaggerDefinition = {
  openapi: '3.0.1' ,
  info: {
    title: 'Contact API documentation',
    version: '1.0.0',
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
app.get('/swagger.json', function(req, res) {
  res.setHeader('Content-Type', 'application/json');
  res.send(swaggerSpec);
});
//swagger ends


server.listen(port)