
/**
 * Write a description of pro7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro7 {
public static void main(String s)
{
    int i,l;
    char ch;
    s=s.trim();
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        System.out.println(ch+" "+(int)ch);
    }
}
}

