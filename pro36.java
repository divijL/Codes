
/**
 * Write a description of pro36 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro36 {
public static void main(String s)
{
    int i,l;
    char ch;
    String w="";
    s=s.trim();
    s=s+"  ";
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch!=' ')
        w=ch+w;
        else
        {
            System.out.print(w+" ");
            w="";
}
}}}