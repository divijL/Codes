
/**
 * Write a description of Amazon1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amazon1 {

    public int solve(int A) {
        int r,c=0,s=0,p=0;
        for(int n=1;n<=A;n++)
        {
            p=n;
            while(p>=1)
            {
            r=p%2;
            if(r==1)
            ++c;
            //s=String.valueOf(r)+s;
            p=p/2;
        }
        s=s+c;
        c=0;
        }
        //s=s%1000000007;
        return s;
    }
}


