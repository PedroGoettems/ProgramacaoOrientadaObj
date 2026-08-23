package atividade5;

public class Publicacao {
    protected String titulo;
    
    public Publicacao(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser vazio!");
        }
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser vazio!");
        }
        this.titulo = titulo;
    }
    
    @Override
    public String toString() {
        return "Título: " + titulo;
    }
}