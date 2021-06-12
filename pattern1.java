
/**
 * Write a description of pattern1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pattern1 {
    public static void main(int n)
    {
        int i;
        for(int a=0;a<n;a++)
        {
            for(i=1;i<n-a;i++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n+a;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }}