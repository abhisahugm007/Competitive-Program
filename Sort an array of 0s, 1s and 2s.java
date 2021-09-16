class Solution {
    public void sortColors(int[] nums) {
        // int t=nums.length;
        // int l=0,m=0,n=0;
        // for(int i=0;i<t;i++)
        // {
        //     if(nums[i]==0)
        //         l++;
        //     else if(nums[i]==1)
        //         m++;
        //     else
        //         n++;
        // }
        // for(int i=0;i<t;i++)
        // {
        //     if(l!=0)
        //     {
        //         l--;
        //         nums[i]=0;
        //     }
        //     else if(m!=0)
        //     {
        //         m--;
        //         nums[i]=1;
        //     }
        //     else
        //     {
        //         nums[i]=2;
        //     }
        // }
        
        
        
        
        int mid=0,low=0,n=nums.length;
        int high=n-1;
        
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
}
