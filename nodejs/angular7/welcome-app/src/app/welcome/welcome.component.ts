import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './welcome.component.html',
  
})
export class AppComponent {
    message:string
    state:string
    constructor(){
        this.message = 'Nexsales'
          
      }
      stateChangeHandler(e){
           this.state=e;

      }
    
}
