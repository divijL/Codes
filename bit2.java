class bit2 {
    public int reverse(int x) {
        int r,reverse=0;
        if(x>0)
        {
         while(x!=0)
         {
            r=x%10;
            reverse=reverse*10+r;
                x=x/10;
        }
    }
        else
        {
            x=x*(-1);
            while(x!=0)
         {
            r=x%10;
            reverse=reverse*10+r;
                x=x/10;
        }
            reverse=reverse*(-1);
        }
        if(reverse>=(-1)*Math.pow(2,31)&&reverse<=(Math.pow(2,31)-1))
        return reverse;
        else
            return 0;
}}