
/**
 * Write a description of pro25 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro25 {
public static void main(String s)
{
    int i,l,f=0;
    char ch,c;
    s=s.trim();
    l=s.length();
    System.out.println("CHARACTER FREQUENCY");
    for(c='A';c<='Z';c++)
    {
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==c)
            ++f;
}
if(f>0)
    System.out.println("  "+c+"     " +f+"  ");
    f=0;
}}} 