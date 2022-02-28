package Array;

public class Assign3no1 {

	public static void main(String[] args) {
		int [] a=new int[] {10,20,30,40,50};
		int sum=0,avg;
		
	       for (int i = 0; i < a.length; i++) {  
	           sum = sum + a[i];  
	        } 
		avg=sum/a.length;
		System.out.println("The sum of given array is "+sum+" and average is "+avg);
	}

}
/* OUTPUT :
The sum of given array is 150 and average is 30
*/