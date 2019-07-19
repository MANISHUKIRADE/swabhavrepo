import { Component, Input } from "@angular/core";

@Component({
    selector: 'Toggle-button',
    templateUrl: './button.component.html'
})
export class ToggleButton {
    @Input()
    textvalue: string;
    state: number;
    constructor() {
        this.textvalue ="nothing"
        this.state =0
    }
   

}