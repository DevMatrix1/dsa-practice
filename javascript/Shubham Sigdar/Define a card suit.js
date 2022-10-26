// You get any card as an argument. Your task is to return the suit of this card (in lowercase).

// Our deck (is preloaded):

// ('3♣') -> return 'clubs'
// ('3♦') -> return 'diamonds'
// ('3♥') -> return 'hearts'
// ('3♠') -> return 'spades'
//A♠, K♠, Q♠, J♠, 10♠, 9♠, 8♠, 7♠, 6♠, 5♠, 4♠, 3♠, 2♠
//A♦, K♦, Q♦, J♦, 10♦, 9♦, 8♦, 7♦, 6♦, 5♦, 4♦, 3♦, 2♦
// A♥, K♥, Q♥, J♥, 10♥, 9♥, 8♥, 7♥, 6♥, 5♥, 4♥, 3♥, 2♥
// A♣, K♣, Q♣, J♣, 10♣, 9♣, 8♣, 7♣, 6♣, 5♣, 4♣, 3♣, 2♣

//P:string 
//R: return suit of this ca
//E:
//P:

function defineSuit(card) {
    if(card=='2♠' || card=='3♠' || card=='4♠'|| card=='5♠'|| card=='6♠'|| card=='7♠'|| card=='8♠'|| card=='9♠'|| card=='10♠'|| card=='J♠'|| card=='Q♠'|| card=='K♠' || card=='A♠' ){
      return 'spades'
    }else if(card=='2♦' || card=='3♦' || card=='4♦'|| card=='5♦'|| card=='6♦'|| card=='7♦'|| card=='8♦'|| card=='9♦'|| card=='10♦'|| card=='J♦'|| card=='Q♦'|| card=='K♦' || card=='A♦' ){
      return 'diamonds'
    }else if(card=='2♥' || card=='3♥' || card=='4♥'|| card=='5♥'|| card=='6♥'|| card=='7♥'|| card=='8♥'|| card=='9♥'|| card=='10♥'|| card=='J♥'|| card=='Q♥'|| card=='K♥' || card=='A♥' ){
      return 'hearts'
    }else{
      return 'clubs'
    }
  }
  console.log(defineSuit('Q♠'), 'spades')
  console.log(defineSuit('9♦'), 'diamonds')
  console.log(defineSuit('J♥'), 'hearts')