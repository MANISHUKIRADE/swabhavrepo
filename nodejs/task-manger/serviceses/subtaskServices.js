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
    userStatus: {
        type: Boolean,
        default: true
    },
    Task: [{
        priority: String,
        tasktitle: String,
        taskdiscription: String,
        taskcreated: Date,
        taskDate: Date,
    //    status: Boolean,

        subtask: [{
            priority: String,
            tasktitle: String,
            taskdiscription: String,
            taskcreated: Date,
            taskDate: Date,
  //          status: Boolean
        }]
    }]

})
let userModel = mongoose.model('Users', userSchema)
async function getSubtasks(id) {
    let data;

    const o_id = new mongo.ObjectID(id);
    await userModel.aggregate([{
        $unwind: "$Task"
    }, {
        $match: {
            'Task._id': {
                $eq: o_id
            }
        }
    }, {
        $project: {
            Task: 1,
            _id: 0
        }
    }], (err, res) => {
        if (err) throw err

        data = res[0].Task.subtask;
 //       console.log(data)
    })
    return data
}
async function getSingleSubTask(taskid,subtaskid){
  let subtasks = await getSubtasks(taskid)
  let data ;
  for(index=0;index<subtasks.length;index++){
      if(subtasks[index]._id==subtaskid){
          data = subtasks[index]
          break;
      }
  }
  //console.log(data)
     return data
}
//getSingleSubTask('5d53a34af2d91b2654091007','5d53a34af2d91b2654091008')

//getSubtasks('5d53a34af2d91b2654091007')
module.exports = {
    getSubTasks: async function (id) {
        let data = await getSubtasks(id)
        return data;
    },
    getSingleSubtaskService: async function(taskid,subtaskid){
        let data = await getSingleSubTask(taskid,subtaskid)
        return data
    }

}


 