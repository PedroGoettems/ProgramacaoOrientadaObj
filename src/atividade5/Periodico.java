package atividade5;  // CORRIGIDO: atividade5

public class Periodico extends Publicacao {
    private int numeroVolume;
    
    public Periodico(String titulo, int numeroVolume) {
        super(titulo);
        if (numeroVolume <= 0) {
            throw new IllegalArgumentException("Número do volume deve ser positivo");
        }
        this.numeroVolume = numeroVolume;
    }
    
    public int getNumeroVolume() {
        return numeroVolume;
    }
    
    public void setNumeroVolume(int numeroVolume) {
        if (numeroVolume <= 0) {
            throw new IllegalArgumentException("Número do volume deve ser positivo");
        }
        this.numeroVolume = numeroVolume;
    }
    
    @Override
    public String toString() {
        return "Periódico: " + titulo + " - Volume: " + numeroVolume + "(Não pode ser emprestado)";
    }
}