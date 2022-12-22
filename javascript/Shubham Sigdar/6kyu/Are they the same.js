// comp(a,b) returns false because in b 132 is not the square of any number of a.

// a = [121, 144, 19, 161, 19, 144, 19, 11]  
// b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
// comp(a,b) returns false because in b 36100 is not the square of any number of a.

// Remarks
// a or b might be [] or {} (all languages except R, Shell).
// a or b might be nil or null or None or nothing (except in C++, COBOL, Crystal, D, Dart, Elixir, Fortran, F#, Haskell, Nim, OCaml, Pascal, Perl, PowerShell, Prolog, PureScript, R, Racket, Rust, Shell, Swift).
// If a or b are nil (or null or None, depending on the language), the problem doesn't make sense so return false.
function comp(a1, a2){
    //your code here
    a1=a1.sort((a,b)=>a-b);
    // console.log(a1)
    a2=a2.sort((a,b)=>a-b)
    let a3=[]
    // console.log(a2)
    if(a1 == null || a2 == null) return false;
    if (!a1 || !a2){
          return false
      }
      if (a1.length === 0 && a2.length === 0){
          return true
      }else if (a1.length !== a2.length){
          return false
      }else{
      for(let i=0;i<a1.length;i++){
        a3=a1.map(e=>e*e)
      }
      
    }
    console.log(a3)
    console.log(a2)
    return a3.every((item, index) => item == a2[index]);
    
  }