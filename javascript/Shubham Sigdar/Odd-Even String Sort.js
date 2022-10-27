// Given a string s. You have to return another string such that even-indexed and odd-indexed characters of s are grouped and groups are space-separated (see sample below)

// Note: 
// 0 is considered to be an even index. 
// All input strings are valid with no spaces
// input: 'CodeWars'
// output 'CdWr oeas'

// S[0] = 'C'
// S[1] = 'o'
// S[2] = 'd'
// S[3] = 'e'
// S[4] = 'W'
// S[5] = 'a'
// S[6] = 'r'
// S[7] = 's'
// Even indices 0, 2, 4, 6, so we have 'CdWr' as the first group
// odd ones are 1, 3, 5, 7, so the second group is 'oeas'
// And the final string to return is 'Cdwr oeas'

//P: string s
//R: return another string such that even-indexed and odd-indexed characters of s are grouped and groups are space-separated
//E: input: 'CodeWars' output 'CdWr oeas'
//P: 
//split krh deta hai
//map functions sa do array bnata hai the string literal use krh lenga

function sortMyString(S) {
    let s1 = S.split('').map((item,index)=>index%2==0?item:'').join('')
    let s2 = S.split('').map((item,index)=>index%2==1?item:'').join('')
    return `${s1} ${s2}`
}

console.log(sortMyString("CodeWars"), "CdWr oeas")
console.log(sortMyString("YCOLUE'VREER"), "YOU'RE CLEVER")
// sortMyString("CodeWars")