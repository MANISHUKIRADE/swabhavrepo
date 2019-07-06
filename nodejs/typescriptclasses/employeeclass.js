var Employee = /** @class */ (function () {
    function Employee(empName, empId) {
        var _this = this;
        this.printdetails = function () {
            var formatedString = "empName: " + _this.empName + "\n       empId: " + _this.empId;
            console.log(formatedString);
        };
        this.empName = empName;
        this.empId = empId;
    }
    return Employee;
}());
var emp = new Employee("Manish", 1);
emp.printdetails();
