package f1;

public class Equipe {

    private String nome;
    private int anoFundacao;
    private Patrocinadores[] patrocinadores;

    public Equipe(){
        this.patrocinadores = new Patrocinadores[20];
    }

    public void setEquipe(){
        this.nome = "Ford";
        this.anoFundacao = 1903;
        this.patrocinadores = new Patrocinadores[20];
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoFundacao(int anoFundacao){
        this.anoFundacao = anoFundacao;
    }

    public void setPatrocinadores(Patrocinadores patrocinador, int posicao){
        if(posicao >= 0 && posicao < patrocinadores.length){
            patrocinadores[posicao] = patrocinador;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public int getAnoFundacao(){
        return this.anoFundacao;
    }

    public Patrocinadores[] getPatrocinadores(){
        return this.patrocinadores;
    }

    public void exibirDados(){
        System.out.println("Nome da equipe: " + getNome());
        System.out.println("Ano de fundacao da equipe: " + getAnoFundacao());
    }

    public void listarPatrocinadores(){
        System.out.println("\nPatrocinadores:");

        for(int i = 0; i < patrocinadores.length; i++){
            if(patrocinadores[i] != null){
                System.out.println("Patrocinador " + (i + 1) + ":");
                patrocinadores[i].getPatrocinadores();
                System.out.println("-------------------");
            }
        }
    }
}