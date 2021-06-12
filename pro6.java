
/**
 * Write a description of pro6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro6 {
public static void main(String s)
{
    int l,i,c=0,w;
    char ch;
    s=s.trim();
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch==' ')
        ++c;
    }
    w=c+1;
    System.out.println("number of words="+w);
}}
