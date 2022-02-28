package Java_Fundamentals;

import java.util.Scanner;

public class Ass2no2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number = ");
		int x=sc.nextInt();
	if(x%2==0)
		System.out.println(x+" is Even Number");
	else 
		System.out.println(x+" is odd Number");
	}

}
/* OUTPUT:
Enter number = 
11
11 is odd Number
*/