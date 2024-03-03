package classes;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private int pontuacao;
    private List<String> historico;

    public Jogador(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        this.historico = new ArrayList<>();
    }

    public void registrarVitoria() {
        pontuacao++;
    }

    public void adicionarAoHistorico(String jogada) {
        historico.add(jogada);
    }

    public void mostrarHistorico() {
        System.out.println("Histórico de " + nome + ":");
        historico.forEach(System.out::println);
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
