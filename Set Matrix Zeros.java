class Solution {
    public void setZeroes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        List<int[]> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    arr.add(new int[]{i,j});
                }
            }
        }
        
        
        for(int i=0;i<arr.size();i++)
        {
            //int[] col=arr.get(i);
            int row=arr.get(i)[0];
            int col=arr.get(i)[1];
            int t=0;
            while(t<m)
            {
                mat[row][t++]=0;
            }
            t=0;
            while(t<n)
            {
                mat[t++][col]=0;
            }
        }
        
    }
}
