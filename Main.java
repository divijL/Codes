package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Main
{
        public static void main(String[] args) throws IOException
        {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            int n =Integer.parseInt(reader.readLine());
            String s=reader.readLine();
            int[] a=new int[n];
            String[] s1=s.split(" ");
            for(int i=0;i<n;i++)
            {
                a[i]=Integer.parseInt(s1[i]);
            }
            int i=0,low=0,mid=0,high=n-1,temp=0;
            while(mid<=high)
            {
                int ele=a[mid];
                switch (ele)
                {
                    case 0:
                        if(a[low]!=a[mid])
                        {
                            temp=a[mid];
                            a[mid]=a[low];
                            a[low]=temp;
                        }
                        ++mid;
                        ++low;
                        break;
                    case 1:
                        ++mid;
                        break;
                    case 2:
                        if(a[high]!=a[mid])
                        {
                            temp=a[mid];
                            a[mid]=a[high];
                            a[high]=temp;
                        }
                        --high;
                        break;
                }
            }
            for(int j=0;j<n;j++)
            System.out.print(a[j]+" ");
        }
}