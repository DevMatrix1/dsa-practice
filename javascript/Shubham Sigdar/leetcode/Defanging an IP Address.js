// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
// Example 2:

// Input: address = "255.100.50.0"
// Output: "255[.]100[.]50[.]0"
var defangIPaddr = function(address) {
    let address1=address.split('').map(e=>e=="."?"[.]":e).join('')
    console.log(address1)
};
defangIPaddr("1.1.1.1")