const items=[{
    name:'Earring',
    id:1,
    price:5000
},{
    name:'kajal',
    id:2,
    price:300
},{
    name:'Trimmer',
    id:3,
    price:30000,
},{
    name:'Beardo',
    id:4,
    price:170
    
}
]
  const item1=items.map(function(items,index){
      items.price = items.price+300;
      return items;
  })
        console.log('after new price=',item1)
const item=items.map(items=>items.price+300);
console.log('after map arrow function',item);


const obj=items.filter(items=>items.price>2000);
console.log('after filter arrow function',obj);