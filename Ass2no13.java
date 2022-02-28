package Java_Fundamentals;

public class Ass2no13 {

	public static void main(String[] args) {
	
		int i,j,count=0;
		
		System.out.println("prime number between 1 to 100 are :\n");
		for(i=10;i<=100;i++)
        {
           for(j=1;j<=i;j++)
           {
             if(i%j==0)
               count++;
           }
           if(count==2)
             System.out.print(" "+i);
           count=0;
         }

}
}
/* OUTPUT :
prime number between 1 to 100 are :

 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
*/