package Java_Fundamentals;

import java.util.Scanner;

public class Ass2no1A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n=sc.nextInt();
		
		if(n>0)
		System.out.println(n+" is Positive");
		else if(n<0)
			System.out.println(n+" is Negative");
		else if(n==0)
			System.out.println(n+" is zero");

	}

}
/* OUTPUT :
Enter the number = 
10
10 is Positive
------------OR-----------
Enter the number = 
-10
-10 is Negative
------------OR-----------
Enter the number = 
0
0 is zero
*/