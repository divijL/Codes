
/**
 * Write a description of pro19 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro19 {
public static void main(String s)
{
    int i,l;
    s=s.trim();
    l=s.length();
    for(i=l-1;i>=0;i--)
    {
        System.out.println(s.substring(i,l));
}
}
}