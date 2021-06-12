
/**
 * Write a description of pro33 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro33 {
public static void main(String s)
{
    int i,l;
    char ch,ch1;
    String w="";
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
            System.out.println(w+"  "+w.length());
            w="";
        
}}}}
