import java.lang.*;
import java.util.Scanner;
abstract class shape 
{
    abstract void numberofsides();
}
class Trapazoid extends shape
{
 public void numberofsides()
 {
     System.out.println("NUmber of sides are 4");
 }
}
class Triangle extends shape
{
 public void numberofsides()
 {
     System.out.println("NUmber of sides are 3");
 }
}
class Hexagon extends shape
{
 public void numberofsides()
 {
     System.out.println("NUmber of sides are 6");
 }
}
class abc 
{
    public static void main(String a[])
    {
        Trapazoid t1=new Trapazoid();
        t1.numberofsides();
        Triangle t2=new Triangle();
        t2.numberofsides();
        Hexagon t3=new Hexagon();
        t3.numberofsides();
    }
}