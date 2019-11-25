console.log('window object',window);
console.log('This keyword',this);
console.log(this===window);

// window.alert('Welcome to Javascript class');
// alert('welcome UST Global and Test Yantra');
// let confirmDelete=confirm('Are you sure,you want to delete');
// console.log('confirm Delete',confirmDelete);

let userName=prompt('What is your Name','Avipsha');
console.log('User Name',userName);

const person={
    firstName:'Alia',
    age:26,
    lastName:'kapoor',
    getName:function(){
        console.log('This keyword',this)
        return this.firstName + ' ' +this.lastName
    }
}
let fullName=person.getName()
console.log('FullName',fullName)