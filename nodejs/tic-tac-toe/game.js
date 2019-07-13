const readlinesync = require('readline-sync')
require('console-sync')

module.exports = class game {

    constructor(board, player1, player2) {
        this.board = board
        this.player1 = player1
        this.player2 = player2
    }
    get Board() {
        return this.board
    }
    get Player1() {
        return this.player1
    }
    get Player2() {
        return this.player2
    }
    gameStart() {
        const readinput = readlinesync;
        var term = 8
        var playerflag = true;
        while (term != 0) {
            let rowindex
            let columindex
            let player;

            console.log("player" + (Number(term % 2) + Number(1)) + " move")
            rowindex = readinput.question('where do you want insert mark in row')

            columindex = readinput.question('where do you want insert mark in column')
            if (playerflag == true) {
                player = this.player1
            } else {
                player = this.player2
            }
            var success = this.board.getCelltoMark(rowindex, columindex, player.PlayerMark)
            if (success == true) {
                term--;
                if (playerflag == false) {
                    playerflag = true
                } else {
                    playerflag = false
                }
            } else console.log("game End")


            console.log(this.board.getBoardMarks())
        }
    }

}