/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFGh4 {
	public static void main (String[] args) {
	    int c=0;
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	for(int i=1;i<T;i++)
	{
	    int N=sc.nextInt();
	    int x=sc.nextInt();
	    int array[]=new int[N];
		    for(int j=0;j<N;j++)
		    {
		        int n=sc.nextInt();
		        array[j]=n;
		    }
		    for(int k1=0;k1<N;k1++)
		    {
		        if(array[k1]==x)
		        {
		            ++c;
		            System.out.print(k1+" ");
		            break;
		        }
		    }
		    if(c==1)
		    {
		     for(int k2=N-1;k2>=0;k2--)
		    {
		        if(array[k2]==x)
		        {
		            System.out.print(k2);
		            break;
		        }
		    }   
		    }
		    else
		    System.out.print("-1");
		    c=0;
		    System.out.println();
	}//code;
	}
}