import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao Jogo Par ou Ímpar!");
        System.out.println("Instruções: Você escolherá ser Par ou Ímpar e em seguida escolherá um número de 0 a 10.");
        System.out.println("O computador também escolherá um número de 0 a 10. Se a soma dos dois números for par e você escolheu Par, você ganha! E vice-versa.\n");

        while (true) {
            System.out.print("Você quer ser Par ou Ímpar? [Par/Ímpar]: ");
            String escolhaUsuario = scanner.nextLine().trim().toLowerCase();

            if (!escolhaUsuario.equals("par") && !escolhaUsuario.equals("ímpar")) {
                System.out.println("Escolha inválida. Por favor, digite 'Par' ou 'Ímpar'.");
                continue;
            }

            System.out.print("Digite seu número (0 a 10): ");
            int numeroUsuario = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            if (numeroUsuario < 0 || numeroUsuario > 10) {
                System.out.println("Número inválido. Por favor, escolha um número entre 0 e 10.");
                continue;
            }

            int numeroComputador = random.nextInt(11);
            int soma = numeroUsuario + numeroComputador;
            String resultado = soma % 2 == 0 ? "par" : "ímpar";

            System.out.println("\nNúmero do jogador: " + numeroUsuario);
            System.out.println("Número do computador: " + numeroComputador);
            System.out.println("Soma: " + soma);
            System.out.println(resultado.toUpperCase() + " vence!");

            if (escolhaUsuario.equals(resultado)) {
                System.out.println("Você ganhou!");
            } else {
                System.out.println("Você perdeu.");
            }

            System.out.print("\nJogar novamente? [sim/não]: ");
            String jogarNovamente = scanner.nextLine().trim().toLowerCase();

            if (!jogarNovamente.equals("sim")) {
                break;
            }
        }

        System.out.println("Obrigado por jogar. Até a próxima!");
        scanner.close();
    }
}