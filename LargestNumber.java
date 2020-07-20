package demo;
import java.util.Scanner;
public class LargestNumber {
public static void main(String args[]) {
	int i,n,lar;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numbers in the array list");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("numbers in array list");
	for(i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	lar=a[0];
	for(i=0;i<n;i++)
	{
		if(lar<a[i])
	{
		lar=a[i];
	}
	}
	System.out.println("largest number is:"+lar);
}
}
