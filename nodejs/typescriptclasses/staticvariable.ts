class Circle {
    static pi = 3.14;

    static calculateArea(radius:number) {
        return this.pi * radius * radius;
    }

    calculateCircumference(radius:number):number { 
        return 2 * Circle.pi * radius;
    }
}

var araea1= Circle.calculateArea(5); 
console.log(`${araea1}`)
let circleObj = new Circle();;
var area= circleObj.calculateCircumference(5)
console.log(`${area}`)