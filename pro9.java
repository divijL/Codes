
/**
 * Write a description of pro9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro9 {
public static void main(String s)
{
    int i,l,c=0;
    char ch;
   
    
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch!=' '&& Character.isLetterOrDigit(ch)==false)
        ++c;
    }System.out.println(c);
        }
    }
