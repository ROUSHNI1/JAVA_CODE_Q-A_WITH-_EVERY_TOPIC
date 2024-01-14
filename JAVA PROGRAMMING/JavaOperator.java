public class JavaOperator {
    public static void main(String args[]){
        System.out.println("Types of Operators:-\n1.Arithmetic Operator (Binary/Unary)\n2.Relational Operator\n3.Logical Operators\n4.Bitwise Operators\n5.Assignment Operators");
        System.out.println("Arithmetic Operators \n (Binary)       (Unary)\n+               ++ \n-              --\n*\n/\n%\n") ;
        int A = 10; int B = 5 ;
        System.out.println("add =" + (A+B));
        System.out.println("Subtract =" +(A-B));
        System.out.println("multiply ="+(A*B));
        System.out.println("Divide ="+(A/B));
        System.out.println("Modulus ="+(A%B));
        System.out.println("Exponentiation ="+(Math.pow(A,B)));
        System.out.println("Unary Increment AND" +"\t increment in A =\t"+(++A)+"\tIncrement in B =\t"+(++B) );
        System.out.println("Unary Decrement AND" +"\t Decrement in A =\t"+(--A)+"\tDecrement in B =\t"+(--B) );
  
        int a = 10; System.out.println("a value\t"+a);
        int b =--a; System.out.println("decrement a value in b :\t"+b) ;
        
        System.out.println("Relational Operators :-> \n ==\n != \n > \n < \n >= \n <=\n");
        System.out.println("is A>B:"+(A>B)+"\t is B>A:"+(B>A));

    }   
}