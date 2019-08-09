const mongoose = require('mongoose')
const mongo = require('mongodb');
const url = "mongodb+srv://MANISH:MANISH%409797@cluster0-qdzy9.mongodb.net/task-manager"
mongoose.connect(url, {
    useNewUrlParser: true
})

let userSchema = new mongoose.Schema({
    name: {
        fname: String,
        lname: String
    },
    username: String,
    password: String,
    mobileno: String,
    registerdate: Date,
    Task: [{
        tasktitle: String,
        taskdiscription: String,
        taskcreated: Date,
        taskDate: Date,
        subtask: [{
            tasktitle: String,
            taskdiscription: String,
            taskcreated: Date,
            taskDate: Date
        }]
    }]


})
let userModel = mongoose.model('Users', userSchema)
async function getSubtasks(id){
    let data;
   
    const o_id = new mongo.ObjectID(id);
    await userModel.aggregate([{$unwind:"$Task"},{$match:{'Task._id':{$eq:o_id}}},{$project:{Task:1,_id:0}}],(err,res)=>{
      if(err) throw err
      
      data =res;
    })
    return data
}

getSubtasks('5d468d8218000f1984baa890')
module.exports={
    getTheSubTaskByTaskId: async (id)=>{
       let data =await getSubtasks(id)
       return data
    }
}