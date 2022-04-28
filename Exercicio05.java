public class Exercicio05{
  public static void main(String args[]){
  int[] v = {3, 7, 8, 11, 14, 18, 21, 25};
    int p = buscaLinear(v, 5, 0);
    System.out.println("Posição: " + p);

    int[] menor = {4, 6, 1, 8};
    int min = menorValor(menor, menor.length);
    System.out.println("Menor: " + min);
    int s = somaValor(menor, 0);
    System.out.println("Soma: " + s);
    double m = media(menor, 0);
    System.out.printf("Media: %.2f\n", m);
    }
//a)
  public static int buscaLinear(int[] v, int x,int i) {
    if(i == v.length){
      return -1;
    }
    if(x == v[i]){
      return i;
    }
    return buscaLinear(v, x, i + 1);
  }
// b)
  public static int menorValor(int[] v, int i){
   
    if(i == 1) {
      
    return v[0];
      }
    int min = menorValor(v, i - 1);
    
    if(min < v[i - 1]) {
      
      return min;
      
    }else {
      
      return v[i - 1];
      
      }
  }

  //c)
  public static int somaValor(int[] v, int i){
    if(i == v.length){
      return 0;
      }
    return v[i] + somaValor(v, i + 1);
    }

  //d)
  public static double media(int[] v, int i){
        if(i == v.length){
          return 0;
        }
      double soma = v[i] + media(v, i + 1);
    if(i == 0){
      return soma / v.length;
    }
    return soma;
  }
}