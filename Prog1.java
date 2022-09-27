import java.util.Scanner;

public class Prog1{


public static void main(String[] args){

  int x,y;
  
  
Scanner input = new Scanner(System.in);

System.out.println("Enter a value of for x ");
x =input.nextInt();
System.out.println("Enter a value of for y ");
y= input.nextInt();

System.out.println("3*x: " + (3*x));

System.out.println("3*x + 2: " + (3*x +y));

System.out.println("3*x /7: " + (x + 3)/7);

System.out.println("3*x + y/ x+2: " + (3*x + y)/(x+2));
}




}