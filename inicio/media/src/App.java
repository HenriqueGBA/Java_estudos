import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double x,y,media;
        System.out.println("Digite o primeiro número:");
        x = entrada.nextDouble();
        System.out.println("Digite o segundo número:");
        y = entrada.nextDouble();
        media = (x + y) / 2.0;
        System.out.println("a media =" + media);

    }
}
