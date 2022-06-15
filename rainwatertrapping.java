
import java.util.*;
public class rainwatertrapping
{
    public int trap(int[] height) {
        int l=height.length;
        int[] ngr=new int[l];
        int sum=0;
        Map<Integer,Integer> m=new HashMap<>();
        //approach
        //find nearest greater to left and right 
        //substract to find breadth 
        //find height by finding minimum og ngl and ngr minus height of that bar
        //store index in stack
        Stack<Integer> r=new Stack<>();
        for(int i=l-1;i>=0;i--)
        {
            if(r.isEmpty()==true)
            {
                ngr[i]=-1;
                r.add(i);
            }
            else
            {
                while(r.isEmpty()==false&&height[r.peek()]<=height[i])
                    r.pop();
                if(r.isEmpty()==false)
                {
                    ngr[i]=r.peek();
                    r.add(i);
                }
                else
                {
                    ngr[i]=-1;
                    r.add(i);
                }
            }
        }
        Stack<Integer> s=new Stack<>();
        int[] ngl=new int[l];
        for(int i=0;i<l;i++)
        {
            if(s.isEmpty()==true)
            {
                ngl[i]=-1;
                s.add(i);
            }
            else
            {
                while(s.isEmpty()==false&&height[s.peek()]<=height[i])
                    s.pop();
                if(s.isEmpty()==false)
                {
                    ngl[i]=s.peek();
                    s.add(i);
                }
                else
                {
                    ngl[i]=-1;
                    s.add(i);
                }
            }
            if(ngl[i]>=0&&ngr[i]>=0)
            {
                if(m.containsKey(ngr[i])==false)
                {m.put(ngr[i],ngr[i]-ngl[i]);
                    sum=sum+((ngr[i]-ngl[i]-1)*(Math.min(height[ngl[i]],height[ngr[i]])-height[i]));
                }
                else
                {
                    if(m.get(ngr[i])!=(ngr[i]-ngl[i]))
                    {m.put(ngr[i],ngr[i]-ngl[i]);
                        sum=sum+((ngr[i]-ngl[i]-1)*(Math.min(height[ngl[i]],height[ngr[i]])-height[i]));  
                    }}                          
            }}
        return sum;
    }
}