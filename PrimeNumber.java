package demo;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter th numbers:");
n=sc.nextInt();
for(i=2;i<=n;i++)
	if(n%i==0)
		break;
if(i==n)
	System.out.println("it is prime number");
else 
	System.out.println("its not a prime number");
}
}
