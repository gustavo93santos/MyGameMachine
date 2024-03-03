import classes.Jogador;
import classes.Jogo;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Jogador 1");
        Jogo jogo = new Jogo(jogador);

        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Jogar");
            System.out.println("2. Ver Histórico de Jogadas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    jogo.jogar();
                    break;
                case "2":
                    jogador.mostrarHistorico();
                    break;
                case "3":
                    System.out.println("Obrigado por jogar. Até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!opcao.equals("3"));
    }
}
