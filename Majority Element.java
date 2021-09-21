//MOST 
class Solution {
    public int majorityElement(int[] a) {
        int var=a[0];
        int count=1;
        for(int i=1;i<a.length;i++)
        {
            if(count==0)
            {
                var=a[i];
                count++;
            }else if(var==a[i])
            {
                count++;
            }
            else
                count--;
        }
        return var;
    }
}   
   
   //     Arrays.sort(a);
    //     int max=0,count=0;
    //     int temp=a[0],t=0,i=0;
    //     for(i=0;i<a.length;i++)
    //     {
    //         if(a[i]==temp)
    //         {
    //             count++;
    //         }
    //         else
    //         {
    //             if(count>max)
    //             {
    //                 max=count;
    //                 t=a[i-1];
    //             }
    //             temp=a[i];
    //             count=1;
    //         }
    //     }
    //      if(count>max)
    //     {
    //         t=a[i-1];
    //     }
    //     return t;
    // }
        
        
