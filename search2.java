
/**
 * Write a description of search2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*; 
import java.util.*;
public class search2 {

    public int solve(ArrayList<Integer> A, int B) {
       int start=0;
       int end=A.size()-1;
       int res=0;
       while(start<=end)
       {
           int mid=start+(end-start)/2;
           if(A.get(mid)>=A.get(mid+1)&&A.get(mid)>=A.get(mid-1))
           {res=mid;
           break;}
           else if(A.get(mid)<A.get(mid+1)&&A.get(mid)>A.get(mid-1))
           start=mid+1;
           else if(A.get(mid)>A.get(mid+1)&&A.get(mid)<A.get(mid-1))
           end=mid-1;
       }
       System.out.println("res="+res);
       if(B>A.get(res))
       return -1;
       else if(B>=A.get(res+1))
       {
       start=res;
       end=A.size()-1;
        while(start<=end)
       {
           int mid=start+(end-start)/2;
           if(A.get(mid)==B)
           return mid;
           else if(A.get(mid)<B)
           end=mid-1;
           else if(A.get(mid)>B)
           start=mid+1;
       }
       }
       else if(B<=A.get(res-1))
       {
       start=0;
       end=res-1;
        while(start<=end)
       {
           int mid=start+(end-start)/2;
           if(A.get(mid)==B)
           return mid;
           else if(A.get(mid)<B)
           start=mid+1;
           else if(A.get(mid)>B)
           end=mid-1;
       }
       }
       
        return -1;
    }
}


