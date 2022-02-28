package Array;

import java.util.Scanner;

public class Assign3no14 {

	public static void main(String[] args) {

		int[] b[]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3*3 array elements : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
				b[i][j]=sc.nextInt();
		}
		int max=0;
		System.out.println("The given array is:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(b[i][j]>max)
					max=b[i][j];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();

		}
		System.out.println("The biggest number in the given array is  "+max);

	}
}
/* OUTPUT :
 Enter the 3*3 array elements : 
1 23 45 55 121 222 56 77 89
The given array is:
1 23 45 
55 121 222 
56 77 89 
The biggest number in the given array is  222
 */

