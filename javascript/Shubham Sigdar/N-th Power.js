// This kata is from check py.checkio.org

// You are given an array with positive numbers and a non-negative number N. You should find the N-th power of the element in the array with the index N. If N is outside of the array, then return -1. Don't forget that the first element has the index 0.

// Let's look at a few examples:

// array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
// array = [1, 2, 3] and N = 3, but N is outside of the array, so the result is -1.
//P: array with positive number and negative number and the index of an array 
//R:if index N is inside of the arrau then return Nth power of that Nth element otherwise return -1 if index is outside of the array
//E:
//P:
function index(array, n){
    //your code here
    
    return array[n]**n || -1
    
  }
  console.log(index([1, 2, 3, 4],2),9)
  console.log(index([1, 3, 10, 100],3),1000000)
  console.log(index([1, 2],3),-1)
  console.log(index([1,1,1,1,1,1,1,1,1,1], 9),1)
  console.log(index([1,1,1,1,1,1,1,1,1,2], 9),512)
  console.log(index([29,82,45,10], 3),1000)