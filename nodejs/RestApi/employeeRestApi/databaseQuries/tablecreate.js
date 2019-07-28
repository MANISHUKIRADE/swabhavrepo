var mysql = require('mysql')

var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: 'MARCOS',
    database:"MYDATABASE"
})
con.connect(function(err){
    if(err) throw err;
    con.query ("select * FRom  DEPT  ",function(err){
        if(err) throw err;
        console.log("TAble CreatedS")
    })
    /*con.query ("INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');",function(err){
        if(err) throw err;
        console.log("Record Inserted")
    })
    CREATE TABLE DEPT ( DEPTNO integer NOT NULL PRIMARY KEY, DNAME varchar(14),LOC varchar(13) );
    con.query ("INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');",function(err){
        if(err) throw err;
        console.log("Record Inserted")
    })
    con.query ("INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');",function(err){
        if(err) throw err;
        console.log("Record Inserted")
    })
    con.query ("INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');",function(err){
        if(err) throw err;
        console.log("Record Inserted")
    })
    con.query ("CREATE TABLE EMP ( EMPNO integer NOT NULL, ENAME  varchar(10),JOB  varchar(9),MGR  integer   REFERENCES EMP (EMPNO), HIREDATE            DATETime, SAL                 integer, COMM                integer,DEPTNO              integer NOT NULL,CONSTRAINT EMP_FOREIGN_KEY FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO),CONSTRAINT EMP_PRIMARY_KEY PRIMARY KEY (EMPNO)) ",function(err){
        if(err) throw err;
        console.log("Record Inserted")
    })*/
  /* con.query ("INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,1300,NULL,10)",function(err){
        if(err) throw err;
        console.log("Record Inserted")
    })*/
})




