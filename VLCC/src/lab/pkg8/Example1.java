package lab.pkg8;
public class Example1 {
	 public static void main(String[] args) {
	 int i=50; int j=0; int data;
	 try
	 { data=i/j; //may throw exception }
	// handling the exception
	 catch(Exception e)
	 { // resolving the exception in catch block
	 System.out.println(i/(j+2)); }
	 } } 
public class Example1 {
public static void main(String args[]) {
System.out,print("SHAHRIYAR");
 int num1, num2;
 try {

 num1 = 0;
 num2 = 62 / num1;
 System.out.println(num2);
 System.out.println("Hey I'm at the end of try block");
 }
 catch (ArithmeticException e) {

 System.out.println("You should not divide a number by zero");
 }
 catch (Exception e) {

 System.out.println("Exception occurred");
 }
 System.out.println("I'm out of try-catch block in Java.");
 }
}
