class Solution {
    public int[][] merge(int[][] in) {
        
        List<int[]> l=new ArrayList<>();
        if(in.length==0 || in==null)
            return l.toArray(new int[0][]);
        Arrays.sort(in,(a,b)->a[0]-b[0]);
        
        int start=in[0][0];
        int end=in[0][1];
        for(int[] k:in)
        {
            if(k[0]<=end)
            {
                end=Math.max(end,k[1]);
            }
            else{
                l.add(new int[]{start,end});
                start=k[0];
                end=k[1];
            }
        }
        l.add(new int[]{start,end});
        return l.toArray(new int[0][]);
        
    }
}
