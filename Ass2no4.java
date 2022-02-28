package Java_Fundamentals;
import java.util.Scanner;


public class Ass2no4{

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st Charecters : ");
		 
		char c1=sc.next().charAt(0);
		System.out.println("Enter the 2nd Charecters : ");
		
		char c2=sc.next().charAt(0);
		
		
		if (c1 > c2) {
	          char temp =c1;
	          c1=c2;
	          c2=temp;
	      }
		
		System.out.println("The Alphabetical Order is : "+c1+","+c2);
	}

}

/* OUTPUT :

Enter the 1st Charecters : 
b
Enter the 2nd Charecters : 
a
The Alphabetical Order is : a,b

*/
