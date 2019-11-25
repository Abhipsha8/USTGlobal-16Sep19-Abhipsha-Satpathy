const message = new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name: 'Billgates',
            age: 67
        },{
            name: 'Jeff Bezos',
            age:45,
        }])
    
    }else{
        reject('Failed')
    }    
})
message.then(function(mgs){
    console.log('Success Message',mgs)
}).catch(function(error){
    console.log('Failure Message',error)
});


console.log('========')

const  employee= new Promise(function(resolve,reject){
    if(30>20){
        resolve([{
            name: 'Billgates',
            age: 67
        },{
            name: 'Jeff Bezos',
            age:45,
        }])
    
    }else{
        reject('Failed')
    }    
})
message.then(function(data){
    console.log('Employee Data',data)
}).catch(function(error){
    console.log('Failure Message',error)
});


//clouses
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10
        return count
    }
    return innerFunction
}
let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter Value',counter)







