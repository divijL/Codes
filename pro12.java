
/**
 * Write a description of pro12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro12 {
public static void main(String s)
{
    int i,l;
    char ch;
    s=s.trim();
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(Character.isUpperCase(ch))
        System.out.print(Character.toLowerCase(ch));
        else if(Character.isLowerCase(ch))
        System.out.print(Character.toUpperCase(ch));
        else
        System.out.print(ch);
}
}}