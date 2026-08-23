package atividade4;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Tedesco Hiago");

        estudante.insereNotas();

        //pesos para cada nota
        int[] pesos = {2, 2, 3, 1, 2};  // Soma = 10

        System.out.println("\nDados do Estudante:");
        System.out.println("Nome: " + estudante.getNome());
        System.out.print("Notas: ");
        for (double nota : estudante.getNotas()) {
            System.out.print(nota + " ");
        }
        
        //método original
        System.out.println("\nMédia Aritmética: " + estudante.calculaMedia());
        
        //método sobrecarregado
        System.out.println("Média Ponderada: " + estudante.calculaMedia(pesos));
        
        System.out.println("Menor nota: " + estudante.menorNota());
    }
}