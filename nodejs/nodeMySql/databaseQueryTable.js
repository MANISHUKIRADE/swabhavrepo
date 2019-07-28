var mysql = require('mysql')

var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: 'MARCOS',
    database:"MYDATABASE"
})
con.connect(function(err){
    if(err) throw err;
    con.query ("INSERT INTO users (name, email)    VALUES ('Richard Hendricks', 'richard@piedpiper.com'), ('Bertram Gilfoyle',  'gilfoyle@piedpiper.com')",function(err){
        if(err) throw err;
        console.log("TAble CreatedS")
    })
})


