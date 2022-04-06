import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       
       
        Scanner input = new Scanner(System.in);
        String cor;
        System.out.println("Digite a primeira cor");
        cor = input.nextLine();

        if  (cor.equals("Azul")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        input.close();
    }
}