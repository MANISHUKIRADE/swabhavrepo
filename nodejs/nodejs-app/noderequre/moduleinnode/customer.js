module.exports= class Customer {


    constructor(name, Address, balance) {
        this.name = name;
        this.Address = Address;
        this.balance = balance;
    }

    getDetails() {
        return 'name= ' + this.name + ' address ' + this.Address + '  balance ' + this.balance
    }
}
