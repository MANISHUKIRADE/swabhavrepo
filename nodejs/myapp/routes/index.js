var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function (req, res, next) {
  res.send('<p>Username: ' + req.query['first_name'] + '</p><p>Lastname: ' + req.query['last_name'] + '</p>');
});

module.exports = router;