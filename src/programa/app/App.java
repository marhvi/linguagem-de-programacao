package programa.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int valor;
        int soma = 0;

        Scanner input = new Scanner(System.in);

        for (; ;) {
            System.out.println("Digite um numero: ");
            valor = input.nextInt();
            if (valor == 0){
                System.out.println("Soma Total = "  + soma);
                break;
            }

            soma = valor+soma;
            System.out.println("Soma = "  + soma);
        }
    }
}
