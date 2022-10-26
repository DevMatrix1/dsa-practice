// Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').

// Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').

// Create a function which translates a given DNA string into RNA.

// For example:

// "GCAT"  =>  "GCAU"
// The input string can be of arbitrary length - in particular, it may be empty. All input is guaranteed to be valid, i.e. each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.

//P:string contain only G,C,A,T
//R:returns an RNA sequence from the given DNA sequence 
//E:"GACCGCCGCC"->"GACCGCCGCC" "GCAT"->"GCAU"
//P: //convert string to array string
//for loop
//arr[i].replace('T','U')
function DNAtoRNA(dna) {
    // create a function which returns an RNA sequence from the given DNA sequence
    let arr=dna.split("")
    // console.log(arr)
    for(let i=0;i<arr.length;i++){
      if(arr[i]=='T'){
        arr[i]=arr[i].replace('T','U')
      }
    }
    return arr.join('')
    
  }
  console.log(DNAtoRNA("TTTT"), "UUUU")
  console.log(DNAtoRNA("GCAT"), "GCAU")
  console.log(DNAtoRNA("GACCGCCGCC"), "GACCGCCGCC")
  // DNAtoRNA("GCAT")