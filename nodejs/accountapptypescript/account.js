"use strict";
exports.__esModule = true;
var Account = /** @class */ (function () {
    function Account(accountNumber, accont_holder_name, balance) {
        var _this = this;
        this.getAcoountHolderdetail = function () {
            var account_holdr_data_string = "account Number = " + _this.accountNumber + "\n        acoount holder Name: =" + _this.accont_holder_name + "\n        account balnace = " + _this.balance + "\n        ";
            console.log(account_holdr_data_string);
        };
        this.accountNumber = accountNumber;
        this.accont_holder_name = accont_holder_name;
        this.balance = balance;
    }
    return Account;
}());
exports.Account = Account;
