const rp = require('request-promise')

async function main () {
  const result = await rp('https://google.com')
  const twenty = await 20
  
  // sleeeeeeeeping  for a second 💤
  await new Promise (resolve => {
    setTimeout(resolve, 1000)
  })

  return result
}

main()
  .then(console.log)
  .catch(console.error)