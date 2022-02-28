package Java_Fundamentals;

public class Ass2no6 {
public static void main(String[] args) {
String s1="Male";
String s2="Female";

int n=Integer.parseInt(args[1]);

if(args[0].equals(s2) && n>1 && n<59)

System.out.println("Percentage of intrest is = 8.2%");

else if(args[0].equals(s2) && n>58 && n<101)
System.out.println("Percentage of intrest is = 9.2%");

else if(args[0].equals(s1) && n>1 && n<59)
System.out.println("Percentage of intrest is = 8.4%");

else if(args[0].equals(s1) && n>58 && n<101)
System.out.println("Percentage of intrest is = 10.5%");

else 

System.out.println("Enter the correct data and try again!!!!");

}
}
/* OUTPUT :
C:\Users\tmi\Downloads\javaWipro>java ass6 Female 58
Percentage of intrest is = 8.2%

C:\Users\tmi\Downloads\javaWipro>java ass6 Male 100
Percentage of intrest is = 10.5%

C:\Users\tmi\Downloads\javaWipro>

*/