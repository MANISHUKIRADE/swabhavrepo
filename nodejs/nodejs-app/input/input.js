const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
  })
  
  readline.question(`What's your name?`, (name,name2) => {
    console.log(`Hi ${name}!`)
    
    readline.close()
  } )