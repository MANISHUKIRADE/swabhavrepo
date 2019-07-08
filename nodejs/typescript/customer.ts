export class Customer{
    constructor(private fname:string , private lname:string , private id:number ){
        
    }
    get Fname(){
        return this.fname
    }
    get Lname(){
        return this.lname
    }
    get Id(){
        return this.id;
    }
}

export class Address{
    constructor( private pincode:number){

    }
    get Pincode(){
        return this.pincode;
    }
}