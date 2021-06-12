
/**
 * Write a description of pro31 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro31 {
public static void main(String s)
{
    int i,j,l;
    char ch,ch1;
    s=s.trim();
    l=s.length();
    
        for(j=l-1;j>=0;j--)
        {
        ch=s.charAt(j);
        System.out.print(ch);
       
}
for(i=l-2;i>=0;i--)
    {
ch1=s.charAt(i);
System.out.print("\n" + ch1);
}}}