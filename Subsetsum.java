

public class Subsetsum
{
  public static boolean main(int[] a,int sum)
  {
      int n=a.length;
      boolean t[][]=new boolean[n+1][sum+1];
      for(int i=0;i<n+1;i++)
      {
          for(int j=0;j<sum+1;j++)
          {
              if(i==0)
              t[i][j]=false;
              if(j==0)
              t[i][j]=true;
              
              else if(i!=0&&a[i-1]<=j)
              t[i][j]=t[i-1][j-a[i-1]]||t[i-1][j];
              else if(i!=0&&a[i-1]>j)
              t[i][j]=t[i-1][j];
          }
      }
      return t[n][sum];
  }
}