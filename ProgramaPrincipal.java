package tratamentoerros;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Demonstra o uso de try/catch/finally com leitura de entrada do usuário.
 * Captura InputMismatchException quando o valor digitado não é um inteiro.
 */
public class ProgramaPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um inteiro: ");
            int numero = sc.nextInt();
            System.out.println("O número digitado foi: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Erro: você deve digitar um número inteiro.");
        } finally {
            sc.close();
            System.out.println("Encerrando o sistema...");
        }

        System.out.println("Fim do programa.");
    }
}
