package Java_Fundamentals;

import java.util.Scanner;

public class Ass2no16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter the number : ");
	int n=sc.nextInt();
	int x;
	while(n!=0)
	{
		x=n%10;
		System.out.print(x);
		n=n/10;
	}

	}

}
/*OUTPUT :
Enter the number : 
1234
4321
*/