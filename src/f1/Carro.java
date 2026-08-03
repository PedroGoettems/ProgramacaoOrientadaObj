package f1;

public class Carro {
    private int numero;
    private int posicao;
    private Equipe equipe;
    private Piloto piloto;
    private Engenheiro engenheiro;

    public void setCarroManual(int numero, int posicao, Equipe equipe, Piloto piloto, Engenheiro engenheiro){
        this.numero = numero;
        this.posicao = posicao;
        this.equipe = equipe;
        this.piloto = piloto;
        this.engenheiro = engenheiro;
    }

    public void setCarroPadrao(){
        this.numero = 1;
        this.posicao = 1;

        this.equipe = new Equipe();
        this.equipe.setEquipe();

        this.piloto = new Piloto();
        this.engenheiro = new Engenheiro();
    }

    public void getCarro(){
        System.out.println("Carro:");
        System.out.println("Numero: " + this.numero);
        System.out.println("Posicao: " + this.posicao);
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setPosicao(int posicao){
        this.posicao = posicao;
    }

    public void setEquipe(Equipe equipe){
        this.equipe = equipe;
    }

    public void setPiloto(Piloto piloto){
        this.piloto = piloto;
    }

    public void setEngenheiro(Engenheiro engenheiro){
        this.engenheiro = engenheiro;
    }

    public int getNumero(){
        return this.numero;
    }

    public int getPosicao(){
        return this.posicao;
    }

    public Equipe getEquipe(){
        return this.equipe;
    }

    public Piloto getPiloto(){
        return this.piloto;
    }

    public Engenheiro getEngenheiro(){
        return this.engenheiro;
    }

    public void acelerar(){
        System.out.println("WHEEEEEEEEEEEEN");
    }

    public void freiar(){
        System.out.println("IIIIIIIIIIIIIII");
    }

    public void curva(){
        System.out.println("VRVRVRVRVRVR");
    }
}