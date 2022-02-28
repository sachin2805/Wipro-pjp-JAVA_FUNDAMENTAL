package Java_Fundamentals;

import java.util.Scanner;

public class Ass2no12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		   boolean f = false;
		   System.out.println("Enter the one number : ");
		   int n=sc.nextInt();
		    for (int i = 2; i <= n / 2; i++) {
		      
		      if (n % i == 0) {
		        f= true;
		        break;
		      }
		      
		    }

		    if (!f)
		      System.out.println(n + " is a prime number.");
		    else
		      System.out.println(n + " is not a prime number.");

	}

}
/* OUTPUT :
Enter the one number : 
29
29 is a prime number.

---------OR-----------
Enter the one number : 
10
10 is not a prime number.
*/