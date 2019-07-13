
const math = require('./math')
const assert = require('assert');
const expect = require('chai').expect
 var mathAddResult = math.syncAddFunction(5,5);

 
 describe("math",function(){
/*    describe('addFunction()',function(){
        it('addNumbers should return type number',function(){
            assert.typeOf(mathAddResult,'number')
        })
    }) */
    describe('addFunction()',function(){
        it('addNumbers should be 10',function(){
            assert.equal(mathAddResult,10)
        })
    })
    describe('addFunction()',function(){
        it('addNumbers should be below 20',function(){
        
            expect(mathAddResult).to.be.below(20);
        })
    })
})

