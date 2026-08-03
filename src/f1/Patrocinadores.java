package f1;

public class Patrocinadores {

    private String nome;
    private float valor;

    public Patrocinadores(String nome, float valor){
        this.nome = nome;
        this.valor = valor;
    }

    public Patrocinadores(){
        this.nome = "";
        this.valor = 0;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public String getNome(){
        return this.nome;
    }

    public float getValor(){
        return this.valor;
    }

    public void getPatrocinadores(){
        System.out.println("Nome do patrocinador: " + this.nome);
        System.out.println("Valor patrocinado: " + this.valor);
    }
}