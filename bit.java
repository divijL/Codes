
/**
 * Write a description of bit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bit {
public static void main()
{
    String str="111";
   	   int c=0;
	    str=str.trim();
	    int l=str.length();
	    for(int j=0;j<l-1;j++)
	    {
	        if(str.charAt(j)==str.charAt(j+1))
	        {
	            
	            str=str.replace((char)str.charAt(j+1),(char)(1-str.charAt(j+1)));
	            ++c;
	        }
	    }
	    System.out.println(c);
	    c=0;
	}
}
