
/**
 * Write a description of pro2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro2 {
public static void main( int a ,int b)
{
    int max,min;
    double sq,cube;
    max=Math.max(a,b);
    min=Math.min(a,b);
    sq=Math.sqrt(min);
    cube=Math.pow(max,3);
    System.out.println("square root of the smallest number="+sq);
    System.out.println("cube of the largest number="+cube);
}
}