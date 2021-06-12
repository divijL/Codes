/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFGh {
	public static void main (String[] args) {
	    long p1=0,p=0,s=0;
		Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    for(int i=1;i<=T;i++)
	    {
	        int N=sc.nextInt();
	        int array[]=new int[N];
	        for(int j=0;j<N;j++)
	        {
	            int n=sc.nextInt();
	            array[j]=n;
	        }
	    for(int k=0;k<N;k++)
	            {
	               s=s+array[k];
	                p=p*array[k];
	                 }
	                 for(int l=1;l<=N;l++)
	            {
	                 p1=p1*l;
	                 }
	                 long x=(s-((N*(N+1))/2))/(1-(p1/p));
	                 long y=x-(s-((N*(N+1))/2));
	                 System.out.println(x+" "+y);
	        }
	}
}