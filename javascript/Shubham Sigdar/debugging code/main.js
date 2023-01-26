var wordPattern = function(pattern, s) {
  let p1=pattern.split('');
  console.log(p1);
  let s1=s.split(' ');
  console.log(s1);
  if(p1.length!=s1.length){
    return false;
  }
  let map1=new Map();
  let map2=new Map();
  for(let i=0;i<p1.length;i++){
      map1.set(p1[i],s1[i])
      map2.set(s1[i],p1[i])
    }
   }
   console.log(map1)
  console.log(map2)
  
};
console.log(wordPattern("abba","dog dog dog dog"))