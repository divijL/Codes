
/**
 * Write a description of pro21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro21 {
public static void main(String s)
{
    int i,l;
    char ch;
    String rev="";
    s=s.trim();
    l=s.length();
    for(i=l-1;i>=0;i--)
    {
        ch=s.charAt(i);
        rev=rev+ch;
}
if(rev.equalsIgnoreCase(s))
System.out.println("It is a pallindrome string");
else
System.out.println("It is not a pallindrome string");
}}