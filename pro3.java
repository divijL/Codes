
/**
 * Write a description of pro3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro3 
{
public static void main(double a,double b)
{
    double s=0.0,p=0.0,n1,n2,d1,d2;
    if(a>0)
    n1=Math.floor(a);
    else
    n1=Math.ceil(a);
    d1=a-n1;
     if(b>0)
    n2=Math.floor(b);
    else
    n2=Math.ceil(b);
    d2=a-n1;
    s=d1+d2;
    p=n1*n2;
    System.out.println("sum of decimal part is ="+s);
    System.out.println("product of integer part is ="+p);
}
}
