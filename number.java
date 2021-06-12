
/**
 * Write a description of number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class number 
{
public static void main(int n)
{
int a;
double l=0.0,sq=0.0,rad=0.0;
l=Math.log(n);
a=Math.abs(n);
sq=Math.sqrt(n);
rad=Math.random();
System.out.println("Logarithm of a number ="+l);
System.out.println("Absolute value ="+a);
System.out.println("Square root of a number ="+sq);
System.out.println("random number between 0 and 1 ="+rad);
}
}