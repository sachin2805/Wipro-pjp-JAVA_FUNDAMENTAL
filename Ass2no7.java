package Java_Fundamentals;

import java.util.Scanner;

public class Ass2no7 {

	public static void main(String[] args) {
		
		 char x;
		 
	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter any one Char : ");
		
		char c=sc.next().charAt(0);
		
		
		 boolean b = Character.isUpperCase(c);
		  
		
		 
		 if(b==true) {
			 x=Character.toLowerCase(c);
			 System.out.println(c+"->"+x);
		 }
		 else {
			 x=Character.toUpperCase(c);
			 System.out.println(c+"->"+x); 
		 }

	}

}

/* OUTPUT :
Enter any one Char : 
A
A->a
-----------OR-----------
Enter any one Char : 
a
a->A
*/
