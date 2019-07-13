const assert = require("assert");
const Cell = require('../cell.js')
const expect = require('chai').expect
cell1 = new Cell('null')
cell2 = new Cell('X')
var markResult1 = cell1.getMark()
var markResult2 = cell2.getMark()
describe('Cell Test', function () {
    describe('get Mark', function () {
        it('markresult1 should be null', function () {
            assert.equal(markResult1, null)
        })
    })
    describe('get Mark', function () {
        it('markresult2 should be X', function () {
            assert.equal(markResult2, 'X')
        })
    })
    describe('get Mark', function () {
        it('cell1 shoul be an instace of cell', function () {
            expect(cell1).to.be.instanceof(Cell)
        })
    })
    describe('get Mark', function () {
        it('cell2 shoul be an instace of cell', function () {
            expect(cell2).to.be.instanceof(Cell)
        })
    })
    
})