/**
 * @param {number} n
 * @return {string[]}
 */
var fizzBuzz = function(n) {

   let i =1;
  const res = []; 
  
  while(i<=n)
  {
    var divBy3 = false;
    var divBy5 = false;
    
    if(i%3===0) divBy3 = true;
    if(i%5===0) divBy5 = true;

    if(divBy3 && divBy5) res.push("FizzBuzz");
    else if(divBy3) res.push("Fizz");
    else if(divBy5) res.push("Buzz");
    else res.push(i.toString());
    i++;
  }
 return res;
};