const express = require('express');
const MongoClient = require('mongodb');
var bodyParser = require('body-parser')
const port = 3000;
var app = express();
const url = "mongodb+srv://MANISH:MANISH%409797@cluster0-qdzy9.mongodb.net"

MongoClient.connect(url, {
    useNewUrlParser: true
}, (err, db) => {
    if (err) throw err;
    database = db.db('companydata');
})
app.use(bodyParser.urlencoded({
    extended: false

}))




app.use(bodyParser.json());
app.get('/api/v2/Department/', (request, response) => {

    database.collection('Department').find({}, {
        projection: {
            _id: 1,
            DNAME: 1,
            LOC: 1
        }
    }).toArray((err, result) => {
        if (err) throw err;
        response.send(result)
    })
})
app.get('/api/v2/Department/:DEPID', (request, response) => {
    var id = request.params.DEPID;

    database.collection('Department').findOne({
        _id: Number(id)
    }, {
        projection: {
            _id: 1,
            DNAME: 1,
            LOC: 1
        }
    }, (err, result) => {
        if (err) throw err;
        response.send(result)
    })
})
app.post('/api/v2/Department', (request, response) => {
    if (request.body.employee == undefined || request.body.employee == null) {
        var Dept = {
            _id: request.body._id,
            DNAME: request.body.DNAME,
            LOC: request.body.LOC,
            employee: []
        }
    } else {
        var Dept = {
            _id: request.body._id,
            DNAME: request.body.DNAME,
            LOC: request.body.LOC,
            employee: request.body.employee,
        }
    }

    database.collection('Department').insertOne(Dept, (err, res) => {
        if (err) throw err;
        response.send(res);
    })
})
app.delete('/api/v2/Department/:DEPID', (request, response) => {
    id = request.params.DEPID;
    database.collection('Department').remove({
        _id: Number(id)
    }, (err, res) => {
        if (err) throw err;
        response.send(res)
    })
})
app.put('/api/v2/Department', (request, response) => {

    var id = request.body._id
    var DNAME = request.body.DNAME
    var LOC = request.body.LOC
    
    database.collection('Department').updateOne({
        _id: Number(id)
    }, {
        $set: {
            DNAME: DNAME,
            LOC: LOC
        }
    }, (err, res) => {
        if (err) throw err;
        response.send(res);
    })

})
app.get('/api/v2/Employee',(request,response)=>{
    database.collection('Department').find({}).project({employess:1,'size.uom': 1 }).toArray((err,res)=>{
        if(err) throw err;
        response.send(res);
    })
})


app.listen(port, () => console.log(`Example app listening on port ${port}!`))