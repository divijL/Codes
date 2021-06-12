
/**
 * Write a description of test1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test1 {
    public static void main(String A,String B)
{
        int l1=A.length();
        int l2=B.length();
         int a1=0,b1=0,c=0,s=0,num=0,num1=0;
         int r;
         char ch;
        String f="";
        for(int i1=l1-1;i1>=0;--i1)
        {
            ch=A.charAt(i1);
             num = Integer.parseInt(String.valueOf(ch));
             a1=a1+num*(int)Math.pow(2,c);
             ++c;
        }
        System.out.println(a1);
        c=0;
        for(int i2=l2-1;i2>=0;--i2)
        {
            ch=B.charAt(i2);
             num1 = Integer.parseInt(String.valueOf(ch));
             b1=b1+num1*(int)Math.pow(2,c);
             ++c;
        }
        System.out.println(a1);
    s=a1+b1;
    while(s!=1)
    {
    r=s%2;
    f=String.valueOf(r)+f;
    s=s/2;
}
f="1"+f;
System.out.println(f);
}}


    
