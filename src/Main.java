import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        System.out.println("Par ou Impar?\n" +
                "0 - Impar\n" +
                "1 - Par");
        int parImpar = Integer.parseInt(scanner.nextLine());
        System.out.print("Qual seu numero de 0 a 5? ");
        int numeroMaquina = gerador.nextInt(6);
        int numeroPlayer = Integer.parseInt(scanner.nextLine());

        boolean par = (numeroPlayer+numeroMaquina) % 2 == 0;

        if ((par && parImpar > 0) || (!par && parImpar == 0)){
            System.out.println("Parabens você ganhou");
        } else {
            System.out.println("Infelizmente você perdeu");
        }

    }
}