
/**
 * Write a description of pro39 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro39 {
public static void main(String s,int x)
{
    int i,l;
    char ch;
    s=s.trim();
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        ch+=x;
        if(ch>90)
        ch-=26;
        System.out.print(ch);
    }}}



