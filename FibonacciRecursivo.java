public class FibonacciRecursivo{
  public static void main(String args[]){
    for(int i=0; i<10; i++){
            System.out.println(fib(i)+" ");
          }
    System.out.println(fib(8));
    }
   public static int fib(int n){
        if (n<2) return n;
        return fib(n-1)+fib(n-2);
     }
}