import java.util.*;
public class ngr
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int[] ans=new int[l1];
        Stack<Integer> stack=new Stack<Integer>();
        Map<Integer,Integer> set=new HashMap<Integer,Integer>();
        for(int i=l2-1;i>=0;i--)
        {
            if(stack.isEmpty()==true)
            {set.put(nums2[i],-1);
                stack.add(nums2[i]);}
            else
            {
                while(stack.isEmpty()==false && stack.peek()<nums2[i])
                    stack.pop();
                if(stack.isEmpty()==false&&stack.peek()>nums2[i])
                {set.put(nums2[i],stack.peek());
                    stack.add(nums2[i]);}
                else
                {
                    set.put(nums2[i],-1);
                    stack.add(nums2[i]);
                }
            }
        }
        for(int j=0;j<l1;j++)
        {
            int a=set.get(nums1[j]);
            ans[j]=a;
        }
        return ans;
    }}
 