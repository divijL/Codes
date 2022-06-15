import java.util.*;
public class knapsackmemoization{
int t[][]=new int[1001][1001];
    public int solve(int[] A, int[] B, int C) {
        int n=A.length;
        //int t[][]=new int[n+1][C+1];
        for(int i=0;i<n+1;i++)
        Arrays.fill(t[i],-1);
        return Knapsack(A,B,C,n);
    }
       public int Knapsack(int[] val,int[] wt,int w,int N)
    {
        if(N==0||w==0)
        return 0;
        if(t[N][w]!=-1)
        return t[N][w];
        else if(wt[N-1]<=w)
        return t[N][w]=Math.max((val[N-1]+Knapsack(val,wt,w-wt[N-1],N-1)),Knapsack(val,wt,w,N-1));
        else 
        //if(wt[N-1]>w)
        return t[N][w]=Knapsack(val,wt,w,N-1);
    }
    }
