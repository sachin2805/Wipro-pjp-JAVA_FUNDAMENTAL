package Java_Fundamentals;

public class Ass2no9 {

static String[] s = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December"};

public static void main(String[] args) {

 if(args.length == 0)
    {
        System.out.println("Please enter the month in numbers");
	 System.exit(0);
        
    }


int n=Integer.parseInt(args[0]);

if(n>=1 && n<=12)	
	System.out.println(s[n-1]);
else
  	System.out.println("Invalid Month");
}
}

/* OUTPUT :

C:\Users\tmi\Downloads\javaWipro>javac ass9.java

C:\Users\tmi\Downloads\javaWipro>java ass9
Please enter the month in numbers

C:\Users\tmi\Downloads\javaWipro>java ass9 5
May

C:\Users\tmi\Downloads\javaWipro>java ass9 20
Invalid Month

C:\Users\tmi\Downloads\javaWipro>

*/