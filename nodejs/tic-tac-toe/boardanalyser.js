module.exports = class BoardAnalyser {
    constructor(board, player1, player2) {
        this.board = board
        this.player1 = player1
        this.player2 = player2
    }
    calculateResult() {
       var result = {
            win: false,
            winner: ""
        }
         var mark = this.board.getBoardMarks();
        for (var index = 0; index <= 2; index++) {
            if ((mark[index][0] == mark[index][1]) && (mark[index][1] == mark[index][2]) && ((mark[index][2] == this.player1.PlayerMark) || (mark[index][2] == this.player2.PlayerMark))) {
                if (mark[index][0] == this.player1.PlayerMark) {
                    result.winner = "player 1"
                    result.win = true
                } else {
                    result.winner = "player 2"
                    result.win = true
                }
                break;
            }
            if ((mark[0][index] == mark[1][index]) && (mark[1][index] == mark[2][index]) && ((mark[2][index] == this.player1.PlayerMark) || (mark[2][index] == this.player2.PlayerMark))) {
                if (mark[index][0] == this.player1.PlayerMark) {
                    result.winner = "player 1"
                    result.win = true
                } else {
                    result.winner = "player 2"
                    result.win = true
                }

                break
            }
        }
        if ((mark[0][0] == mark[1][1]) && (mark[1][1] == mark[2][2]) && ((mark[2][2] == this.player1.PlayerMark) || (mark[2][2] == this.player2.PlayerMark))) {
            if (mark[index][0] == this.player1.PlayerMark) {
                result.winner = "player 1"
                result.win = true
            } else {
                result.winner = "player 2"
                result.win = true
            }

        }
        if ((mark[2][0] == mark[1][1]) && (mark[1][1] == mark[0][2]) && ((mark[0][2] == this.player1.PlayerMark) || (mark[0][2] == this.player2.PlayerMark))) {
            if (mark[index][0] == this.player1.PlayerMark) {
                result.winner = "player 1"
                result.win = true
            } else {
                result.winner = "player 2"
                result.win = true
            }

        }
        return result;
    }

}