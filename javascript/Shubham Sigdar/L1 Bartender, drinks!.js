// Complete the function that receives as input a string, and produces outputs according to the following table:

// Input	                         Output
// "Jabroni"	                  "Patron Tequila"
// "School Counselor"	          "Anything with Alcohol"
// "Programmer"                 "Hipster Craft Beer"
// "Bike Gang Member"           "Moonshine"
// "Politician"	                "Your tax dollars"
// "Rapper"	                    "Cristal"
// anything else	              "Beer"
// Note: anything else is the default case: if the input to the function is not any of the values in the table, then the return value should be "Beer".

// Make sure you cover the cases where certain words do not show up with correct capitalization. For example, the input "pOLitiCIaN" should still return "Your tax dollars".

function getDrinkByProfession(param){
    let params=param.toLowerCase()
    if(params=="jabrOni")
      return "Patron Tequila"
    else if(params=="school counselor")
      return "Hipster Craft Beer"
    else if(params=="programmer")
      return "Hipster Craft Beer"
    else if(params=="bike gang member")
      return "Moonshine"
    else if(params=="politician")
      return "Your tax dollars"
    else if(params=="rapper")
      return "Cristal"
    else
      return "Beer"
  }
  console.log(getDrinkByProfession("jabrOni"), "Patron Tequila", "'Jabroni' should map to 'Patron Tequila'")
  console.log(getDrinkByProfession("scHOOl counselor"), "Anything with Alcohol", "'School Counselor' should map to 'Anything with alcohol'")
  console.log(getDrinkByProfession("prOgramMer"), "Hipster Craft Beer", "'Programmer' should map to 'Hipster Craft Beer'")
  console.log(getDrinkByProfession("bike ganG member"), "Moonshine", "'Bike Gang Member' should map to 'Moonshine'")
  console.log(getDrinkByProfession("poLiTiCian"), "Your tax dollars", "'Politician' should map to 'Your tax dollars'")
  console.log(getDrinkByProfession("rapper"), "Cristal", "'Rapper' should map to 'Cristal'")
  console.log(getDrinkByProfession("pundit"), "Beer", "'Pundit' should map to 'Beer'")
  console.log(getDrinkByProfession("Pug"), "Beer", "'Pug' should map to 'Beer'")
  // getDrinkByProfession("scHOOl counselor")