import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.io.*;
class palidrome
{
    public static void main(String a1[])
    {
        String d,d1="";
        Scanner s=new Scanner(System.in);
        d=s.nextLine();
        for(int i=(d.length()-1);i>=0;i--)
        {
            d1=d1+d.charAt(i);
        }
        System.out.println(d1);
        if(d.equalsIgnoreCase(d1))
        System.out.println("palindrome");
        else
        System.out.println("not a palindrome");
    }
}