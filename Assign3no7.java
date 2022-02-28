package Array;

public class Assign3no7 {
	
	public static void main(String[] args) {
	int a[]= {12,34,12,45,67,89};
	int temp[]=new int[a.length];
	int t;

	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j <a.length; j++) {
			if (a[i] > a[j]) {
				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}

	}
	for(int i=0;i<a.length;i++)
	{
		
		if( a[i]==a[a.length-1] || a[i]!=a[i+1])
		{
			temp[i]=a[i];
		}	
	}
	for(int i=1;i<a.length;i++)
	{
	System.out.print(temp[i]+" ");
	}
}
}
/* OUTPUT :
12 34 45 67 89 
*/