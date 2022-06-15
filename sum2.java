import java.util.*;
class sum2 {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int a=0;
        int n=nums.length;
        Map<Integer,Integer> s=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            if(s.containsKey(nums[i])==false)
            {
            a=target-nums[i];
            s.put(a,i);
            }
            else
            {
                ans[0]=i;
                ans[1]=s.get(nums[i]);
            }
        }
        return ans;
    }
}