let h1Element= document.getElementById('demo');
console.log('Element =',h1Element);
console.log('Element Text=',h1Element.textContent)
h1Element.textContent='Good Evening'
console.log('========================')
let buttonElement=document.createElement('button')
buttonElement.textContent='Click Me!!!'
console.log('Button Element',buttonElement)


document.body.appendChild(buttonElement);
let ulElement=document.createElement('ul')
let li1Element=document.createElement('li')
let li2Element=document.createElement('li')
let li3Element=document.createElement('li')


li1Element.textContent='Java'
li2Element.textContent='Sql'
li3Element.textContent='Javascript'

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)

h1Element.style.color='red'
h1Element.style.fontsize='50px'

function showMessage(){
    alert('Hi Hello Welcome!!!!')
}
function changeColor(){
    let pElement= document.getElementById('mover')
    pElement.style.color = 'green'
}
function removeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'black'
}
function printHello(){
    console.log('Hello')
     let userName=document.getElementById('username').value
     document.getElementById('showusername').textContent = userName;
}
let name = 'Rakesh'
let age = 21
let phoneno = 7866886678
console.log('Name is '+name + 'Age is ' +age+ ' phone no is '+phoneno);
console.log('Name is ${name} Age is ${age} phone no is ${phoneno}')
console.log('2 + 2 = ${2+2}')
//document.getElementById('b1'), disabled = false








