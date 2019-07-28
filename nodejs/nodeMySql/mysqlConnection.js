var mysql = require('mysql');

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "MARCOS"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
  con.query("CREATE DATABASE MYDATABASE",function(){
    if(err) throw err;
    console.log("DATABASE Created")
  })
});
