class Solution {
    public int missingNumber(int[] nums) {
//         int n=nums.length;
//         int rem=n*(n+1)/2;
//         for(int i=0;i<n;i++)
//         {
//             rem=rem-nums[i];
//         }
//         return rem;
        
        
        int x=0,i=0;
        for(i=0;i<nums.length;i++)
        {
            x=x^i;
            x=x^nums[i];
        }
        return x^i;
    }
}
