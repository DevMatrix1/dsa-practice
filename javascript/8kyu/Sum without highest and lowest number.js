// Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).

// The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.

// Mind the input validation.

// Example
// { 6, 2, 1, 8, 10 } => 16
// { 1, 1, 11, 2, 3 } => 6
// Input validation
// If an empty value ( null, None, Nothing etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.

function sumArray(array) {
//add conditionals to check if the array is empty, null, or none, or if it only has 1 element, if this is the case return 0

    if (array == null)
    {
        return 0;
    }
    else if (array.length < 2)
    {
        return 0;
    }
    else
    {

        array = array.sort(function(a,b) {return a - b;});
//         variable to hold the sum of the sorted array
        var total = 0;

        for (var i = 1; i < array.length - 1; i++) {
            total += array[i];
        }
        return total;
    }
}