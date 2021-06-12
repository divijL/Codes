import java.util.*;
import java.lang.*;
import java.io.*;
/**
 * Write a description of reverse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reverse {

/*package whatever //do not write package name here */

/*package whatever //do not write package name here */



	public static void main () {
	int i,l;
	String rev="";
	char ch;
	Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
    String t= sc.next();
    t=t.trim();
    t=t+" ";
    l=t.length();
    for(i=0;i<l;i++)
    {
      ch=t.charAt(i);
      if(ch!=' ')
      rev=ch+rev;
      else
        {
            System.out.print(rev+" ");
            rev="";
             
        }
    }
    }}
