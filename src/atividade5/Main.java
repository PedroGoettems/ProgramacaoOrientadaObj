package atividade5;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro");
        Livro livro2 = new Livro("O Alienista");
        
        Periodico periodico1 = new Periodico("Revista Ciência Hoje", 45);
        
        System.out.println("ACERVO INICIAL");
        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(periodico1);
        
        // Testando empréstimo de livro
        System.out.println("\nEMPRÉSTIMO");
        System.out.println(livro1.getTitulo() + " - Disponível? " + livro1.isDisponivel());
        livro1.emprestar();
        System.out.println(livro1.getTitulo() + " - Disponível? " + livro1.isDisponivel());
        
        // Tentando emprestar livro já emprestado
        livro1.emprestar();
        
        // Testando devolução
        System.out.println("\nDEVOLUÇÃO");
        livro1.devolver();
        System.out.println(livro1.getTitulo() + " - Disponível? " + livro1.isDisponivel());
        
        // Tentando devolver livro já disponível
        livro1.devolver();
        
        System.out.println("\nSITUAÇÃO FINAL");
        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(periodico1);
    }
}