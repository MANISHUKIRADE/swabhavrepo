const url = "mongodb+srv://MANISH:MANISH%409797@cluster0-qdzy9.mongodb.net/task-manager"
const mongoose = require('mongoose')
let connection=mongoose.createConnection(url, {
    useNewUrlParser: true
})
/*let userSchema = new mongoose.Schema({
    name: {
        fname: String,
        lname: String
    },
    username: String,
    password: String,
    mobileno: String,
    registerdate: Date,
    Task: [{
        tasktitle: String,
        taskdiscription: String,
        taskcreated: Date,
        taskDate: Date,
        subtask: [{
            tasktitle: String,
            taskdiscription: String,
            taskcreated: Date,
            taskDate: Date
        }]
    }]

})
let User = connection.model('User', userSchema)
let user1 = new User({
    name: {
        fname: 'Ratnesh',
        lname: 'Dubey'
    },
    username: 'Ratnesh123',
    password: 'Ratnesh###@123',
    mobileno: '8691983106',
    Task: [{
        tasktitle: "testScema",
        taskdiscription: "TestingSchmea",
        taskDate: '09/07/1997',
        subtask: [{
            tasktitle: 'subtasktest',
            taskdiscription: 'tasktest',

            taskDate: '09/07/1997'
        }]
    }]

})
user1.save().then(doc => {
        console.log(doc)
    })
    
    .catch(err => {
        console.log(err)
    })*/

    connection.collection('users').createIndex({username:1},{ unique: true })