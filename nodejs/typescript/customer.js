"use strict";
Object.defineProperty(exports, "__esModule", {
    value: true
});
var Customer = /** @class */ (function () {
    function Customer(fname, lname, id) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
    }
    Object.defineProperty(Customer.prototype, "Fname", {
        get: function () {
            return this.fname;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "Lname", {
        get: function () {
            return this.lname;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "Id", {
        get: function () {
            return this.id;
        },
        enumerable: true,
        configurable: true
    });
    return Customer;
}());
exports.Customer = Customer;
var Address = /** @class */ (function () {
    function Address(pincode) {
        this.pincode = pincode;
    }
    Object.defineProperty(Address.prototype, "Pincode", {
        get: function () {
            return this.pincode;
        },
        enumerable: true,
        configurable: true
    });
    return Address;
}());
exports.Address = Address;