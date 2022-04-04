import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mês: ");
        int horasMes = input.nextInt();

        System.out.println("Entre com o valor pago por hora: ");
        int horasValor = input.nextInt();

        int salarioTotal = (horasMes * horasValor);

        if (horasMes >= 160) {
            int salarioExtra = (horasMes - 160) * (horasValor / 2);
            System.out.println("O salário total é: " + (salarioTotal = salarioTotal + salarioExtra));
        } else {
            System.out.println("O salário total é:" + salarioTotal);
        }
        
        input.close();
    }
}
