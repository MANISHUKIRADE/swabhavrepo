import { Component } from "@angular/core";
import { StudentService } from '../services/student.service';
import { Router } from '@angular/router';

@Component(
    {
        templateUrl: "./add.component.html"
    }
)
export class AddStudent {
    name: string
    rollno: number
    age: number
    ismale: boolean
    email: string
    date: Date
    constructor(private service: StudentService,private router: Router) {

    }
    addStudent() {
        var student = {
            age: this.age,
            date: this.date,
            email: this.email,
            isMale: this.ismale,
            name: this.name,
            rollNo: this.rollno
        }
        console.log(student)
        this.service.addStudent(student).then((result)=>{
            console.log(result)
        })
        .catch((erore)=>{
            console.log(erore)
        })
       this.name= null
       this.rollno=null
       this.age=null
       this.ismale=null
       this.email=null
       this.date=null
       this.router.navigateByUrl('/home')

    }
}
