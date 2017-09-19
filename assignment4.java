import java.util.Scanner;
import java.util.*;
class sorting
{
	public static void main(String a[])
	{
		int i,j,k,n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
	    String temp="";	
		String names[]=new String[n+1];
		for(i=0;i<=n;i++)
		{
			names[i]=s.nextLine();
		}
		for(i=0;i<=n;i++)
			for(j=i+1;j<=n;j++)
			{
				if(names[i].compareTo(names[j])<0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
System.out.println("Sorted order is");
for(i=0;i<=n;i++)
{
			System.out.println(names[i]);
}
     }
}