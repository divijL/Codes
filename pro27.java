
/**
 * Write a description of pro27 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro27 {
public static void main(String s)
{
    int i,pos,l;
    char ch;
    s=s.trim();
    s=" "+s;
    pos=s.lastIndexOf(' ');
    l=s.length();
    System.out.print(s.substring(pos,l)+" ");
    for(i=0;i<pos;i++)
    {
        ch=s.charAt(i);
        if(ch==' ')
        System.out.print(s.charAt(i+1)+".");
    }}
}
