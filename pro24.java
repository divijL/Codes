
/**
 * Write a description of pro24 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro24 {
public static void main(String s1,String s2)
{
    int i,l;
    char ch,c;
    String s=s1.concat(s2);
    l=s.length();
    for(c='A';c<='Z';c++)
    {
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(c==ch)
    System.out.print(ch);
}
}
}}