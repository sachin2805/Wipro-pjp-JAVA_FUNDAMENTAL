package Java_Fundamentals;
public class Ass2no3 {

public static void main(String[] args) {

if(args[0]==null)
System.out.println("No Values");

else 

   for(int i=0;i<=args.length-2;i++)
System.out.print(args[i]+",");

System.out.print(args[args.length-1]);
}
}
/* OUTPUT :
C:\Users\tmi\Downloads\javaWipro>javac Ass2no3.java

C:\Users\tmi\Downloads\javaWipro>java Ass2no3 sachin suraj dev shiva

sachin,suraj,dev,shiva

C:\Users\tmi\Downloads\javaWipro>

*/

