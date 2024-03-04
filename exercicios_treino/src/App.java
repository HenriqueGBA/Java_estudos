import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
         /*programa para ler dois valores inteiros, e depois mostrar na tela a soma
         * desses números*/
         
          System.out.println("Digite o primeiro número");
          int n1 = entrada.nextInt();
         System.out.println("Digite o segundo número");
          int n2 = entrada.nextInt();
          int soma = n1 + n2;
          System.out.println("A soma dos números é = " + soma);
      
        /*  Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
         valor da área deste círculo com quatro casas decimais conforme exemplos. 
         Fórmula da área: area = π . raio 
         Considere o valor de π = 3.14159*/
       
        double raio,area , pi = 3.14159;
       
        System.out.println("Digite o valor do raio do círculo");
        raio = entrada.nextDouble();
        area =  pi * (raio * raio);
        System.out.printf("A Area do circulo é = %.4f ",  area);
        
        
        int A, B ,C , D, diferenca;
        System.out.println("digite o primero numero");
        A = entrada.nextInt();
        System.out.println("digite o segundo numero");
        B = entrada.nextInt();
        System.out.println("digite o terceiro numero");
        C = entrada.nextInt();
        System.out.println("digite o quarto numero");
        D = entrada.nextInt();
        diferenca = (A * B - C * D);
        System.out.printf("a diferença do produto de %d e %d pelo produto de %d e %d e = ", A, B ,C ,D);
        System.out.println(diferenca);
        
    }
}
