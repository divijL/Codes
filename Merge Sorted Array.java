class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Gap Method
        int k=0;
        for(int j=m;j<m+n;j++)
        {
            nums1[j]=nums2[k];
            ++k;
        }
       int gap=0,temp=0,i=0;
        if((m+n)%2==0)
           gap=(m+n)/2;
        else
            gap=(m+n+1)/2;
        while(i+gap<m+n)
        {
            while(i+gap<m+n)
            {
            if(nums1[i]>nums1[i+gap])
            {
                temp=nums1[i];
                nums1[i]=nums1[i+gap];
                nums1[i+gap]=temp;
            }
            ++i;
            }
            //gap=gap/2;
            if(gap<2)
                break;
            else
            {
                 if((gap)%2==0)
           gap=gap/2;
        else
            gap=(gap+1)/2;
                i=0;
            }

        }
    }}
