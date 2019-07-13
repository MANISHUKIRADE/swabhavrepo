import { Component } from '@angular/core';
import { Student } from './student';

@Component({
    selector: 'appstudent-root',
    templateUrl: './student.component.html',
  

})

export class StudentComponent {
    students:Student[];
    student: Student = { id: 1, name: "Manish" }
     printDetails(event) {
        
        this.students= [{ id: 1, name: "Manish" }, { id: 2, name: "aakash" }]
            console.log(event)
        }    


}

