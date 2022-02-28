package Array;

import java.util.Scanner;

public class Assign3no11 {

	public static void main(String[] args) {
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++) 
		if(a[i]!=1 && a[i]!=4)
		c++;
		
		if(c==0)
			System.out.println("true");
		else System.out.println("false");

	}
}
/* OUTPUT :
Enter the array size : 
4
Enter the array elements : 
1
4
1
4
true
*/