package atividade2;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Tedesco Hiago");

        estudante.insereNotas();

        System.out.println("\nDados do Estudante:");
        System.out.println("Nome: " + estudante.getNome());
        System.out.print("Notas: ");
        for (double nota : estudante.getNotas()) {
            System.out.print(nota + " ");
        }
        System.out.println("\nMédia: " + estudante.calculaMedia());
        System.out.println("Menor nota: " + estudante.menorNota());
    }
}
