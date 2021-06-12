
/**
 * Write a description of pro13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro13 {
public static void main(String s)
{
    int i,l;
    char ch,ch1;
    String nw="";
    s=s.trim();
    l=s.length();
    ch=s.charAt(0);
   
    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
        nw=s.substring(2,l);
        System.out.println("*"+nw);
    }
    else
     System.out.println(s.toLowerCase());
    }}
