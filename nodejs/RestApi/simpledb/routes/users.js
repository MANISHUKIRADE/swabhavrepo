var express = require('express');
var router = express.Router();
const pool = require('../data/config')
/* GET users listing. */
app.get('/users', (request, response) => {
  pool.query('SELECT * FROM users', (error, result) => {
    if (error) throw error;

    response.send(result);
  });
});

module.exports = router;