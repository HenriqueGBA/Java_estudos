import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class App {
    public static void main(String[] args) throws Exception {
            
        //Entrada de dados
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Qual o seu nome? ");
        String pessoa = entrada.nextLine();

        System.out.println("digite em que ano nasceu: ");
        int anoNascimento = entrada.nextInt();

        System.out.println("digite em que ano estamos atualmente: ");
        int anoReal = entrada.nextInt();
        System.out.printf("ola %s ", pessoa);
        System.out.format("Sua idade é " + (anoReal - anoNascimento) + " anos \n");

        System.out.format("%s para calcularmos o seu imc qual o seu peso? (em quilos) \n", pessoa);
        Float peso = entrada.nextFloat();
        
        System.out.println("qual o sua altura? (ex: 1,75) ");
        Float altura = entrada.nextFloat();

        System.out.format("%s", pessoa);
        System.out.println(" seu imc é " + (peso / (altura * altura)));





    }
}
