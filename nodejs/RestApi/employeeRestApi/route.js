const express = require('express')
const pool = require('./data/config')
var bodyParser = require('body-parser')
var cors = require('cors')


var app = express();
const port = 8000
app.use(bodyParser.urlencoded({
    extended: false
}));
app.use(bodyParser.json());
app.use(cors())

app.get('/api/v1/employee', (request, response) => {
    pool.query("SELECT * FROM EMP ", function (err, result, fields) {
        if (err) throw err;
        console.log("req")
        response.send(result)
    });



});
app.get('/api/v1/employee/:EMPNO', (request, response) => {
    var empno = request.params.EMPNO
    pool.query("SELECT * FROM EMP Where EMP.EMPNO = " + empno, function (err, result, fields) {
        if (err) throw err;
        response.send(result)
    })
})
app.delete('/api/v1/employee/:EMPNO', (request, response) => {
    var empno = request.params.EMPNO;
    pool.query("DELETE FROM EMP WHERE EMP.EMPNO =" + empno, function (err, result) {
        if (err) throw err;
        response.send(result);
    })
})
app.post('/api/v1/employee/', (request, response) => {
    var EMPNO = request.body.EMPNO;
    var ENAME = request.body.ENAME;
    var JOB = request.body.JOB;
    var MGR = request.body.MGR;
    var SAL = request.body.SAL;
    var COMM = request.body.COMM;
    var DEPTNO = request.body.DEPTNO;
    console.log(request.body)
    var data = [
        [EMPNO, ENAME, JOB, MGR, SAL, COMM, DEPTNO]
    ]
    var sql = "INSERT INTO EMP (EMPNO,ENAME,JOB,MGR,SAL,COMM,DEPTNO) VALUES ?"
    pool.query(sql, [data], function (err, result) {
        if (err) throw err;
        response.send(result);
    })
})
app.put('/api/v1/employee', (request, response) => {
    var EMPNO = request.body.EMPNO;
    var ENAME = request.body.ENAME;
    var JOB = request.body.JOB;
    var MGR = request.body.MGR;
    var SAL = request.body.SAL;
    var COMM = request.body.COMM;
    var DEPTNO = request.body.DEPTNO;
    console.log(request.body)
    var data = [ENAME, JOB, MGR, SAL, COMM, DEPTNO, EMPNO]
    var sql = `UPDATE EMP 
    SET ENAME= ? ,JOB= ? ,MGR= ? ,SAL= ?, COMM= ? ,DEPTNO= ? 
    WHERE EMPNO= ? `;
    pool.query(sql, data, function (err, result) {
        if (err) throw err;
        response.send(result);
    })
})
app.get('/api/v1/Department', (request, response) => {
    pool.query("SELECT * FROM DEPT ", function (err, result, fields) {
        if (err) throw err;
        response.send(result);
    })
})
app.get('/api/v1/Department/:DEPNO', (request, response) => {
    var depno = request.params.DEPNO;
    pool.query("SELECT * FROM DEPT WHERE DEPTNO=" + depno, function (err, result, fields) {
        if (err) throw err;
        response.send(result);
    })
})
app.post('/api/v1/Department', (request, response) => {
    var depno = request.body.DEPTNO;
    var depname = request.body.DNAME;
    var loc = request.body.LOC;
    var sql = "INSERT INTO DEPT (DEPTNO,DNAME,LOC) VALUES ?"
    var values = [
        [depno, depname, loc]
    ]
    pool.query(sql, [values], function (err, result) {
        if (err) throw err;
        response.send(result)
    })
})

app.delete('/api/v1/Department/:DEPTNO', (request, response) => {
    var depno = request.params.DEPTNO
    pool.query("DELETE FROM DEPT WHERE DEPTNO =" + depno, function (err, result) {
        if (err) throw err;
        response.send(result)
    })
})
app.put('/api/v1/Department/', (request, response) => {
    var depno = request.body.DEPTNO;
    var depname = request.body.DNAME;
    var loc = request.body.LOC;
    console.log(request.body)
    var sql = `UPDATE DEPT
SET DNAME= ? , LOC= ?
WHERE DEPTNO= ? `;
    var values = [depname, loc, depno];
    pool.query(sql, values, function (err, result) {
        if (err) throw err;
        response.send(result);
    })
})
app.listen(port, () => console.log(`Example app listening on port ${port}!`))