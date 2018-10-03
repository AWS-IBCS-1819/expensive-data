/*
Chloe Arranza
Fibonacci (n)

You must return the nth Fibonacci number

Fibonacci Sequence

1,1,2,3,5,8,13...

*/

public class Fibonacci{

  static int fib(int n){
   if (n <= 1)

      return n;

   return fib(n-1) + fib(n-2);
   }

   public static void main (String args[]){
   int n = 2;
   System.out.println(fib(n));
   }

}
