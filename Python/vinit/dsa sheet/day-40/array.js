Q:https://leetcode.com/problems/contains-duplicate/submissions/

The first solution is based on sorting. We sort array elements, so that all of elements with the same value become adjacent. Then we iterate through the array and check if the adjacent elements are equal. If so, we found a duplicate.

Sorting takes up O(NLog(N)) time, iterating through the arrray takes O(N) time.
We sort the array in-place, we do not create a new array, so it doesn't take up any extra space.

Time complexity: O(NLog(N)) + O(N) = O(NLog(N))
Space complexity: O(1)

/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
   nums.sort();
    for (let i = 0; i < nums.length - 1; i++) {
        if (nums[i] === nums[i + 1]) {
            return true;
        }
    }
    
    return false;
};
The next two solutions are based on Set data structure, which is akin to set in mathematics. Set can only contain unique elements and if the element appears more than once, it will be included only once.

The first solution iterartes through array and adds elements which we already saw, and if that element appears again we return true.

/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const set = new Set();
    for (let i = 0; i < nums.length; i++) {
        if (set.has(nums[i])) {
            return true;
        }
        
        set.add(nums[i]);
    }
    
    return false;
};
In the worst case we need to traverse the whole array and also insert every element from the array in our set. Each set insertion is O(1), so inserting N elemnts will cost us O(N).
New set can contain up to N elements in case there are no duplicates.

Time complexity: O(N) + O(N) = O(N)
Space complexity: O(N)

The second solution creates a new set from an array of numbers and check that the length of this set is the same as the length of the array it was constructed from. If that's not the case it means there is 1 or more duplicates and we return true.

/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    return (new Set(nums)).size !== nums.length;
};
In this case we just need to create a set from numbers that we are given.
Constructing a set has O(N) time complexity.
Storign each element from the numbers array in set has O(N) time complexity.

Time complexity: O(N)
Space complexity: O(N)