
/**
 * Write a description of google here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class google {
    
    public int cntBits() {
        int s=0,r,count=0,ans=0;
        ArrayList<Integer> A=new ArrayList<Integer>();
        A.add(1);
        A.add(3);
        A.add(5);
        int N=A.size();
        if(N==1)
        return 0;
        else
        {
        for(int i=0;i<=N-2;i++)
        {
            for(int j=i+1;j<=N-1;j++)
            {
                s=A.get(i)^A.get(j);
                while(s!=0)
                {
                    r=s%10;
                    if(r==1)
                    ++count;
                    s=s/10;
                }
                ans=ans+2*count;
                count=0;
                s=0;
            }
        }
        //ans=ans%1000000007;
        return ans;
    }
}


}
