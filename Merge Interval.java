class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>(); 
        int l=intervals.length;
         if(intervals.length == 0 || intervals == null) 
            return a.toArray(new int[0][]);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(intervals[0][0]);
        b.add(intervals[0][1]);
        for(int i=1;i<l;i++)
        {
            
            if(b.get(1)>=intervals[i][0])
            {
                int max=Math.max(b.get(1),intervals[i][1]);
            b.set(1,max);
            }
            else
            {
               ArrayList c
            = (ArrayList)b.clone();
                a.add(c);
             b.set(0,intervals[i][0]);
            b.set(1,intervals[i][1]);
            }
        }
a.add(b);
        int[][] arr=new int[a.size()][2];
        for(int i=0;i<a.size();i++)
        {
            arr[i][0]=a.get(i).get(0);
            arr[i][1]=a.get(i).get(1);
        }
        return arr;
    }
}
