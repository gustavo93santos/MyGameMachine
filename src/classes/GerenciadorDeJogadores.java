package classes;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeJogadores {
    private Map<String, Jogador> jogadores;

    public GerenciadorDeJogadores() {
        this.jogadores = new HashMap<>();
    }

    public Jogador cadastrarJogador(String nome) {
        if (jogadores.containsKey(nome)) {
            System.out.println("Um jogador com este nome já existe.");
            return null;
        }
        Jogador novoJogador = new Jogador(nome);
        jogadores.put(nome, novoJogador);
        System.out.println("Jogador cadastrado com sucesso!");
        return novoJogador;
    }

    public Jogador login(String nome) {
        if (jogadores.containsKey(nome)) {
            System.out.println("Login bem-sucedido.");
            return jogadores.get(nome);
        } else {
            System.out.println("Jogador não encontrado. Por favor, cadastre-se.");
            return null;
        }
    }
}
