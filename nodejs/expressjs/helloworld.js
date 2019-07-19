const express = require('express')
const app = express()
const port = 3000
const crypto = require('crypto');
const algorithm = 'aes-256-cbc';
const key = crypto.randomBytes(32);
const iv = crypto.randomBytes(16);

var myLogger = function (req, res, next) {
    console.log('LOGGED')
    next()
}

var  encrypt=function(text) {
    let cipher = crypto.createCipheriv('aes-256-cbc', Buffer.from(key), iv);
    let encrypted = cipher.update(text);
    encrypted = Buffer.concat([encrypted, cipher.final()]);
    return { iv: iv.toString('hex'), encryptedData: encrypted.toString('hex') };
   }
app.use(myLogger)
//app.use(encrypt)
function modify(req, res, next){
    res.body = res.body + "modified";
    console.log(res.cipher)  
    next();
  }
app.get('/', (req, res) => {
    console.log(res)
    res.send('Hello World!')
})
app.listen(port, () => console.log(`Example app listening on port ${port}!`))