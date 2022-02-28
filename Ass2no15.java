package Java_Fundamentals;

import java.util.Scanner;

public class Ass2no15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int x=sc.nextInt();
		
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	

}
/* OUTPUT :
Enter the number of rows : 
3
* 
* * 
* * * 
*/