const mongoose = require('mongoose')
const url = "mongodb+srv://MANISH:MANISH%409797@cluster0-qdzy9.mongodb.net/contactdb"
 mongoose.connect(url,{useNewUrlParser:true})
 var contactschema = new mongoose.Schema({
    name: String,
    number:Number
  });
  let Contact = mongoose.model('Contact',contactschema);
  let contact1 = new Contact({ name:'onkar',number:8161212 })
  contact1.save().then(doc=>{
      console.log(doc)
  })
  .catch(err=>{
      console.log(err)
  })
  let contact2 = new Contact({name:'vivek',number:12322484})
  contact2.save().then(doc=>{
    console.log(doc)
})
.catch(err=>{
    console.log(err)
})

 