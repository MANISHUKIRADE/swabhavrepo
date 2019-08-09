let express = require('express');  
let app = express();  
let http = require('http').Server(app);
let io = require('socket.io')(http);
app.use(express.static(__dirname + '/node_modules'));
app.get('/', function(req, res,next) {  
    res.sendFile(__dirname + '/index1.html');
})
var clients = 0;
io.on('connection', function (socket) {
    clients++;
    io.sockets.emit('broadcast', {
        description: clients + ' clients connected!'
    });
    socket.on('disconnect', function () {
        clients--;
        io.sockets.emit('broadcast', {
            description: clients + ' clients connected!'
        });
    });
});
http.listen(3000, function () {
    console.log('listening on localhost:3000');
});