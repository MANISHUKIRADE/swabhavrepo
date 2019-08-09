module.exports={
    taskConverter:(data)=>{
       // console.log(data.Task)
        task = data.Task
        let taskdata=[];
        for(index=0;index<task.length;index++){
            taskdata[index]={
                _id:task[index]._id,
                tasktitle:task[index].tasktitle,
                taskdiscription:task[index].taskdiscription,
                taskDate:task[index].taskDate    
            }
        }
        return taskdata
    },
    singleTaskConverter:(data)=>{
    let task = data[0].Task
    return {
        
            _id:task._id,
            tasktitle:task.tasktitle,
            taskdiscription:task.taskdiscription,
            taskDate:task.taskDate    
        
    }
    }
}