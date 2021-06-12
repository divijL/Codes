public class addition {
    public String addBinary(String A, String B) {
        int l1=A.length();
        int l2=B.length();
        String w="";
        int flag=0,sum=0;
        if(l1>=l2)
        {
            for(int i=0;i<l1-l2;i++)
            {
                B='0'+B;
            }
        }
        else
        {
            for(int i=0;i<l2-l1;i++)
            {
                A='0'+A;
            }
        }
        //System.out.println(l1+"___"+l2);
        int l=A.length();
        //System.out.println(l1+"___"+l2+"___"+l);
            for(int i=l-1;i>=0;i--)
            {
                char ch1=A.charAt(i);
                char ch2=B.charAt(i);
                if(ch1=='1'&&ch2=='1')
                {
                    if(flag==0){
                    sum+=0;
                    flag=1;  
                    }
                    else if(flag==1){
                        sum+=1;
                        flag=1;
                    }
                }
                else if((ch1=='1'&&ch2=='0')||(ch1=='0'&&ch2=='1'))
                {
                    if(flag==0){
                    sum+=1;
                    flag=0;
                    }
                    else if(flag==1){
                        sum+=0;
                    flag=1;}
                }
                else if(ch1=='0'&&ch2=='0')
                {
                    sum+=0+flag;
                    flag=0;                    
                }
                w=Integer.toString(sum)+w;
                sum=0;
            }
            if(flag==1)
            w='1'+w;
                return w;        
    
    }
}