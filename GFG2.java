/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG2 {
	public static void main (String[] args) {
	    int p=0,r=0;
	     ArrayList<Integer> all = new ArrayList<Integer>();
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    for(int i=1;i<=T;i++)
	    {
	        int a=sc.nextInt();
	        int n=sc.nextInt();
	        for(int j=1;j<=n;j++)
	        {
	            p=(int)Math.pow(a,j);
	            while(p!=0)
	            {
	                r=p%10;
	                if(r!=0)
	                {all.add(p);}
	                p=p/10;
	            }
	        }
	        Collections.sort(all);
	        for(int k=0;k<all.size();k++)
	        {
	            System.out.print(all.get(k));
	        }
	        System.out.println();
	        all.clear();
	    }
		//code
	}
}