import { Component } from "@angular/core";
import { StudentService } from '../services/student.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
    templateUrl: './edit.component.html'
})
export class EditStudent{
    student={};
    constructor(private studentservice: StudentService,private route: ActivatedRoute,private router: Router){
        var id=this.route.snapshot.params.id
        this.studentservice.getStudentForEdit(id).then((result)=>{
             console.log(result)
             this.student=result[0];
             
         })
         .catch((err)=>{
        console.log(err)
         })
         
    }
    EditStudent(){
        var id = this.route.snapshot.params.id
        this.studentservice.editStudent(id,this.student).then((result)=>{
            console.log(result);
            this.router.navigateByUrl('/home')
        })
        .catch((error)=>{
            this.router.navigateByUrl('/home')
        })
        
   
    }
}