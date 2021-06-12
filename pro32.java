
/**
 * Write a description of pro32 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro32 {
public static void main(String s)
{
    int i,l;
    char ch,ch1;
    String nw="";
    s=s.trim();
    s=s+" ";
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch1=s.charAt(i);
        if(ch1!=' ')
        {
         nw=nw+ch1;}
        else
        {
            ch=nw.charAt(0);
        if(ch=='A'||ch=='a'||ch=='E'||ch=='E'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='u'||ch=='U')
        
       System.out.println(nw);
       nw="";
    }}}
    
}
