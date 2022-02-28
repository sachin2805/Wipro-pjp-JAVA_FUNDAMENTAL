package Array;

public class Assign3no9 {

	public static void main(String[] args) {
		
		  int[] a = {3,10,1,6,10,2,10,8,4};
	        int[] b = null;
	        int d = 10;
	        

	        for (int i = 0; i < a.length-1; i++) {
	            if(a[i] == d){
	              b = new int[a.length - 1];
	                for(int k = 0; k < i; k++){
	                   b[k] = a[k];
	                }
	                for(int j = i; j < a.length - 1; j++){
	                    b[j] = a[j+1];
	                }
	                break;
	            }
	        }
	    
	   
	        for(int i=b.length;i<a.length-1;i++)
        	{
        		b[i]=0;
        	}
	        for(int i=0;i<b.length;i++)
	        	System.out.print(b[i]+" ");
	}

}
