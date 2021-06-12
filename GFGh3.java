/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFGh3 {
	public static void main (String[] args) {
	    int c=0,s1=0,s2=0;
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
		        if(k==0)
		        s1=0;
		        else
		        s1=s1+array[k-1];
		        if(k!=N-1)
		        {
		        for(int l=k+1;l<N;l++)
		        {
		          s2=s2+array[l];  
		        }}
		        else
		        {s2=0;}
		        if(s1==s2)
		        ++c;
		        s2=0;
		    }
		    if(c>0)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		}
		        
		    }
		}
