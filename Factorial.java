package demo;
import java.util.Scanner;
public class Factorial  
{
	public static void main(String[] args)  
	{
		int i,n,fact=1,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		n=sc.nextInt();
		for(i=1;i<=n;i++) 
		{
			fact=fact*i;
		}
		System.out.println("factorial of" + n +"is:" +fact);
		if(fact==0||fact==1)
		{	
			System.out.println("Factorial "+fact+" is not a prime number");
		}
		else
		{
			for(i=2;i<=fact/2;i++)
			{
				if(fact%i==0)
				{
					System.out.println("Factorial "+fact+" is not a prime number");
					flag=1;
					break;
				}
			}
		if(flag==0)
		{
			System.out.println("Factorial "+fact+" is a prime number");
		}
		}    
	}  
} 


