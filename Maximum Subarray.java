class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int sumend=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sumend=(sumend+nums[i]>nums[i])?sumend+nums[i]:nums[i];
            sum=(sum<sumend)?sumend:sum;
        }
        return sum;
    }
}
