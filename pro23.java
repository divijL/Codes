
/**
 * Write a description of pro23 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro23 {
public static void main(String s)
{
    int i,j,l;
    char ch,c;
    String nw="";
    s=s.trim();
    l=s.length();
    for(c='A';c<='Z';c++)
    {
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if(ch==c)
            nw=nw+ch;
}
}
System.out.println(nw);}}