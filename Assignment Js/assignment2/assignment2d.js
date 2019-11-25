   //Named Function
   function prime(n)
    {
        if(n===1)
        {
            return false;
        }
        else if(n===2)
        {
            return true;
        }else
        {
            for(var i=2;i<n;i++)
            {
                if(n%i===0)
                {
                    return false;
                }
            }return true;
        }  

        
    }
    
    console.log(prime(21));

    //Function Expression
    var prime = function(num){
        if(num===1){
            return false;
        }
        else if(num===2)
        {
            return true;
        }else
        {
            for(var i =2;i<num;i++){
                if(num%i===0){
                    return false;
                }
            }return true;
        }
    
    }
    console.log(prime(5));
    console.log('====self invoked function=====')
    
    console.log('prime');
    (function(num1){
        if(num1===1){
            return false;
        }
        else if(num1===2)
        {
            return true;
        }else
        {
            for(var i =2;i<num1;i++){
                if(num1%i===0){
                    return false;
                }
            }return true;
        }
    
    }) (6);
    
    console.log('=====fat arrow function=====')
    var prime = (num)=>{
        if(num===1){
            return false;
        }
        else if(num===2)
        {
            return true;
        }else
        {
            for(var i =2;i<num;i++){
                if(num%i===0){
                    return false;
                }
            }return true;
        }
    
    } 
    console.log(prime(9))
    

