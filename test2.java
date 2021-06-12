public class test2 {
    public String addBinary(String A, String B) {
        int l1=A.length();
        int l2=B.length();
        String f="",carry="0";
        char ch1,ch2;
        int s1=0;
        if(l1>=l2)
        {
            s1=l1-l2;
            for(int i=1;i<=s1;i++)
            B="0"+B;
        }
        else
        {
            s1=l2-l1;
            for(int i=1;i<=s1;i++)
            A="0"+A;
        }
        l1=A.length();
        l2=B.length();
        for(int i=l1-1;i>=0;i--)
        {
        ch1=A.charAt(i);
        ch2=B.charAt(i);
            
            if(ch1=='0'&&ch2=='0'&&carry=="0")
            {f=carry+f;
            carry="0";}
            
            else if(ch1=='1'&&ch2=='0'&&carry=="1"||ch1=='0'&&ch2=='1'&&carry=="1"||ch1=='1'&&ch2=='1'&&carry=="0")
            {f="0"+f;
            carry="1";}
            else if(ch1=='1'&&ch2=='0'&&carry=="0"||ch1=='0'&&ch2=='1'&&carry=="0"||ch1=='0'&&ch2=='0'&&carry=="1")
            {f="1"+f;
            carry="0";}
            else if(ch1=='1'&&ch2=='1'&&carry=="1")
            {f="1"+f;
            carry="1";}
            
        }
        if(carry=="1")
        f="1"+f;
        return f;
    }
}