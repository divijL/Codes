import java.util.*;
public class Largestareahistogram
{
    public int largestRectangleArea(int[] heights) {
        int n1=heights.length;
        int max=0,e=0;
        int a1[]=new int[n1];
        a1=nsl(heights);
        int a2[]=new int[n1];
        a2=nsr(heights);
        for(int j=0;j<n1;j++)
        {
            int x1=a1[j];
            int x2=a2[j];
            if(x2==-1)
                x2=n1;
            if(x1<0)
                e=(x2+(-1)*x1-1)*heights[j];
            else
                e=(x2-x1-1)*heights[j];
            if(e>max)
                max=e;
        }
        return max;
    }        

    public int[] nsl(int[] a)
    {
        int n=a.length;
        int[] ans=new int[n];
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
            if(stack.isEmpty()==true)
            {
                ans[i]=-1;
                stack.add(i);
            }
            else
            {
                while(stack.isEmpty()==false&&a[stack.peek()]>=a[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty()==false)
                {
                    ans[i]=stack.peek();
                    stack.add(i);
                }
                else
                {
                    ans[i]=-1;
                    stack.add(i);
                }
            }
        }
        return ans;
    }

    public int[] nsr(int[] a)
    {
        int n=a.length;
        int[] ans1=new int[n];
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=n-1;i>=0;i--)
        {
            if(stack.isEmpty()==true)
            {
                ans1[i]=-1;
                stack.add(i);
            }
            else
            {
                while(stack.isEmpty()==false&&a[stack.peek()]>=a[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty()==false)
                {
                    ans1[i]=stack.peek();
                    stack.add(i);
                }
                else
                {
                    ans1[i]=-1;
                    stack.add(i);
                }
            }
        }
        return ans1;
    }
}
