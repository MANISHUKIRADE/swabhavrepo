let service = require('../serviceses/subtaskServices')
let Dto = require('../DTO/subtaskDto')
async function getUserTasks(id) {
    let data = await service.getTheSubTaskByTaskId(id)
    data = await Dto.subTaskDto(data)
    return data
}
module.exports= class subTaskController{
    constructor(app) {
        this.app= app
        this.routs()
    }
    routs(){
        this.app('/api/v1/users/:userid/tasks/:taskid/subtasks/',(request,response)=>{
            
        })

    }
}