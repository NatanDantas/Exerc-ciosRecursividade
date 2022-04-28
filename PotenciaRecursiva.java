public class PotenciaRecursiva{
  public static void main(String[] args) {
    System.out.println("Potência = " + pot(3, 4));
  }

  public static int pot(int a, int n){    
    if(n == 0)
      return 1;
    else
      return a * pot(a,n - 1);
  }
}
