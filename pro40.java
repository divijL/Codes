
/**
 * Write a description of pro40 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pro40 {
public static void main(int y)
{
    if((y%4==0&&y%100!=0)||(y%400==0))
    System.out.println("It is a leap year");
    else
    System.out.println("It is not a leap year");
}
}