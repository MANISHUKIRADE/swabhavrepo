async function addnum(n1, n2) {
    return (n1 + n2)
}

function add(n1, n2) {
    return new Promise((resolve, reject) => {
        if (n1 < 0 || n2 < 0) {
            reject(new Error("NUmber not negative"))
        } else {
            resolve(n1 + n2)
        }
    })
}
async function main() {
    console.log("Before R1")
    
    var r1 = await add(1, 2)
    console.log(r1)
    console.log("After  r1")

console.log("Bfore r2")
    
    var r2 = await add(r1, r1)
    console.log(r2)
    console.log("After R2")

    console.log("before r3")
    var r3 = await add(r2, r2)
    console.log(r3)
    console.log("after r3")

}
main();
console.log("OutSide")