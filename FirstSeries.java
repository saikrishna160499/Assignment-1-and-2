package demo;
import java.util.*;
public class FirstSeries {
	public static void main(String[] args)  {
		int n;
		Double sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		{
		sum=Math.pow(n*(n+1)/2, 2);
		}
	System.out.println("sum of n series is:" +sum);
	}
	

}
