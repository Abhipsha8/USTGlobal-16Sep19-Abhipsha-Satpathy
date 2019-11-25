let myName : string = "mikel";
console.log(myName, typeof myName);

let age: number;
console.log(age, typeof age);

let mobileNumber = 34555;
console.log(mobileNumber, typeof mobileNumber);

let address;
address="hhjdd";
address=6788;
console.log(address ,typeof address);

let calAge = function() : void{
    console.log("age is 20");
}
calAge();


class Person{
    constructor(public name: string , public age : number){
    
    }
}
 let person1= new Person("mickel" ,20);
 console.log(person1);

class Student extends Person{
    constructor(name: string , age: number , public rollno: number){
        super(name, age);
    }
}
let Student1=new Student("abhi",21,101);
console.log(Student1);





