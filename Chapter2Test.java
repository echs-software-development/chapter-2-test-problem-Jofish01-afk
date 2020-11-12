import java.util.Scanner;

public class Chapter2Test {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  System.out.println("This program will take the average of two numbers.");
  System.out.println("Enter first number: ");
  int numone = scan.nextInt();

  System.out.println("Enter the second number: ");
  int numtwo = scan.nextInt();
  
  double done= numone;
  double dtwo= numtwo;

  double average = (done + dtwo) / 2;
  System.out.println("The average is: " + average );
  }
}