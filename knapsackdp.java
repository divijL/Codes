import java.util.*;
public class knapsackdp
{
public static void main(int wt[],int val[],int w,int n)
{
    int t[][]=new int[n+1][w+1];
    for(int i=0;i<n+1;i++)
    {
        for(int j=0;j<w+1;j++)
        {
            if(i==0||j==0)
            t[i][j]=0;
            else
            {
            if(wt[i-1]<=j)
        t[i][j]=Math.max((val[i-1]+t[i-1][j-wt[i-1]]),t[i-1][j]);
        else 
        //if(wt[N-1]>w)
         t[i][j]=t[i-1][j];
            }
        }
    }
    System.out.println(t[n][w]);
}
}