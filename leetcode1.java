
/**
 * Write a description of leetcode1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class leetcode1 {

    public int minSteps(String s, String t) {
        int c1=0;
            String a="",b="";
        int l=s.length();
        for(char c='a';c<='z';c++)
        {
            for(int i=0;i<l;i++)
            {
                char ch=s.charAt(i);
                char ch1=t.charAt(i);
                if((ch==c)&&(ch1==c))
                {
                    a=a+ch;
                    b=b+ch1;
                }
                else if((ch==c)&&(ch1!=c))
                    a=a+ch;
                else if((ch!=c)&&(ch1==c))
                    b=b+ch1;
                
            }
        }
        System.out.println("s="+a);
        System.out.println("t="+b);
        for(int i=0;i<l;i++)
        {
            char ch=a.charAt(i);
            char ch1=b.charAt(i);
            if(ch!=ch1)
                ++c1;
        }
        return c1;
    }
}