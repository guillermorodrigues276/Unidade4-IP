import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro maior que 0: ");
        int valor = input.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Numero é par");
          } else {
            System.out.println("Numero é impar");
          }
            input.close();
        
    }
}
