const nodemailer = require("nodemailer");
/*const senderMail = "myemail@yahoo.com";

const emailTransporter = nodemailer.createTransport({
            host: 'smtp.mail.yahoo.com',
            port: 465,
            service:'yahoo',
            secure: false,
            auth: {
               user: senderMail,
               pass: 'mypassword'
            },
            debug: false,
            logger: true .  <---highly recommend this one here
});
*/
async function main() {

    let testAccount = await nodemailer.createTestAccount();
    let transporter = nodemailer.createTransport({
        host: "smtp.mail.yahoo.com",
        port: 465,
        service: 'yahoo',
        secure: false,
        auth: {
            user: 'manishukirade@yahoo.com',
            pass: 'dcdlfmxiywspzooc'
        },
        debug: false,
        logger: true
    });


    let info = await transporter.sendMail({
        from: '"manish ukirade " <manishukirade@yahoo.com>',
        to: "Kannan Sudhakaran, kannan@swabhavtechlabs.com",
        subject: "Hello ✔",
        text: "NodeMailerMail",
        html: "<b>Hello world?</b>"
    });
    console.log("Message sent: %s", info.messageId);
    console.log("Preview URL: %s", nodemailer.getTestMessageUrl(info));
}
main().catch(console.error);