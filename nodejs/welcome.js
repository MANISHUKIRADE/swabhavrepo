console.log(this)
var a 
console.log(a)
//console.log(global)
f1();

function f1() {
    console.log("inside f1")
    var a= 1
    console.log(a+ "of f1")
}
f1()

var f2 = function () {
    console.log("inside f2")
}
setTimeout(function () {
    console.log("Timeout Funtion")
}, 5000)
f2();