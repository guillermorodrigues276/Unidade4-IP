import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de ponto flutuante");
        double valor1 = input.nextDouble();
        double resto = valor1 - Math.floor(valor1);

        if (resto != 0f) {
            System.out.println("Possui numero decimal: ");
            
        } else {
            System.out.println("Não possui numero decimal:" );
        }

        input.close();
    }
}
