package com.company;

public class repeatmissing {
 nt[] findTwoElement(int nums[], int g) {
         int l=nums.length;
        int xor1=nums[0],xor2=1;
        for(int i=1;i<l;i++)
        {
            xor1=xor1^nums[i];
        }
        for(int i=2;i<=l;i++)
        {   xor2=xor2^i;}
        int n=xor1^xor2;//find the righmost set bit in n
        String s=Integer.toBinaryString(n);
        int li=s.length();
        int t=li;
    long b=Long.parseLong(s);
        int pos=0;
        while(b!=0)
        {
            long r=b%10;
            if(r==1)
                break;
            pos++;
            b=b/10;
        }
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<l;i++)
        {
            int x=nums[i];
            String s1=Integer.toBinaryString(x);
            if(s1.length()>(li-pos-1)&&s1.length()==li)
            {
            char ch=s1.charAt(li-pos-1);
            if(ch=='1')
                a1.add(x);
            else
                a2.add(x);
            }
              else
              {
                  if(s1.length()>li)
                  {
                  int min=Math.min(s1.length(),li);
                  int max=Math.max(li,s1.length());
                  int diff=max-min;
                    li=diff+li;
                  }
                  else
                  {
                      int min=Math.min(s1.length(),li);
                  int max=Math.max(li,s1.length());
                  int diff=max-min;
                      for(int j=1;j<=diff;j++)
                          s1='0'+s1;
                  }
                  if(s1.length()>(li-pos-1)&&s1.length()==li)
            {
            char ch=s1.charAt(li-pos-1);
            if(ch=='1')
                a1.add(x);
            else
                a2.add(x);
            }
              }
                li=t;
        }
         for(int i=1;i<=l;i++)
        {
            int x=i;
            String s1=Integer.toBinaryString(x);
            if(s1.length()>(li-pos-1)&&s1.length()==li)
            {
            char ch=s1.charAt(li-pos-1);
            if(ch=='1')
                a1.add(x);
            else
                a2.add(x);
            }
              else
              {
                  if(s1.length()>li)
                  {
                  int min=Math.min(s1.length(),li);
                  int max=Math.max(li,s1.length());
                  int diff=max-min;
                    li=diff+li;
                  }
                  else
                  {
                      int min=Math.min(s1.length(),li);
                  int max=Math.max(li,s1.length());
                  int diff=max-min;
                      for(int j=1;j<=diff;j++)
                          s1='0'+s1;
                  }
                  if(s1.length()>(li-pos-1)&&s1.length()==li)
            {
            char ch=s1.charAt(li-pos-1);
            if(ch=='1')
                a1.add(x);
            else
                a2.add(x);
            }
              }
                li=t;
        }
        
        int len1=a1.size();
        int len2=a2.size();
        int xor4=nums[0],xor3=nums[0];
        if(len1>0)
        {
        xor3=a1.get(0);
        for(int i=1;i<len1;i++)
        {
           xor3=xor3^a1.get(i);
        }
        }
        if(len2>0)
        {
        xor4=a2.get(0);
         for(int i=1;i<len2;i++)
        {
           xor4=xor4^a2.get(i);
        }
        }
        int repeating=0;
         for(int i=0;i<nums.length;i++)
        {
          if(xor4==nums[i])
              repeating++;
        }
        int aj[]=new int[2];
        if(repeating>=1)
    {aj[0]=xor4;
    aj[1]=xor3;}
        else
         {aj[0]=xor3;
    aj[1]=xor4;}
         return aj;
    }
}

