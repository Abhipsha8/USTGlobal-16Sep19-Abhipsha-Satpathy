function first()
{
    setTimeout( function(){
    console.log('First function executed');
    },5000)
    
}
function second()
{
    console.log('second function executed');
}
first()
second()