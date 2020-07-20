package demo;
import java.util.Scanner;
public class NaturalReverse {
	public static void main(String[] args)
	{
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		r=sc.nextInt();
		for(int i=r;i>=1;i--)
		{
			System.out.println("natural number in reverse order:"+i);
		}
	}

}
