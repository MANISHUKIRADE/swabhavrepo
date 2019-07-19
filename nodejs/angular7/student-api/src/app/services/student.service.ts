import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { resolve, reject } from 'q';

@Injectable()
export class StudentService {
    StudentList;
        constructor( private http:HttpClient){}
        getListOfStudent():Promise<any>{
            return new Promise((resolve,reject)=>{
                this.http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students")
                .toPromise()
            .then((result)=>{
                this.StudentList=result;
                  resolve(result)
            })
            .catch((error)=>{
                reject(error)
            })
            })
            
        }

        addStudent(student):Promise<any>{
             return new Promise((resolve,reject)=>{
                this.http.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",student,{responseType:'json'})
                .toPromise()
                .then((result)=>{
                    console.log(result)
                    resolve(result)
                })
                .catch((error)=>{
                    console.log(error)
                })
             }) 
        }
        deleteStudent(id):Promise<any>{
            return new Promise((resolve,reject)=>{
                this.http.delete("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id)
                .toPromise()
                .then((result)=>{
                    console.log(result)
                    resolve(result)
                })
                .catch((error)=>{
                    console.log(error)
                    reject(error)
                })
            })
        }
        getStudentForEdit(id):Promise<any>{
            return new Promise((resolve,reject)=>{
                this.http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id)
                .toPromise()
                .then((result)=>{
                    console.log(result)
                    resolve(result)
                })
                .catch((error)=>{
                    console.log(error);
                    reject(error)
                })
            })
        }
        editStudent(id,data):Promise<any>{
            return new Promise((resolve,reject)=>{
          this.http.put("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id,data,{responseType:'json'})
         .toPromise()
         .then((result)=>{
             console.log(result)
             resolve(result)
         })  .catch((error)=>{
             console.log(error)
             reject(error)
         }) 
        })
            
        }
}