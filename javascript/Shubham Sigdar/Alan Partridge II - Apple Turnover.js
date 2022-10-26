// Your job is simple, if (x) squared is more than 1000, return 'It's hotter than the sun!!', else, return 'Help yourself to a honeycomb Yorkie for the glovebox.'.

// X will be a valid integer number.
// X will be either a number or a string. Both are valid.
function apple(x){
    if(+(x**2)>1000){
      return 'It\'s hotter than the sun!!'
    }
    else{
      return 'Help yourself to a honeycomb Yorkie for the glovebox.'
    }
  }
  console.log(apple('50'), 'It\'s hotter than the sun!!')
  console.log(apple(4), 'Help yourself to a honeycomb Yorkie for the glovebox.')