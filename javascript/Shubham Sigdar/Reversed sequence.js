// Build a function that returns an array of integers from n to 1 where n>0.
// Example : n=5 --> [5,4,3,2,1]

const reverseSeq = n => {
    ans=[]
    for(let i=n; i>=0; i--){
       ans.push(i)
    }
    return ans 
  };
  
  console.log(reverseSeq(5), [5, 4, 3, 2, 1])