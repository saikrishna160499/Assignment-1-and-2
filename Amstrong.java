package demo;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int num,number,temp,sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the 3 digit number");
            num=sc.nextInt();
            number=num;
            while(number!=0)
            {
            	temp=number%10;
            	sum=(sum+(temp*temp*temp));
            	number=number/10;
            	
            }
            if(sum==num)
            	System.out.println("Amstrong number " +num);
            else
            	System.out.println("it is not a Amstrong number " +num);
	}

}
