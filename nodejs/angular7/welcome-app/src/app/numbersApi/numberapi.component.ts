import { Component } from "@angular/core";
import { httpNumService } from './numberapi.httpNumService';

@Component({
    selector: 'app-root',
    templateUrl: './numberapi.component.html'
})
export class NumberApi{
numresult=[];
value:number;
constructor(private service: httpNumService){

}
getNumResult(){
    this.service.getResult(this.value) .then((result) => {
        console.log(result)
            this.numresult.push(result);
        })
        .catch((err) => {
          console.log(err.error.text)
        });
}
}