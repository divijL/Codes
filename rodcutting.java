import java.util.*;
public class rodcutting
{
    public static int main(int[] length,int[] price,int n, int maxl)
    {
        int[][] t=new int[n+1][maxl+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<maxl+1;j++)
            {
                if(i==0||j==0)
                t[i][j]=0;
                else
                {
                    if(length[i-1]<=j)
                    t[i][j]=Math.max(price[i-1]+t[i][j-length[i-1]],t[i-1][j]);
                    else
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][maxl];
    }
}