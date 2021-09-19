public class Solution {
public List<List<Integer>> generate(int numRows)
{
	List<List<Integer>> allrows = new ArrayList<List<Integer>>();
	ArrayList<Integer> row = new ArrayList<Integer>();
	for(int i=0;i<numRows;i++)
	{
		row.add(0, 1);
		for(int j=1;j<row.size()-1;j++)
			row.set(j, row.get(j)+row.get(j+1));
		allrows.add(new ArrayList<Integer>(row));
	}
	return allrows;
	
}

}

         //BY ME
// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> arr=new ArrayList<>();
//         int c=1;
//         for(int i=0;i<=numRows;i++)
//         {
//             List<Integer> a1=new ArrayList<>();
//             a1.add(1);
//             if(i==0 || i==1)
//             {
//                 if(i==1)
//                    a1.add(1);
//                 arr.add(a1);
//                 continue;
//             }
//             List<Integer> a2=new ArrayList<>(arr.get(i-1));
//             for(int j=1;j<i-1;j++)
//             {
//                 int t=a2.get(j-1)+a2.get(j);
//                  a1.add(t);                      
//             }
//             a1.add(1);
//             arr.add(a1);
//         }
        
//        arr.remove(1);
//         return arr;
//     }
// }
