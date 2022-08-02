static int solve(int n, int[] arr){ //CODE HERE

//Sorting

 Arrays.sort(arr);
//if number = n is missing

if(arr.length != arr[arr.length - 1]) 

    return arr.length;
//define result variable

int res = 0;
// trace element and check- is value of i from 0 to n present in the array or not

// if not then res=i

for(int i = 0; i < arr.length; i++) {

    if(arr[i] != i) {

        res = i;

        break;
    }
}
return res;
}
