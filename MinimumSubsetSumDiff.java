
public class MinimumSubsetSumDiff
{
    public static int main(int[] a)
    {
        int n=a.length;
        int range=0;
        for(int i=0;i<n;i++)
        {
            range=range+a[i];            
        }
        int cutoff=range/2;
        int j=cutoff;
        for(j=cutoff;j>=0;j--)
        {
            if(subsetsum(a,j)==true)
            {
                return range-2*j;
            }
        }
        return range-2*j;
    }
    public static boolean subsetsum(int[] b,int sum)
    {
        
      int n=b.length;
      boolean t[][]=new boolean[n+1][sum+1];
      for(int i=0;i<n+1;i++)
      {
          for(int j=0;j<sum+1;j++)
          {
              if(i==0)
              t[i][j]=false;
              if(j==0)
              t[i][j]=true;
              
              else if(i!=0&&b[i-1]<=j)
              t[i][j]=t[i-1][j-b[i-1]]||t[i-1][j];
              else if(i!=0&&b[i-1]>j)
              t[i][j]=t[i-1][j];
          }
      }
      return t[n][sum];
  }
}
    