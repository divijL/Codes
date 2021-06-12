/**
 * Write a description of search3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class search3 {
    public int sqrt(int A) {
        int res=0;
        
        if(A>=1500000)
        {
        int p=A/1000;
        int[] arr=new int[p];
        for(int i=0;i<p;i++)
        {
            arr[i]=i;
        }
        int start=0;
        int end=p-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if((arr[mid]*arr[mid])==A)
            return arr[mid];
            else if((arr[mid]*arr[mid])>A)
            end=mid-1;
            else if((arr[mid]*arr[mid])<A)
            {
                res=mid;
                start=mid+1;
            }
        }
        return res;
    }
    else
    {
        int[] arr1=new int[A];
        for(int i=0;i<A;i++)
        {
            arr1[i]=i;
        }
        int start=0;
        int end=A-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if((arr1[mid]*arr1[mid])==A)
            return arr1[mid];
            else if((arr1[mid]*arr1[mid])>A)
            end=mid-1;
            else if((arr1[mid]*arr1[mid])<A)
            {
                res=mid;
                start=mid+1;
            }
        }
        return res;
    }
    }
}




