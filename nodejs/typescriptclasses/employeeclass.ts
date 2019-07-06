 class Employee {
    empName: string;
    empId: number;
    constructor(empName: string, empId: number) {
        this.empName = empName;
        this.empId = empId;
    }
    printdetails = ():void =>{ 
       let formatedString:string = `empName: ${this.empName}
       empId: ${this.empId}`
       console.log(formatedString);

    }
}

let emp = new Employee("Manish",1)
emp.printdetails()