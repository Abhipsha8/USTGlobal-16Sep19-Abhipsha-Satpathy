const hobby=['sleeping','cricket','eating','coding','roaming'];
console.log(typeof hobby);
const isArrayOrNot=Array.isArray(hobby)
console.log('Hobby array or not',isArrayOrNot);
const hasCricket=hobby.includes('cricket',1)
console.log('using include method',hasCricket);
hobby.push('guitar','vollyball')
console.log('after pushing',hobby)
hobby.pop()
console.log('after poping',hobby)
hobby.unshift('Numismatic','singing')
console.log('after unshift method',hobby)
hobby.shift()
console.log('after shift method',hobby)
const hobby1=['sleeping','cricket','eating','coding','roaming']
hobby1.splice(1,0,'bird watching','pubg')
console.log('After splice method',hobby1)
const afterSlice=hobby1.slice(2,4)
console.log('After slicing method',hobby1)
console.log('After slice method',afterSlice)
const indexOfCoding=hobby1.indexOf('coding',2)
console.log('Index of coding',indexOfCoding)
const stringJoin=hobby1.join('-')
console.log('string of join',stringJoin)

const numbers=[100,200,300,400]
const num1=numbers.map(function(value,index){
    let newValue=value+50
    return newValue
})
console.log('After Map method',num1)
const nums2=numbers.map(value=>value+50)
console.log('After Map arrow function',nums2)

const filterNum= numbers.filter (function(value,index){
    if(value>200){
        return true
    }else{
        return false;
        }
    
})
console.log('after filter method',filterNum)
const filterNum1=numbers.filter(value=>value>200)
console.log('after filter arrow method',filterNum1)



