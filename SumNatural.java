package demo;
import java.util.Scanner;
public class SumNatural {
public static void main(String[] args) {
	int i,sum=0,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers:");
n=sc.nextInt();
for(i=1;i<=n;i++) {
	sum=sum+i;
}
System.out.println("sum of first 10 natural numbers:"+sum);
}
}
