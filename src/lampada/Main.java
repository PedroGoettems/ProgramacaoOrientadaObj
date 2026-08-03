package avaliacao.lampada;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Lampada lamp = new Lampada();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Deseja alterar os watts da lâmpada? (true/false): ");
        boolean escolha = entrada.nextBoolean();

        if (escolha) {
            lamp.setWatts();
        }

        lamp.interruptor();
        lamp.exibirEstado();

        entrada.close();
    }
}