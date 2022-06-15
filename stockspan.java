import java.util.*;
public class stockspan
{
       public static int[] calculateSpan(int price[], int n)
    {
     Stack<Integer> stack=new Stack<Integer>();
        int[] ans=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(stack.isEmpty()==true)
            {ans[i]=1;
                stack.add(i);}
            else
            {
                while(stack.isEmpty()==false&&price[stack.peek()]<=price[i])
                {k=stack.peek();
                    stack.pop();}
                
                if(stack.isEmpty()==false)
                {int add=stack.peek();
                    ans[i]=i-add;
                    stack.push(i);}
                    else
                    {
                    ans[i]=i+1;
                    stack.push(i);
                    }
            }
        }
          return ans;
    }
}