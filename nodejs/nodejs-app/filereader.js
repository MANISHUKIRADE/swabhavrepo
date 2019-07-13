const filereder = require('fs');
filereder.readFile('E:/SWABHAV REPOSITORY/nodejs/nodejs-app/noderequre/textfileread.txt', "utf-8",  (err, data)=> {
    console.log("async")
    console.log(data)
});
var data = filereder.readFileSync('E:/SWABHAV REPOSITORY/nodejs/nodejs-app/noderequre/textfileread.txt', "utf-8")
console.log("sync")
console.log(data)

filereder.open('E:/SWABHAV REPOSITORY/nodejs/nodejs-app/noderequre/textfileread.txt', 'r', (err, filedata) => {
    if (err) throw (err)
    else {
        console.log("file Open")

    }
    filereder.close(filedata, (err) => {
        if (err) throw err
        else("file close")
    })

})