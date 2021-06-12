
/**
 * Write a description of pro15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro15 {
public static void main(String s)
{
    int i,l,j;
    char ch;
    s=s.trim();
    l=s.length();
    for(i=l-1;i>=0;i--)
    {
        System.out.println(s.substring(i,l));
}
for(j=1;j<l;j++)
{
    System.out.println(s.substring(j,l));
}}}