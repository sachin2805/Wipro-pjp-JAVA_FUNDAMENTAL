package Array;

/*import java.util.Scanner;

public class Assign3no13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[][] a = new int[2][2];
		
		System.out.println("Enter the 2*2 array elements : ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++)
			a[i][j]=sc.nextInt();
		}
	if(a[1][1]==0)
		{
			System.out.println("Please enter 4 integer number ");
		}
	else {
	System.out.println("The reverse of the array is: ");
	for(int i=1;i>=0;i--) {
		for(int j=1;j>=0;j--) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		
	}
	}

}
}*/
/* OUTPUT :
Enter the 2*2 array elements : 
1
2
3
4
The reverse of the array is: 
4 3 
2 1
*/

//Progrm --> On cmd 
public class Assign3no13 {

	public static void main(String[] args) {
		int c=1;
		
  int a[][] = new int[2][2];

    for(int i=0; i<2; ++i)
    {
        for(int j=0; j<2; ++j)
        {
            a[i][j]=Integer.parseInt(args[2*i+j]);
        }
    }

	
	System.out.println("The reverse of the array is: ");
	for(int i=1;i>=0;i--) {
		for(int j=1;j>=0;j--) {
          System.out.print(a[i][j]+" ");
     }
System.out.println();
}	
}
}

/* OUTPUT :
C:\Users\tmi\Downloads\javaWipro>javac Assign3no13.java

C:\Users\tmi\Downloads\javaWipro>java Assign3no13 1 2 3 4
The reverse of the array is:
4 3
2 1

C:\Users\tmi\Downloads\javaWipro>

*/