public class RecursivaFibChamadas{
  public static void main(String args[]){
    
    System.out.println(fib(5));
  }

  public static int fib(int n){
        if (n<2) return 0;
        return fib(n-1)+fib(n-2)+2;
    }
}