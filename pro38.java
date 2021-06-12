
/**
 * Write a description of pro38 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro38 {
public static void main(String s)
{
    int i,l;
    char ch;
    s=s.trim();
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        ch+=4;
        if(ch>90)
        ch-=26;
        System.out.print(ch);
    }}}

