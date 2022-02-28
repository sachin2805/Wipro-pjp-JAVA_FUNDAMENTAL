package Java_Fundamentals;

import java.util.Scanner;

public class Ass2no1B {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number = ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x%10==y%10)
			System.out.println("lastDigit("+x+","+y+")->True");
		else 
			System.out.println("lastDigit("+x+","+y+")->False");
		

	}

}
/* OUTPUT :
Enter two number = 
7
17
lastDigit(7,17)->True

*/