import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './welcome.component.html',
  
})
export class AppComponent {
    message:string
    constructor(){
        this.message = 'Nexsales'
    }
    
}
