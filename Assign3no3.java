package Array;

import java.util.Scanner;

public class Assign3no3 {

	public static void main(String[] args) {
		int [] a=new int[] {1,4,34,56,7};
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		for(int i=0;i<5;i++) {
			
		if(a[i]==n)
		{
			System.out.println(i);
		}
		else if(n!=a[i])
			c++;
		}
		
		if(c==a.length)
		{
			System.out.println("-1");
		}

	}

}
/* OUTPUT :
Enter the number : 
56
3
------------OR-------------
Enter the number : 
90
-1
*/
