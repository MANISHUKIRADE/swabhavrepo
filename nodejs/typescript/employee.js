function printDetails(employee) {
    for (var _i = 0, employee_1 = employee; _i < employee_1.length; _i++) {
        var e = employee_1[_i];
        console.log(e.name);
    }
}
printDetails([{
        id: 1, salary: 1000, job: "Develope", name: "MANISH"
    }]);
