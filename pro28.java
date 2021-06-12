
/**
 * Write a description of pro28 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro28 {
public static void main(String s)
{
    int i,l;
    char ch;
    s=s.trim();
    l=s.length();
    s=s.toLowerCase();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        System.out.print(++ch);
        else
        System.out.print(ch);
    }}}
