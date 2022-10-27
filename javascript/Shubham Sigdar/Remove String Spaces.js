//Simple, remove the spaces from the string, then return the resultant string.

// (noSpace('8 j 8   mBliB8g  imjB8B8  jl  B'), '8j8mBliB8gimjB8B8jlB')
// (noSpace('8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd'), '88Bifk8hB8BB8BBBB888chl8BhBfd')
//P: huma string lena hai, kya hum ak character le skta hai,can it accept numeric value
//R: return space removed string
//E: if we give ('8'),then we get ('8')
//if we give (', e'),then we get (',e')
//if we  ('8 j 8   mBliB8g  imjB8B8  jl  B') then we '88Bifk8hB8BB8BBBB888chl8BhBfd'
//P:
//take a function nospace with parameter str
function nospace(str){
    //phla string ko array bna dega
    //array ko join krh dega
    return str.split(' ').join('')

}
console.log(nospace('8'),'8')
console.log(nospace(', e'),',e')
console.log(nospace('8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd'),'88Bifk8hB8BB8BBBB888chl8BhBfd')
console.log(nospace('8 j 8   mBliB8g  imjB8B8  jl  B'),'8j8mBliB8gimjB8B8jlB')