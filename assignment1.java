import java.util.Scanner;
class prime
{
    public static void main(String a[])
    {
        int i,j,n,p;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=2;i<=n;i++)
        {
            p=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    p++;
                }
            }
            if(p==0)
            {
                System.out.println(i);
            }
        }
    }
}