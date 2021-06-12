
/**
 * Write a description of pro20 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro20 {
public static void main(String s)
{
    int i,l,v=0;
    char ch;
    s=s.trim();
    l=s.length();
    ch=s.charAt(0);
    if(ch=='A'||ch=='a'||ch=='E'||ch=='E'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='u'||ch=='U')
    {
    for(i=l-1;i>=0;i--)
    {
        System.out.print(s.charAt(i));
}
}
else
{
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
         if(ch=='A'||ch=='a'||ch=='E'||ch=='E'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='u'||ch=='U')
         ++v;
        }
        System.out.println("Number of Vowels="+v);
    }}}