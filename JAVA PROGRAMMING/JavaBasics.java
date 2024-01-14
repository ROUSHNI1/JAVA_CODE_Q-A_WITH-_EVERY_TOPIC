import java.util.*;
public class JavaBasics {
  public static void main(String args[]){
    /* 
      
      System.out.print("Hello World");
      System.out.println("Hello World \n");
      System.out.println("HELL O \n WORLD");
    */
     
    int a = 5 ;
    int e = 10 ;
    String name = "Tony Stark";
    /* 
    // if we write variable name in under double qoutes it not return the 
    //variable value for eg;
    System.out.println("a \n");
    // to print out variable output in print function we have to not write variable name 
    // under the double qoutes. for eg:->
    */
    System.out.println(a); System.out.println(e);
    System.out.println(name);
 
   //input from user
   Scanner sc = new Scanner(System.in);
   String input = sc.next(); // it only take letter with no space if it has space then after space letter is not taken.
   System.out.println(input);
   

   //input for sum of two variable input
   System.out.println("Enter first number : ");
   int var1 = sc.nextInt();
   System.out.println("Enter second number : ");
   int var2 = sc.nextInt();
   int result1 = var1 + var2;
   int product = var1 * var2;
   System.out.println("Sum of two Variable:");
   System.out.println(var1+ "\t+\t" + var2+"\t ="+result1);
   System.out.println(var1+ "\t*\t" +var2+"\t=\t"+product);
   

   //Area of Circle
   System.out.println("Give radius to find Circle Area:");
   float radius = sc.nextFloat();
   float area = 3.14f * radius * radius ;;
   System.out.println("Area of Circle"+area);

   System.out.println("Type Casting........");
   float marks = 99.999f; System.out.println("marks what he/she got :"+marks);
   int marks2 = (int) marks; // typae casting float-> int datatype 
   System.out.println("what we get number after Type Casting Float -> Int"+marks2);
   sc.close();
    //Type Promotion
    // this is for to show all variable with different datatype
    // when save in large datatype 
    System.out.println("------------------\n Type Promotion\n");
    byte b = 4; 
    char c = 'a';
    short s = 512;
    int i = 100;
    float f = 3.14f;
    double d = 99.954 ;
    System.out.println("byte b = 4\n char c= 'a'\n short s = 512\n int i= 100\n float f = 3.14f\n Double d = 99.954");
  
    double result = (f*b) + (i % c) - (d * s); //Type Promotin000000000000000000000
    System.out.println(result);

    //star style print...
    System.out.println(".....................\nStar style print");
    System.out.println("********");
    System.out.println("*******");
    System.out.println("******");
    System.out.println("*****");
    System.out.println("****");




  
  }
} 
//boilerplate code