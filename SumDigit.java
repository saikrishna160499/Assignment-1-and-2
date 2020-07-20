package demo;
import java.util.Scanner;
public class SumDigit {
	public static void main(String[] args) {
	int n,num,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers upto n");
	n=sc.nextInt();
	while(n>0)
	{
		num=n%10;
		sum=sum+num;
		n=n/10;
	}
	System.out.println("enter sum of digits:" +sum);
	}
}