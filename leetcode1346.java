
import java.util.*;
public class leetcode1346
{
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set=new HashSet<>(); 		//declaring hashset to add and check all the numbers
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)				//check if number is even so that we can check if half of number exist in hashset
            {
                if(set.contains(arr[i]/2)==true)	//check if half of number is already added in hashset
                    return true;
                else if(set.contains(arr[i]*2)==true)	//check if double of number is already added in hashset
                    return true;
                else
                    set.add(arr[i]);			//if not present add that number in hashset
            }
            else					//checking same for odd numbers
            {
                if(set.contains(arr[i]*2)==true)
                    return true;
                else
                    set.add(arr[i]);
            }
    }
        return false;					//if no match found return false
}
}