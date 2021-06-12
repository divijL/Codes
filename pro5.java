
/**
 * Write a description of pro5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro5 {
public static void main(String s)
{
    int i,l,v=0,c=0;
    char ch;
    l=s.length();
    for(i=0;i<l;i++)
    {ch=s.charAt(i);
    if(Character.isLetter(ch))
    {
        if(ch=='A'||ch=='a'||ch=='E'||ch=='E'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='u'||ch=='U')
        ++v;
        else
        ++c;
    }}
    System.out.println("Number of vowels is="+v);
    System.out.println("number of consonants is ="+c);
}}
