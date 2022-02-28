package Java_Fundamentals;

import java.util.Scanner;

public class Ass2no14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int x,sum=0;
		while(n!=0)
		{
			x=n%10;
			sum=sum+x;
			n=n/10;	
		}
		System.out.println("Sum of digit of given number is : "+sum);
	}

}
/* OUTPUT :
Enter the number : 
1234
Sum of digit of given number is : 10

*/