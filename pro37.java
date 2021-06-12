
/**
 * Write a description of pro37 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro37 {
public static void main(String s)
{
    int i,l,lar=0;
    char ch;
    String w="",la="";
    s=s.trim();
    s=s+" ";
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch!=' ')
        w=w+ch;
        else
        {
            if(w.length()>lar)
            {
                lar=w.length();
                la=w;
            }
            w="";
        }}
        System.out.println("Largest word is "+la+"  "+lar);
    }}

