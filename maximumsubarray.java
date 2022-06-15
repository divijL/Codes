class Solution {//kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(sum+nums[i]>0)
            {sum=sum+nums[i];
             if(sum>max)
                 max=sum;
        }
            else
            { 
             if(sum+nums[i]>max)
                 max=sum+nums[i];
                sum=0;
            }
        }
            return max;
    }
}
