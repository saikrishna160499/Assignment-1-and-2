package demo;

public class PrintPrime {
	public static void main(String[] arg)
	{
		int i,j;
	
		System.out.println("enter the numbers:");
		for(i=1;i<=100;i++) {
			boolean flag;
			flag=true;
			for(j=2;j<=i-1;j++) {
				if(i%j==0) {
					flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println(i);
		
	}

}
}
}