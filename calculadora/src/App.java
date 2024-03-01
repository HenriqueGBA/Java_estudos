import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int num1, num2,sinal;
        
        do{
            System.out.println("\n Digite um número: ");
            num1 = entrada.nextInt();
            System.out.println("Digite outro número: ");
            num2 = entrada.nextInt();
            System.out.println("para escolher o sinal digite \n 1- (+) \n 2- (-) \n 3- (*) \n 4- (/)");
            sinal = entrada.nextInt();
            System.out.println("Caso queira parar o programa digite 0");
            switch (sinal) {
                case 1:
                    System.out.printf("a soma dos valores é " + (num1+num2));
                    break;
                case 2:
                    System.out.printf("o produto dos valores é \n" + (num1-num2));
                    break;
                case 3:
                    System.out.printf("a multiplicação dos valores é \n" + num1*num2);
                    break;
                case 4:
                    System.out.printf("a divisão dos valores é  \n" + (num1/num2) );
                    break;
                default:
                System.out.println("Opção inválida");
                    break;
            }
    }while (num1 > 0 && num2 > 0 && sinal == 0);
}
}