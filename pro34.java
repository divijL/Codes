
/**
 * Write a description of pro34 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro34 {
public static void main(String s)
{
    int i,l;
    char ch;
    String w="";
    s=s.trim();
    s=" "+s;
    l=s.length();
    for(i=l-1;i>=0;i--)
    {
        ch=s.charAt(i);
        if(ch!=' ')
        w=ch+w;
        else
        {
            System.out.print(w+" ");
            w="";
        }}}
}
