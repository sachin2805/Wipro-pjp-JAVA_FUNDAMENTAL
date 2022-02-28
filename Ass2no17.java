package Java_Fundamentals;

import java.util.Scanner;

public class Ass2no17 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		int temp=n;
		int x,sum=0;
		while(n!=0)
		{
			x=n%10;
			sum= (sum*10)+x;
			n=n/10;
		}
		if(sum==temp)
			System.out.println(temp+" is a palindrome");
		else
			System.out.println(temp+" is not a palindrome");
	}

}
/* OUTPUT :
Enter the number : 
110011
110011 is a palindrome
*/