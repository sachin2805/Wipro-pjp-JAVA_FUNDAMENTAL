package Array;

import java.util.Scanner;

public class Assign3no12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c[]=new int[2];
		int a[]=new int[3];
		System.out.println("Enter the 1st array elements : ");
		for(int i=0;i<3;i++)
			a[i]=sc.nextInt();

		int b[]=new int[3];
		System.out.println("Enter the 2nd array elements : ");
		for(int i=0;i<3;i++)
			b[i]=sc.nextInt();
		
		c[0]=a[a.length/2];
		c[1]=b[b.length/2];
		
		
		System.out.print(" Midway -> [ ");
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");
		System.out.print("]");
	}
}
/* OUTPUT :
 Enter the 1st array elements : 
1
2
3
Enter the 2nd array elements : 
4
5
6
 Midway -> [ 2 5 ]
 */
