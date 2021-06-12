
/**
 * Write a description of pro22 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro22 {
public static void main(String s)
{
    int i,l;
    char ch;
    String nw="";
    s=s.trim();
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch!='A'&& ch!='E'&& ch!='I'&& ch!='O'&& ch!='U')
        nw=nw+ch;}
        System.out.println(nw);
       
}
}