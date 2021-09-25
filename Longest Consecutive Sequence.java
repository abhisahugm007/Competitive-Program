class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int max=1,len=1;
        int pre=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
          if(pre!=nums[i])
          {
            if(pre+1==nums[i])
            {
                len++;
                if(max<len)
                    max=len;
            }
            else{
                len=1;
            }
            
            pre=nums[i];
          }
        }
        return max;
    }
}
