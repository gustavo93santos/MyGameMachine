package classes;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private Jogador jogador;
    private Scanner scanner;
    private Random random;

    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void jogar() {
        System.out.println("Você quer ser Par ou Ímpar? [Par/Ímpar]:");
        String escolha = scanner.nextLine();
        System.out.println("Digite seu número (0 a 10):");
        int numeroJogador = scanner.nextInt();
        int numeroComputador = random.nextInt(11);

        int soma = numeroJogador + numeroComputador;
        boolean par = soma % 2 == 0;
        boolean vitoria = (par && escolha.equalsIgnoreCase("Par")) || (!par && escolha.equalsIgnoreCase("Ímpar"));

        String resultadoJogada = "Jogador: " + numeroJogador + ", Computador: " + numeroComputador + ", Soma: " + soma + ", " + (vitoria ? "Vitória" : "Derrota");
        jogador.adicionarAoHistorico(resultadoJogada);

        if (vitoria) {
            jogador.registrarVitoria();
        }

        System.out.println(resultadoJogada);
    }
}
