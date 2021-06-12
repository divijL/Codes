
/**
 * Write a description of binary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class binary {
    public long reverse(long n) {
        
            String s="";
            long r=0;
            if(n==0)
            return n;
            else
            {
            while(n>=1)
            {
            r=n%2;
            s=s+String.valueOf(r);
            n=n/2;
        }
        //s="1"+s;
        System.out.println("Number "+n+" in binary is="+s);
        int size=s.length();
        long l=Long.parseLong(s);
        System.out.println(l);
        l=l<<(32-size);
        return l;
        
    }
}
}

