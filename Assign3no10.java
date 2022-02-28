package Array;

public class Assign3no10 {

	public static void main(String[] args) {
		int a[]=new int[] {1,0,1,0,0,1,1};
		  int left=0;
		  int right=a.length-1;
		  for (int i = 0; i < a.length; i++) {
		 
		   while(a[left]%2==0)
		   {
		    left++;
		   }
		   while(a[right]%2==1)
		   {
		    right--;
		   }
		 
		   if(left<right)
		   {
		    int temp=a[left];
		    a[left]=a[right];
		    a[right]=temp;
		   }
		  }
		  for(int i=0;i<a.length;i++)
		  System.out.print(a[i]+" ");

	}
}
/* OUTPUT :
 i/p :{1,0,1,0,0,1,1}
 o/p : 0 0 0 1 1 1 1 
 */
