class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long sum=0,t=arr[0];
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(t<sum)
            t=sum;
            if(sum<0)
            sum=0;
            
        }
        return t;
        
    }
    
}
