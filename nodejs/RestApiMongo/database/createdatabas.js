const MongoClient = require('mongodb').MongoClient;
const url = "mongodb+srv://MANISH:MANISH%409797@cluster0-qdzy9.mongodb.net"

/*MongoClient.connect(url,{useNewUrlParser:true},function(err,res){
    if(err) throw err;
    console.log("Database Creted")

})*/
MongoClient.connect(url, {
    useNewUrlParser: true
}, function (err, db) {
    if (err) throw err;
    var database = db.db("companydata");
    var deptObj = [{
        _id: 10,
        DNAME: "ACCOUNTING",
        LOC: "NEW YORK",
        employess:[
            {
        "_id": 7839,
        "ENAME": "KING",
        "JOB": "PRESIDENT",
        "MGR": null,
        "SAL": 5000,
        "COMM": null,
        "DEPTNO": 10
    },{
        "_id": 7782,
        "ENAME": "CLARK",
        "JOB": "MANAGER",
        "MGR": 7839,
        "SAL": 2450,
        "COMM": null,
        "DEPTNO": 10
    },{
        "_id": 7934,
        "ENAME": "MILLER",
        "JOB": "CLERK",
        "MGR": 7782,
        "SAL": 1300,
        "COMM": null,
        "DEPTNO": 10
    }, {
        "_id": 9797,
        "ENAME": "MANISH",
        "JOB": "MANAGER",
        "MGR": 1000,
        "SAL": 1200,
        "COMM": 12,
        "DEPTNO": 10
    }

        ]
    }, {
        _id: 20,
        DNAME: "RESEARCH",
        LOC: "DALLAS",
        employess:[
{
        "_id": 7369,
        "ENAME": "SMITH",
        "JOB": "CLERK",
        "MGR": 7902,
        "SAL": 800,
        "COMM": null,
        "DEPTNO": 20
    },{
        "_id": 7566,
        "ENAME": "JONES",
        "JOB": "MANAGER",
        "MGR": 7839,
        "SAL": 2975,
        "COMM": null,
        "DEPTNO": 20
    }, {
        "_id": 7788,
        "ENAME": "SCOTT",
        "JOB": "ANALYST",
        "MGR": 7566,
        "SAL": 3000,
        "COMM": null,
        "DEPTNO": 20
    }, {
        "_id": 7876,
        "ENAME": "ADAMS",
        "JOB": "CLERK",
        "MGR": 7788,
        "SAL": 1100,
        "COMM": null,
        "DEPTNO": 20
    }, {
        "_id": 7788,
        "ENAME": "SCOTT",
        "JOB": "ANALYST",
        "MGR": 7566,
        "SAL": 3000,
        "COMM": null,
        "DEPTNO": 20
    },{
        "_id": 7902,
        "ENAME": "FORD",
        "JOB": "ANALYST",
        "MGR": 7566,
        "SAL": 3000,
        "COMM": null,
        "DEPTNO": 20
    }
        ]
    }, {
        _id: 30,
        DNAME: "SALES",
        LOC: "CHICAGO",
        employess:[{
        "_id": 7499,
        "ENAME": "ALLEN",
        "JOB": "SALESMAN",
        "MGR": 7698,
        "SAL": 1600,
        "COMM": 300,
        "DEPTNO": 30
    }, {
        "_id": 7521,
        "ENAME": "WARD",
        "JOB": "SALESMAN",
        "MGR": 7698,
        "SAL": 1250,
        "COMM": 500,
        "DEPTNO": 30
    }, {
        "_id": 7654,
        "ENAME": "MARTIN",
        "JOB": "SALESMAN",
        "MGR": 7698,
        "SAL": 1250,
        "COMM": 1400,
        "DEPTNO": 30
    }, {
        "_id": 7698,
        "ENAME": "BLAKE",
        "JOB": "MANAGER",
        "MGR": 7839,
        "SAL": 2850,
        "COMM": null,
        "DEPTNO": 30
    } , {
        "_id": 7844,
        "ENAME": "TURNER",
        "JOB": "SALESMAN",
        "MGR": 7698,
        "SAL": 1500,
        "COMM": 0,
        "DEPTNO": 30
    } , {
        "_id": 7900,
        "ENAME": "JAMES",
        "JOB": "CLERK",
        "MGR": 7698,
        "SAL": 950,
        "COMM": null,
        "DEPTNO": 30
    }]
    }, {
        _id: 40,
        DNAME: "OPERATIONS",
        LOC: "BOSTON"
    }, {
        _id: 90,
        DNAME: "ACCOUNTING",
        LOC: "PUNE"
    }, {
        _id: 100,
        DNAME: "ACCOUNTING",
        LOC: "PUNE"
    }]
    database.collection("Department").insertMany(deptObj, function (err, res) {
        if (err) throw err;
        console.log(res);
        db.close();
    })
})
/*MongoClient.connect(url,{useNewUrlParser:true},function(err,db){
    if(err) throw err;
    var database = db.db("companydata")
    database.dropCollection("Department",function(err,res){
        if(err) throw err;
        console.log(res)
    })
})*/
/*
MongoClient.connect(url, {
    useNewUrlParser: true
}, (err, db) => {
    if (err) throw err;
    var database = db.db("companydata")
    var employees = [, , , ]
    database.collection("Employee").insertMany(employees, (err, res) => {
        if (err) throw err;
        console.log(res);
    })
})*/



