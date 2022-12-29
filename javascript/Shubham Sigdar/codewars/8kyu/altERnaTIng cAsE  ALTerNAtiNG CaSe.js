// altERnaTIng cAsE <=> ALTerNAtiNG CaSe
// Define String.prototype.toAlternatingCase (or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language; see the initial solution for details) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:

String.prototype.toAlternatingCase = function () {
    // Define your method here :)
    let str=this.split('').map(e=>e.toLowerCase()!==e?e.toLowerCase():e.toUpperCase())
    
    return str.join('');
  }