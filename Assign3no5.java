package Array;

public class Assign3no5 {

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
		System.out.println("Smallest two number are : "+a[0]+","+a[1]+" Largest two number are : "+a[a.length-1]+","+a[a.length-2]);

	}
}
/* OUTPUT :
Smallest two number are : 10,11 Largest two number are : 99,88
*/