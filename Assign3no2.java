package Array;

public class Assign3no2 {

	public static void main(String[] args) {
		int [] a=new int[] {10,20,5,30,40,50,40,30,20,60};
		int min=a[0],max=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]>max)
			{
				max=a[i];
				
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("minimum value in array is : "+min+" maximum is :"+max);

	}
}
/* OUTPUT :
minimum value in array is : 5 maximum is :60
*/