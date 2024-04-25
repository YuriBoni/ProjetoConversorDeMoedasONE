import Modulos.*;

import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) {
    Menu menuinicial = new Menu();
    Scanner leitura = new Scanner(System.in);
    menuinicial.mostrarMenuCompleto();
    double valorAserConvetido = 0;
    var opcaoDigitada = 1;
    ApiConector conversao = new ApiConector();

    while (opcaoDigitada > 0 && opcaoDigitada <= 7) {
        if (opcaoDigitada == 7) {
            System.out.println("Programa finalizado ! Obrigado pelo uso.");
            break;
        }
        
        System.out.println("\nDigite a opção desejada: ");
        try {
            opcaoDigitada = leitura.nextInt();
            if (opcaoDigitada > 0 && opcaoDigitada <= 7) {
                if (opcaoDigitada == 7) {
                    System.out.println("Programa finalizado ! Obrigado pelo uso.");
                    break;
                }
                System.out.println("Agora digite o valor a ser convertido");
                valorAserConvetido = leitura.nextDouble();
                System.out.println("O valor convertido é: " + "\n" + conversao.conversor(opcaoDigitada, valorAserConvetido));
                menuinicial.mostrarMenuDenovo();

            } else {
                System.out.println("A opção digitada não é valida, tente novamente (Opção de 1 a 7): \n ");
                opcaoDigitada = leitura.nextInt();
            }


        } catch (RuntimeException | IOException | InterruptedException e) {
            System.out.println(e);

        }

    }
}