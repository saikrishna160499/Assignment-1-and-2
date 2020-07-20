package demo;
import java.util.Scanner;
public class NumbersRange 
{
	public static void main(String[] args)  
	{
	int i,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers of n:");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		System.out.println("range from "+i);
	}

}
}