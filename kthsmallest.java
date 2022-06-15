import java.util.*;
public class kthsmallest
{
    public static int main(int[] a,int k)
    {
        PriorityQueue<Integer> max=new PriorityQueue<Integer>(Collections.reverseOrder());
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(i<k)
            max.add(a[i]);
            else
            {
                if(max.peek()>a[i])
                {max.poll();
                max.add(a[i]);}
            }
        }
        return max.peek();
    }
    }