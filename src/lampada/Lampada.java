package avaliacao.lampada;

import java.util.Scanner;

public class Lampada {

    private boolean acesa;
    private int watts;

    public Lampada() {
        this.acesa = false;
        this.watts = 60;
    }

    public void interruptor() {
        acesa = !acesa; // forma mais simples de alternar
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts() {
        Scanner entrada = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Informe a potência da lâmpada (1 a 1000): ");
            valor = entrada.nextInt();

            if (valor < 1 || valor > 1000) {
                System.out.println("Valor inválido! Tente novamente.");
            }

        } while (valor < 1 || valor > 1000);

        this.watts = valor;
        // NÃO fechar o Scanner aqui (boa prática)
    }

    public void exibirEstado() {
        String estado = acesa ? "ligada" : "desligada";
        System.out.println("A lâmpada está " + estado);
        System.out.println("Potência: " + watts + "W");
    }
}