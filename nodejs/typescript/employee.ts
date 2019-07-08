interface Employee {
    id: number,
    salary: number,
    job: string,
    name: string

}
function printDetails(employee: Employee[]) {
    for (let e of employee) {
        console.log(e.name)
    }
}

printDetails([{
    id: 1, salary: 1000, job: "Develope", name: "MANISH"
}])
