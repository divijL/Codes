
/**
 * Write a description of pro35 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro35 {
public static void main(String s,String w)
{
    int i,l,f=0;
    char ch;
    String n="";
    s=s.trim();
    s=s+" ";
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch!=' ')
        n=n+ch;
        else
        {
            if(n.equalsIgnoreCase(w))
            ++f;
            n="";
}
}
System.out.print(w+"  "+f);
}}