
import java.util.*;
public class nsr
{
    public static int[] main(int[] a)
    {
       int n=a.length;
       int[] ans=new int[n];
       Stack<Integer> stack=new Stack<Integer>();
       for(int i=n-1;i>=0;i--)
       {
           if(stack.isEmpty()==true)
           {
               ans[i]=-1;
               stack.add(a[i]);
           }
           else
           {
               while(stack.isEmpty()==false&&stack.peek()>a[i])
               {
                   stack.pop();
               }
               if(stack.isEmpty()==false)
               {
                   ans[i]=stack.peek();
                   stack.add(a[i]);
               }
               else
               {
                   ans[i]=-1;
                   stack.add(a[i]);
               }
           }
       }
      return ans;
   }
}