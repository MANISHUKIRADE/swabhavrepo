import { Component } from '@angular/core';
import { StudentService } from '../services/student.service';
import { Router } from '@angular/router';


@Component({

    templateUrl: './home.component.html',

})
export class Home {
    
    studentList;
    errormesage:string;
    ngonInit(){
        this.load();
    }
    constructor(private studentservice: StudentService,private router: Router) {
        this.load()
        console.log("constructor")
     }
    load() {
        this.studentservice.getListOfStudent().then((result) => {
            console.log(result)
            this.studentList = result;
        })
        .catch((error)=>{
           this.errormesage = error;
        })
    }
    
   
    
    deleteStudent(e){
        console.log(e.target.id)
        var id = e.target.id
        this.studentservice.deleteStudent(id).then((result)=>{
            console.log(result)
            this.load()

        })
        
    }
    editStudent(e){
       var id=e.target.id
             id=id.slice(1)
             console.log(id)
             this.router.navigateByUrl('/edit/'+id);
                   
    }
}
