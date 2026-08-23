package atividade4;

import java.util.Scanner;

public class Estudante {
    private String nome;
    private double[] notas;

    public Estudante(String nome) {
        this.nome = nome;
        this.notas = new double[5];
    }

    public void insereNotas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira as 5 notas do estudante " + nome + ":");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    public double calculaMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    //sobrecarga
    public double calculaMedia(int[] pesos) {
        if (pesos == null || pesos.length != 5) {
            System.out.println("É necessário um array com 5 pesos");
            return 0;
        }
        
        double somaPonderada = 0;
        int somaPesos = 0;
        
        for (int i = 0; i < notas.length; i++) {
            somaPonderada += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        
        return somaPonderada / somaPesos;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public double menorNota() {
        double menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        return menor;
    }
}