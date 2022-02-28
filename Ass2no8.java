package Java_Fundamentals;

import java.util.Scanner;


public class Ass2no8 {


	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the color code : ");
		char c=sc.next().charAt(0);

		if('R'==c)
			System.out.println("R->Red");	
		else if('B'==c)
			System.out.println("B->Blue");	
		else if('G'==c)
			System.out.println("G->Green");	
		else if('O'==c)
			System.out.println("O->Orange");	
		else if('Y'==c)
			System.out.println("Y->Yellow");	
		else if('W'==c)
			System.out.println("W->White");	
		else 
			System.out.println("Invalid Code");	

	}
}
/* OUTPUT :

Enter the color code : 
R
R->Red

-----------OR------------
Enter the color code : 
X
Invalid Code
*/