
/**
 * Write a description of pro8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro8 {
public static void main(String s)
{
    int i,l;
    char ch;
    String a="";
    s=s.trim();
    s=s+" ";
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch!=' ')
        a=a+ch;
        else
        {System.out.println(a);
        a="";}
    }

}}