package Array;

import java.util.Scanner;

public class Assign3no8 {

	public static void main(String[] args) {

		int a[]	=new int[] {10,3,6,1,2,7,9};
		int i,x = 0,y=0,sum=0,sum1=0,sum2=0;


		if(a[0]==7 && a[a.length-1]==6 || a[0]==6 && a[a.length-1]==7) {
			for(i=0;i<a.length;i++)
			{
				sum=sum+a[i];	
			}
		}
		else {

			for(i=0;i<a.length;i++) {
				if(a[i]==7)
					x=i;
				else if(a[i]==6)
					y=i;
			}
			if(x<y)
			{
			for(i=0;i<x ;i++)
			{
				sum1=sum1+a[i];	
			}
			for(i=y+1;i<a.length ;i++)
			{
				sum2=sum2+a[i];	
			}
			sum=sum1+sum2;
			}
			else if(y<x)
			{
				for(i=0;i<y ;i++)
				{
					sum1=sum1+a[i];	
				}
				for(i=x+1;i<a.length ;i++)
				{
					sum2=sum2+a[i];	
				}
				sum=sum1+sum2;	
			}

		}
		System.out.println(sum);	
	}

}
/* OUTPUT :
  
i/p : {10,3,6,1,2,7,9}
o/p : 22

i/p : {7,1,2,3,6}
o/p : 19

i/p : {1,6,4,7,9}
o/p : 10

 */
