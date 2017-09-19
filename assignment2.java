import java.util.Scanner;
import java.lang.*;
import java.io.*;
class matrix
{
    public static void main(String ar[])
    {
        int i,j,k,l;
        int m,n,p,q;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the rows and then coloumns for the first matrix :");
        m=s.nextInt();
        n=s.nextInt();
        System.out.println("enter the rows and then columns for the second matrix :");
        p=s.nextInt();
        q=s.nextInt();
        if(n==p)
        {
            int a[][]=new int[m][n];
            int b[][]=new int[p][q];
            System.out.println("enter the elements for the first matrix :");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("enter the elements for the second matrix :");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    b[i][j]=s.nextInt();
                }
            }         
            int c[][]=new int[m][q];
            for(i=0;i<m;i++)
            {
             for(j=0;j<q;j++)
             {
                 c[i][j]=0;
                 for(k=0;k<p;k++)
                 {
                     c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                 }
             }
            }
            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                {
                    System.out.println(c[i][j]);
                }
            }
        }
        else
        System.out.println("wrong entry");
    }
}