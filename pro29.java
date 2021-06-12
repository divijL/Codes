
/**
 * Write a description of pro29 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro29 {
public static void main(String s1,String s2)
{
    int j,l1,l2;
    char ch,c;
    String str="",str1="";
   s1=s1.trim();
   s2=s2.trim();
   l1=s1.length();
   l2=s2.length();
   if(l1==l2)
   {
       for(c='A';c<='Z';c++)
       {
           for(j=0;j<l1;j++)
           {
               ch=s1.charAt(j);
               if(ch==c)
               str=str+ch;
            }}
              for(c='A';c<='Z';c++)
       {
           for(j=0;j<l2;j++)
           {
               ch=s2.charAt(j);
               if(ch==c)
               str1=str1+ch;
            } }}
   if(str.equals(str1))
   System.out.print("These are anagram words");
   else
   System.out.print("These are not anagram words");
}}
