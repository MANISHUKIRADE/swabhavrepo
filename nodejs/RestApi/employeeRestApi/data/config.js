var mysql = require('mysql')

const configUrl = {
    host: "localhost",
    user: "root",
    password: 'MARCOS',
    database: "MYDATABASE",

}
console.log("config")
const pool = mysql.createPool(configUrl);

module.exports = pool;