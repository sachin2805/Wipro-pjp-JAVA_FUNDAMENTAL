package Array;

public class Assign3no6 {

	public static void main(String[] args) {
		int a[]= {10,55,20,66,30,40,99,88,11};
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j <a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		System.out.println("Sorted Array is :");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}

}
/* OUTPUT :
Sorted Array is :
10 11 20 30 40 55 66 88 99 
*/