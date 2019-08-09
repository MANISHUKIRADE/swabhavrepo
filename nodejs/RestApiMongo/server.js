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
/*
db.school.aggregate([
{ $unwind :'$students'},
{ $project : { _id:0, rollNo : '$students.rollNo', name : '$students.name', score : '$students.score' } }
])
{projection: {_id: 1,DNAME: 1,LOC: 1 } }
*/

app.get('/api/v2/Employee',(request,response)=>{
database.collection('Department').aggregate({$unwind:'$employess'},{$project:{_id:0 ,Empid: '$employess._id' ,Empname: '$employess.ENAME',JoB:'$employess.JOB',Mgr:'$employess.MGR',Sal:'$employess.SAL',comm:'$employess.COMM',Depno:'$employess.DEPTNO'}},{projection: {_id: 0,DNAME: 0,LOC: 0 } }).toArray((err,res)=>{
if(err) throw err;
response.send(res);
})
})
app.get('/api/v2/Employee/:Eid',(request,response)=>{
    let Empid= Number (request.params.Eid)
    database.collection('Department').aggregate({$unwind:'$employess'},{ $match : {'employess._id': { $eq : Empid} }},{$project:{_id:0 ,Empid: '$employess._id' ,Empname: '$employess.ENAME',JoB:'$employess.JOB',Mgr:'$employess.MGR',Sal:'$employess.SAL',comm:'$employess.COMM',Depno:'$employess.DEPTNO'}},{projection: {_id: 0,DNAME: 0,LOC: 0 } }).toArray((err,res)=>{
        if(err) throw err;
        response.send(res)
    })
    
})
/*
db.test.update({},{$pull: {"attendance.$.students": {"studentId":{$in:[1,2,3]}}}},{multi:true})
db.lists.update({}, {$pull:{listItems:{productImage:{$exists:false}}}}, false, true)
db.person.find({}).forEach(function(doc) {

	var address = doc.addresses;
	for(var i = 0; i < address.length; ++i) { 
		var x = address[i];
		delete (x["state"]);
		
	}
	db.person.save(doc);

});
*/
app.delete('/api/v2/Employee/:Eid',(request,response)=>{
    let Empid = Number(request.params.Eid)
    database.collection('Department').updateOne({},{$pull:{employess:{_id:Empid}}},{multi:true},(err,res)=>{
        if(err) throw err;
        response.send(res)
    })
})
app.post('/api/v2/Employee/',(request,response)=>{
   let  employee= {"_id": Number (request.body.Empid),
   "ENAME": request.body.Empname,
   "JOB": request.body.JoB,
   "MGR": request.body.Mgr,
   "SAL": Number (request.body.Sal),
   "COMM":Number (request.body.comm),
   "DEPTNO":Number(request.body.Depno)}
   database.collection('Department').updateOne({"_id":employee.DEPTNO},{$push:{employess:employee}},(err,res)=>{
       if(err) throw err;
       response.send(res)
   })
})

app.listen(port, () => console.log(`Example app listening on port ${port}!`))