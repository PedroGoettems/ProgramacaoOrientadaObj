package atividade5;

public class Livro extends Publicacao {
    private boolean disponivel;
    
    public Livro(String titulo) {
        super(titulo);
        this.disponivel = true;
    }
    

    public boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso!");
            return true;
        } else {
            System.out.println("Livro \"" + titulo + "\" não está disponível para empréstimo.");
            return false;
        }
    }
    
    public boolean devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro \"" + titulo + "\" devolvido com sucesso!");
            return true;
        } else {
            System.out.println("Livro \"" + titulo + "\" já está disponível.");
            return false;
        }
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }
    
    public String getSituacao() {
        return disponivel ? "Disponível" : "Emprestado";
    }
    
    @Override
    public String toString() {
        return "Livro: " + titulo + " - Situação: " + getSituacao();
    }
}