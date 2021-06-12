
/**
 * Write a description of pro26 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro26 {
public static void main(String s)
{
    int i,pos;
    char ch;
    s=s.trim();
    s=" "+s;
    pos=s.lastIndexOf(' ');
    for(i=0;i<pos;i++)
    {
        ch=s.charAt(i);
        if(ch==' ')
        System.out.print(s.charAt(i+1)+".");
    }
    System.out.print(s.substring(pos+1));
}}

