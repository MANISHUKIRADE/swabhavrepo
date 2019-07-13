const Board = require('../board.js')
const Cell = require('../cell.js')
const expect = require('chai').expect
const assert = require('assert')
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
var mark = board.getBoardMarks()
describe("BoardTest", function () {
    describe("getBoardmarks() ", function () {
        it("mark is an array of  elements", function () {
            expect(mark).to.be.instanceof(Array)
        })
    })
    for (index = 0; index < 2; index++) {
        for (index1 = 0; index1 <= 4; index1++) {
            describe('get Mark', function () {
                it('markresult1 should be null', function () {
                    assert.equal(mark[index][index1], null)
                })
            })
        }
    }


})