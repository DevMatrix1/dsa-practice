//https://leetcode.com/problems/running-sum-of-1d-array/
class Solution
{
public:
    vector<int> runningSum(vector<int> &nums)
    {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
};