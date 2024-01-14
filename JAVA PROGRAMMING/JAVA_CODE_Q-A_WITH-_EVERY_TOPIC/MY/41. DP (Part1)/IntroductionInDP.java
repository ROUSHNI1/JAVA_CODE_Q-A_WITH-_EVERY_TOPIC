//Fibonacci Skewed Trees (Dynamic Programming)
/*
 * Fib
 */

public class IntroductionInDP {
    //first we write a fibonacci function where we calculate Fibonacci by  making Skewed tree.
    public static int fib(int n){
        /*return statement return the value fib(n-1)and fib(n-2) to give actual value of Fib n
        here n is a Parameter of a function fib()
        
        
        The values that are declared within a function when the function 
        is called are known as an argument. 
        Whereas, the variables that are defined when the function is 
        declared are known as a parameter.

        A parameter is a special kind of variable used in a function 
        to refer to one of the pieces of data provided as input to
        the function. These pieces of data are the values of the 
        arguments with which the function is going to be called/invoked.
        An ordered list of parameters is usually included in the
        definition of a function, so that, each time the function
        is called, its arguments for that call are evaluated, and
        the resulting values can be assigned to the corresponding
        parameters
        */

      // After giving return value to fib(n) then
      //base case of fibonacci
      if(n  == 0 || n == 1){
        //when n value  become 0 or 1 i.e fib0 or fib1 then in that case 
        //it return the value of n
         return n;
      }

     return fib(n-1) + fib(n-2);
     }
    public static void main(String args[]){
      int n = 5;
      //now we make a call of fib(n) function after making base case of fib() fn
      System.out.println(fib(n));
      // after that we make a call in terminal to run the function
    }
}