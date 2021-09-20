class Solution {
    public double myPow(double x, int n) {
        
        long nn=n;
        if(nn<0)
            nn=-nn;
        
        double sol=1.0;
        while(nn!=0)
        {
            if(nn%2==0)
            {
                x=x*x;
                nn/=2;
            }
            else
            {
                sol=x*sol;
                nn-=1;
            }
        }
        if(n<0)
            return 1/sol;
        else
            return sol;
    }
}
