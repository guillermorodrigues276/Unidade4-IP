import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = input.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = input.nextInt();
  

        if (valor1 <= valor2) {
            System.out.println("O maior valor é: " + valor2);
            
        } else {
            System.out.println("O maior valor é:" + valor1);
        }



        input.close();
    }
}
