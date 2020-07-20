package demo;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		int n,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		while(n!=0) {
			int num=n%10;
			reverse=reverse*10+num;
			n=n/10;
		}
		System.out.println("reverse order is:"+reverse);
			
	}

}
