let express = require('express')
let app = express();
let server = require('http').createServer(app)
let io = require('socket.io')(server);
//let mns = io.of('/mynamespace')
let message = []
let users = [];
let username;

app.use(express.static(__dirname + '/node_modules'))
io.on('connection', function (client) {
    client.on('sendmesg', function (input) {

        message.push(input);
        console.log(message)
        io.emit('broadcast', message)
    })
    io.on('useradded', function (data) {
        users.push(data)

        io.emit('connectionsuccess', message)
    })
    async function deleteUser(id) {
        for (index = 0; index < message.length; index++) {
            if (id == message[index].sid) {
                message.splice(index, 1)
               continue;
            }else{
                continue;
            }

        }
        return true;
    }

    client.once('disconnect', function () {

        async function ops() {
            let flagcomplition = await deleteUser(client.id)
            if (flagcomplition == true) {
                io.emit('usersub', message)
            }
        }
    
        ops()
    })
})


app.get('/', (req, res, next) => {
    res.sendFile(__dirname + '/index.html')
})

server.listen(3000);