// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]
/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let rows=[];
    if(numRows==1){
      rows.push([1])
    }else if(numRows==2){
      rows.push([1])
      rows.push([1,1])
    }else if(numRows>2){
      rows.push([1])
      rows.push([1,1])
      for(let i=2;i<numRows;i++){
        let subArray = [];
        subArray.push(1);
        for(let j=0;j<rows[i-1].length-1;j++){
          subArray.push(rows[i-1][j]+rows[i-1][j+1])
        }
        subArray.push(1);
        rows.push(subArray)
      }
      
    }
    return rows;
  };