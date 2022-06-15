class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>m=new HashMap<Integer,Integer>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(m.containsKey(target-nums[i])==false)
            {
                m.put(nums[i],i);
            }
            else
            {
                ans[0]=m.get(target-nums[i]);
                ans[1]=i;
            }
        }
        return ans;
    }
}
