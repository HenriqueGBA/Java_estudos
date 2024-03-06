import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        int minutos = entrada.nextInt();
        double conta = 50.0;
        double Usados = (minutos > 100) ? conta += (minutos - 100) * 2.0 : 50.0;
        System.out.printf("Valor da conta = R$ %.2f \n", Usados);
    
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; 
        System.out.println(desconto);
    
    }
}
