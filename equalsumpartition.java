

public class equalsumpartition
{
    public static boolean main(int[] a)
    {
        int B=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            B=B+a[i];
        }
        if(B%2!=0)
        return false;
        else
        {
            int sum=B/2;
             boolean t[][]=new boolean[n+1][sum+1];
      for(int i=0;i<n+1;i++)
      {
          for(int j=0;j<sum+1;j++)
          {
              if(j==0)
              t[i][j]=false;
              if(i==0)
              t[i][j]=true;
              else if(a[i-1]<=j)
              t[i][j]=t[i-1][j-a[i-1]]||t[i-1][j];
              else
              t[i][j]=t[i-1][j];
          }
      }
      return t[n][sum];
        }
        }
    }