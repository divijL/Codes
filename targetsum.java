
public class targetsum
{
   public static int main(int[] a,int diff)
   {
        int range=0;
        int n1=a.length;
        for(int i=0;i<n1;i++)
        {
            range=range+a[i];
        }
        int k=(diff+range)/2;
        return subsetsum(a, k);
    }
    public static int subsetsum(int[] b, int sum)
    {
     int n=b.length;
      int t[][]=new int[n+1][sum+1];
      for(int i=0;i<n+1;i++)
      {
          for(int j=0;j<sum+1;j++)
          {
              if(i==0)
              t[i][j]=0;
              if(j==0)
              t[i][j]=1;
              else if(i!=0&&b[i-1]<=j)
              t[i][j]=t[i-1][j-b[i-1]]+t[i-1][j];
              else if(i!=0&&b[i-1]>j)
              t[i][j]=t[i-1][j];
          }
      }
      return t[n][sum];
    }}