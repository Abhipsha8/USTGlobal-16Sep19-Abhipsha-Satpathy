//Named Functions
function add(num1,num2)
{
    console.log('sum=',num1+num2);
}
add(10,20);
function add(num1,num2,num3)
{
    console.log('sum value=',num1+num2+num3);
}
//Function Expression(Anonymous)
var sub=function(num1,num2)
{
    var subValue=num1-num2;
    return subValue;
}
var value=sub(90,89);
console.log('value=',value);
//Fat Arrow Function
var div1=(num1,num2)=> 
{
    console.log('value=',num1/num2);
}
div1(15,5);
var div2=num1=>
{
    console.log('value=',num1);
}
div2(5);
var div3=num1=>console.log(num1);
div2(10);
console.log('Hello');
(function(num1,num2)
{
    console.log('value=',num1*num2);
})(10,20)
greeting('chandan');
function greeting(msg)
{
 console.log('Hello',msg);
}
greeting('Dinga');
var greet=function(msg)
{
    console.log('Hi',msg);
}
greets('Dingi');
var greets=(msg)=>
{
    console.log('Hi',msg);
}


















