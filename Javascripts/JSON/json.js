const person={
    name:'avi',
    age: 21,
    color:'golden',
    address:{
        city:'Bijapur',
        state:'karnataka',
        pincode: 5911115
    },
    hobbies:['coding','Bird Watching','singing']
}
console.log('Javascript person Object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person Object',jsonObject)
const javaScriptPersonObject= JSON.parse(jsonObject)
console.log('javaScript person Object after parse',javaScriptPersonObject)

localStorage.setItem('email','billgates@gmail.com')
const emailId= localStorage.getItem('emailqsde')
console.log('Email Id',emailId)
localStorage.clear();