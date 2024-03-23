
public class Main {
  public static void main(String[] args) {

   boolean opcao = false;
   int numero = 1;
   String texto = "1";
   boolean resultado = (opcao && !opcao);
    
      numero = numero + 2;
      resultado = (numero >=2) || resultado;
      numero = 1;
      resultado = (numero == Integer.parseInt(texto)) && resultado;
      //por estar tentando fazer uma comparação no java entre uma String e um int o programa presenta erro.
      //Por conta disso tive que utilizar o parseInt, trasformando o texto em um inteiro.
    
   System.out.println(resultado);

    
  }

}