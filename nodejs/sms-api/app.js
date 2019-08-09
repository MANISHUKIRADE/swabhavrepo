const Nexmo = require('nexmo');
const nexmo = new Nexmo({
  apiKey:'4974aa05',
  apiSecret: 'GgkaGCbyNmgL193p'
});
nexmo.message.sendSms(
  '9099691706', '8691983106', 'yo',
    (err, responseData) => {
      if (err) {
        console.log(err);
      } else {
        console.dir(responseData);
      }
    }
 );