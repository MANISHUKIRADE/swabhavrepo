let express = require('express');  
let app = express();  
let server = require('http').createServer(app);  
let io = require('socket.io')(server);

app.use(express.static(__dirname + '/node_modules'));  
app.get('/', function(req, res,next) {  
    res.sendFile(__dirname + '/index.html');
});
let counter =1;
io.on('connection', function(client) {
    client.emit('assign','user'+ counter++)
    client.on('join', function(data) {
       console.log(data);
       
    });
   
    client.on('helloMessage',function(data){
        console.log(data)
        client.emit('serverMessage',"Hello From server")
    })
    client.on('disconnect',function(){
        console.log("disconnected")
        counter--;
    })
});

server.listen(4200);