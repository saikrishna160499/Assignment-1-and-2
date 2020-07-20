package demo;
import java.util.Scanner;
public class TenNaturalNumbers {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first 10 natural numbers");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			System.out.println("natural numbers "+i);
		}
	}

}