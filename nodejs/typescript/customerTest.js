"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var customer_1 = require("./customer");
var customer = new customer_1.Customer("Manish", "Ukirade", 1);
console.log(customer.Fname);
console.log(customer.Lname);
console.log(customer.Id);
var add = new customer_1.Address(405);
console.log(add.Pincode);
