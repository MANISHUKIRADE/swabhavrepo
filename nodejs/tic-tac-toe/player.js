module.exports = class Player {
    constructor(playername, mark) {
        this.playername = playername
        this.mark = mark
    }
    get PlayerMark() {
        return this.mark
    }
    get Playername() {
        return this.playername
    }
}