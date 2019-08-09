const url = "mongodb+srv://MANISH:MANISH%409797@cluster0-qdzy9.mongodb.net/contactdb"
const mongoose =  require('mongoose')
const autoincrement = require('mongoose-auto-increment')
let connection = mongoose.createConnection(url,{useNewUrlParser:true})
let schema = mongoose.Schema;

let contactschema=new schema({name:String,number:Number})
autoincrement.initialize(connection)
contactschema.plugin(autoincrement.plugin,'contact')
 contact = connection.model('Contact',contactschema);

