//Simple Array Sum
import java.util.Scanner;
class Array{
	public static void main(String args[])
	{
		int a[]=new int[1000];
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
			sum=sum+a[i];
		System.out.println(sum);
	}
}