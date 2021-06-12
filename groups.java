
/**
 * Write a description of groups here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
import java.lang.*;
import java.io.*;
public class groups {
/* package codechef; // don't place package name! */


public static void main (String[] args) throws java.lang.Exception
	{
	int group=0,c=0,j=0;
	char ch1='1';
	//Scanner sc=new Scanner(System.in);
	//int T=sc.nextInt();
	    String s="111";
	       int l=s.length();
	       while(j<l)
	       {
	              char ch=s.charAt(j);
	              int diff=ch-ch1;
	              while(diff==0 && j<l)
	              {
	                     ++c;
	                     ++j;
	                     if(j<l)
	                     {ch=s.charAt(j);
	                     diff=ch-ch1;}
	              }
	              if(c>0)
	              ++group;
	              ++j;
	              c=0;
	       }
	       System.out.println(group);
	       group=0;
	       j=0;
	       c=0;
	}// your code goes here
	}

