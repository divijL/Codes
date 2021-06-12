
/**
 * Write a description of pro49 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int min=0,pos=0,r;
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
	        int k=sc.nextInt();
	        int Z=N;
	        for(int m=1;m<=k;m++)
	        {
	         min=array[0];
	        for(int l=1;l<Z;l++)
	        {
	            if(min>array[l])
	            {min=array[l];
	            pos=l;}
	        }
	        Z=Z-1;
	        r=array[pos];
	       array[pos]=array[Z];
	       array[Z]=r;
	       pos=0;
	    }
	    System.out.println(min);
		//code
	}
}
}
