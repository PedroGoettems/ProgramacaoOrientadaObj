package f1;

public class Engenheiro extends Pessoa {

    private int anoFormacao;
    private String especializacao;

    public Engenheiro(){
        super("Jorge", 32, "Brasileiro");
        this.anoFormacao = 2002;
        this.especializacao = "Aerodinamica";
    }

    public void setAnoFormacao(int anoFormacao){
        this.anoFormacao = anoFormacao;
    }

    public void setEspecializacao(String especializacao){
        this.especializacao = especializacao;
    }

    public int getAnoFormacao(){
        return this.anoFormacao;
    }

    public String getEspecializacao(){
        return this.especializacao;
    }

    public void exibirDados(){
        System.out.println("Nome do engenheiro: " + getNome());
        System.out.println("Idade do engenheiro: " + getIdade());
        System.out.println("Nacionalidade do engenheiro: " + getNacionalidade());
        System.out.println("Ano de formação do engenheiro: " + getAnoFormacao());
        System.out.println("Especializacao do engenheiro: " + getEspecializacao());
    }

    public void projetar(String peca){
        System.out.println(this.getNome() + " projetou a peça " + peca);
    }
}