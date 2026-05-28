package tratamentoerros;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Demonstra o uso de múltiplos blocos catch em um loop do/while.
 * Captura InputMismatchException e ArithmeticException (divisão por zero).
 */
public class Calculadora {

    public static void main(String[] args) {
        int saida = -1;
        int valor_a;
        int valor_b;
        Scanner myScanner = new Scanner(System.in);

        do {
            try {
                System.out.println("\nInsira dois valores inteiros:");
                System.out.print("Valor a: ");
                valor_a = myScanner.nextInt();
                System.out.print("Valor b: ");
                valor_b = myScanner.nextInt();

                System.out.println("O resultado da divisão é: " + (valor_a / valor_b));
                System.out.println("Digite 0 para sair ou qualquer outro número para continuar: ");
                saida = myScanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite apenas números inteiros.");
                myScanner.nextLine(); // limpa o buffer do scanner
                saida = -1;
            } catch (ArithmeticException e) {
                System.out.println("Erro de divisão: não é possível dividir por zero.");
                saida = -1;
            }
        } while (saida != 0);

        myScanner.close();
        System.out.println("Execução encerrada!");
    }
}
