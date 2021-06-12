
/**
 * Write a description of search1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class search1 {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {
        int start=0;
        int end=A.length-1;
        int res=0;
        if(A.length>1)
        {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(A[mid]<=A[mid-1]&&A[mid]<=A[mid+1])
            {res=mid;
            break;}
            else if((A[mid]>=A[mid-1])&&(A[mid]>=A[mid+1]))
            {res=mid+1;
            break;}
            else if(A[mid]>=A[end])
                start=mid;
                else if(A[start]>=A[mid])
                end=mid;
        }
        System.out.println("res="+res);
        end=A.length-1;
        start=0;
        if(B==A[end])
        return end;
        else if(B>A[end])
        {
            int start1=0;
            int end1=res-1;
            while(start1<=end1)
            {
                int mid=start1+(end1-start1)/2;
                if(A[mid]==B)
                return mid;
                else if(A[mid]<B)
                start1=mid+1;
                else if(A[mid]>B)
                end1=mid-1;
            }
            return -1;
        }
        else if(B<A[end])
        {
            int start1=res;
            int end1=A.length-1;
            while(start1<=end1)
            {
                int mid=start1+(end1-start1)/2;
                if(A[mid]==B)
                return mid;
                else if(A[mid]<B)
                start1=mid+1;
                else if(A[mid]>B)
                end1=mid-1;
            }
            return -1;
        }
    }
    else
    {
        if(B==A[0])
        return 0;
        else
        return -1;
    }
    return 0;
}
}

