export class Account {
     accountNumber: number
     accont_holder_name: string
     balance: number;
    constructor(accountNumber: number, accont_holder_name: string, balance: number) {
        this.accountNumber = accountNumber;
        this.accont_holder_name = accont_holder_name;
        this.balance = balance;
    }
    public getAcoountHolderdetail = ():void =>{
       let account_holdr_data_string:string =`account Number = ${this.accountNumber}
        acoount holder Name: =${this.accont_holder_name}
        account balnace = ${this.balance}
        `
        console.log(account_holdr_data_string);
    }

}