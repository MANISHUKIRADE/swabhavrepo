module.exports = class Cell {

    constructor(mark) {

        this.mark = mark
    }
    getMark() {
        return this.mark;
    }
    addMark(mark) {
        if (this.mark == null) {
            this.mark = mark
            return true
        } else {
            console.log("cell marked is already")
            return false;
        }
    }
}
