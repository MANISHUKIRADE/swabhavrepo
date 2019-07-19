import { Component } from '@angular/core';
import { httpNumService } from './numberapi.httpNumService';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'NumberApi';
  numresult=[];
value:number;
constructor(private service: httpNumService){

}
getNumResult(){
    if(this.value!=null){
    this.service.getResult(this.value) .then((result) => {
        console.log(result)
            this.numresult.push(result);
        })
        .catch((err) => {
          console.log(err.error.text)
      
        
        });
        console.log(this.value)
        this.value=null
      }
}
}
