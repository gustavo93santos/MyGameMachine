import classes.GerenciadorDeJogadores;
import classes.Jogador;
import classes.Jogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeJogadores gerenciador = new GerenciadorDeJogadores();
        Jogador jogadorAtual = null;

        while (jogadorAtual == null) {
            System.out.println("1. Login");
            System.out.println("2. Cadastrar Novo Jogador");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome do jogador para login: ");
                    String nomeLogin = scanner.nextLine();
                    jogadorAtual = gerenciador.login(nomeLogin);
                    break;
                case "2":
                    System.out.print("Digite um nome para o novo jogador: ");
                    String nomeCadastro = scanner.nextLine();
                    jogadorAtual = gerenciador.cadastrarJogador(nomeCadastro);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }

        Jogo jogo = new Jogo(jogadorAtual);
        String opcao;

        do {
            System.out.println("\nMenu:");
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
                    jogadorAtual.mostrarHistorico();
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
