var mysql = require('mysql')

var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: 'MARCOS',
    database:"MYDATABASE"
})

const pool = mysql.createPool(con)
module.exports = pool;