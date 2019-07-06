var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    function Person(name) {
        this.name = name;
    }
    Person.prototype.display = function () {
        console.log(this.name);
    };
    return Person;
}());
var Employeea = /** @class */ (function (_super) {
    __extends(Employeea, _super);
    function Employeea(name, id) {
        var _this = _super.call(this, name) || this;
        _this.id = id;
        return _this;
    }
    Employeea.prototype.getPerson = function () {
        return new Employeea(this.name, 1);
    };
    return Employeea;
}(Person));
var emplo = new Employeea("manish", 1);
emplo.display();
