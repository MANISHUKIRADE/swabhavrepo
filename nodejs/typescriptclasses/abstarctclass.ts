abstract class Person {
     name:string;
    constructor(name) {
        this.name=name
    }
    display(): void{
        console.log(this.name);
    }
    abstract getPerson(name):Person
}

class Employeea extends Person {

    id:number;
    constructor(name:string,id:number){
        super(name);
        this.id=id;
    }
    getPerson():Person{
        return new  Employeea(this.name,1)
    }

}
let emplo = new Employeea("manish",1);
  emplo.display();
