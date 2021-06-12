
/**
 * Write a description of pro16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro16 {
public static void main(String s)
{
    int i,l;
    s=s.trim();
    l=s.length();
    for(i=0;i<l;i++)
    {
        System.out.println(s.substring(i,l)+"#"+s.charAt(i));
}
}}