/**
 * @swagger
 * /api/v1/contacts:
 *   get:
 *     summary: Get a contacts JSON array
 *     description: get the details of contact in JSON array
 *     produces:
 *       - application/json
 *     responses:
 *        default: 
 *          description: Default error sample response 
 *  
 * /api/v1/contacts/{id}:
 *   get:
 *     summary: Get a contact by ID
 *     produces:
 *       - application/json 
 *     parameters:
 *       - in: path
 *         name: id
 *         schema:
 *           type: integer
 *         required: true
 *         description: Numeric ID of the contact to get
 *     responses:
 *        default:
 *          description: Default error sample response
 */


const service = require('../services/service')

async function getContacst() {
    let data = await service.getContacts()
   // console.log(data)
    return data;

}
async function getContactSingle(id){
    let data = await service.getContactById(id)
    return data
}
module.exports = {

    getContacts:async () => {
        let data =await getContacst()
       // console.log(data)
        return data
    },
    getContact:async (id) => {
        let data = await getContactSingle(id)
       // console.log(data)
        return data;
    }

}