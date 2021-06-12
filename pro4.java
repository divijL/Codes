
/**
 * Write a description of pro4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro4 {
public static void main(String s)
{
    int l,le=0,d=0,uc=0,i;
    char ch;
    l=s.length();
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(Character.isLetter(ch))
        ++le;
        if(Character.isDigit(ch))
        ++d;
        if(Character.isUpperCase(ch))
        ++uc;
    }
    System.out.println("Number of letters ="+le);
    System.out.println("Number of digit ="+d);
    System.out.println("Number of upper case letters  ="+uc);
}}
    
    



