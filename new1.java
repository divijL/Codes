
import java.util.*;
import java.lang.*;
import java.io.*;

public class new1 {
   public static void main(String[] args)
   {
       int k1,c=0;
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] array1 = new int[n];
       for(int i=0;i<n;i++)
       {
           int p=sc.nextInt();
           array1[i]=p;
       }
       Arrays.sort(array1);
       int l=array1.length;
       System.out.println(l);
       for(int j=0;j<l;j=j+c)
       {
           c=0;
        k1=array1[j];
           for(int k=j;k<l;k++)
           {
               if(k1==array1[k])
               ++c;
               else
               break;
       }
       System.out.println(l-c);
       }
   }
}