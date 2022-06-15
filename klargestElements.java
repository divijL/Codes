import java.util.*;
public class klargestElements
{
   public static int[] main(int[] a,int k)
   {
       int[] ans=new int[k];
       int n=a.length;
       PriorityQueue<Integer> min=new PriorityQueue<Integer>();
       for(int i=0;i<n;i++)
       {
           if(i<k)
           min.add(a[i]);
           else
           {
               if(min.peek()<a[i])
               {
                   min.poll();
                   min.add(a[i]);
               }
           }
       }
       for(int j=0;j<k;j++)
       {
           ans[j]=min.peek();
           min.poll();
       }
       return ans;
    }
   }