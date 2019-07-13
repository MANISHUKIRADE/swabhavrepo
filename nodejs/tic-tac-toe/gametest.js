const Cell = require('./cell.js')
const Board = require('./board.js')
const Player = require('./player.js')
const Game = require('./game.js')
let cell = new Array(2);
for (var index = 0; index < 3; index++) {
    cell[index] = new Array(2)
}
for (var index = 0; index < 3; index++) {
    for (index1 = 0; index1 < 3; index1++) {
        cell[index][index1] = new Cell(null)
    }
}
let board = new Board(cell)
console.log(board.getBoardMarks())
let player1 = new Player('manish','X')
let player2 = new Player('ratnesh','o')
let game = new Game(board,player1,player2)
game.gameStart();