package Java_Fundamentals;

import java.util.Scanner;

public class Ass2no5 {

	public static void main(String[] args) {
	 
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter any one Char : ");
		
		char c=sc.next().charAt(0);
		
		 if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
	            System.out.println(c + " is an Alphabet.");
	        else
	            System.out.println(c + " is an Special Character");

	}

}
/* OUTPUT :
Enter any one Char : 
a
a is an alphabet.

---------------OR-------------- 

Enter any one Char : 
+
+ is an Special Character


*/