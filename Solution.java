
/**
 * Write a description of pro30 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int i,j;
        char ch;
        int c=0;
        String str="";
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==' '||ch=='!'||ch==','||ch=='?'||ch=='.'||ch=='_'||(int)ch==39||ch=='@')
         { 
            ++c;
         }
        }
        System.out.println(c);
        for(j=0;j<l;j++)
        {
            ch=s.charAt(i);
            if(ch!=' '&&ch!='!'&&ch!=','&&ch!='?'&&ch!='.'&&ch!='_'&&(int)ch!=39&&ch!='@')
          str=str+ch;
          else
          {
             System.out.println(str); 
             str="";
          }

        }
        // Write your code here.
        scan.close();
    }
}

