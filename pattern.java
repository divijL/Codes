
/**
 * Write a description of pattern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pattern {
    public static void main(int n)
    {
        int k=1,p=1,c=0;
        while(k<=n)
        {
            while(p<=k)
            {
                int s=p+c;
                System.out.print(s+" ");
                
                ++p;}
                System.out.println();
                ++k;
                p=1;
                ++c;
            }}}

