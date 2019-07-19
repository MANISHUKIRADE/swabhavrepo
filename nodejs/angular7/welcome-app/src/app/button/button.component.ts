import { Component, Input, Output, EventEmitter } from "@angular/core";

@Component({
    selector: 'Toggle-button',
    templateUrl: './button.component.html'
})
export class ToggleButton {
    @Input()
    textvalue: string;
    @Input()
    state: number;
    @Output()
    changestate = new EventEmitter();
    ngOnInit() {
        this.textvalue = "InitValue"
        this.state = 0
        console.log("Under Init")
    }

    constructor() {
        this.textvalue = "nothing"
        this.state = 0
        console.log("constructor")

    }
    changeState() {
        if (this.state == 1) {
            this.state = 0
            this.textvalue = "0 state"


        } else {
            this.state = 1
            this.textvalue = "1 state"
        }
        this.changestate.emit("state changed to   " + this.state)
    }

}