const mongoose = require('mongoose')
const mongo = require('mongodb');
const url = "mongodb+srv://MANISH:MANISH%409797@cluster0-qdzy9.mongodb.net/contactdb"
const ObjectId = require('bson-objectid')
mongoose.connect(url, {
   useNewUrlParser: true
})
var contactschema = new mongoose.Schema({
   name: String,
   number: Number

});
let contactmodel = mongoose.model('Contact', contactschema);
async function getData() {
   let data;
let complete= await   contactmodel.find((err, res) => {
      if (err) throw err;
      //console.log(res)
      data = res
   })
   
   
   return data
}
async function getSingleData(id){
   let data;
   const o_id = new mongo.ObjectID(id);   
 let copmplte = await  contactmodel.find({ _id: o_id}, (err, res) =>{ 
      if (err) throw err; 
//      console.log(res)
      data = res
   })
   
   return data;
}
module.exports = {


   getContacts: async () => {
      let data = await getData();
    //  console.log(data)
      return data;

   },
   getContactById: async(id) => {
        let data = await getSingleData(id);
  //      console.log(data)
        return data   
   }


}