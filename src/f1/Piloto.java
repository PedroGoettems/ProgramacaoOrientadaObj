package f1;

public class Piloto extends Pessoa {

    private int titulos;
    private int vitorias;

    public Piloto(){
        super("Leclerc", 25, "Brasileiro");
        this.titulos = 0;
        this.vitorias = 0;
    }

    public void setTitulos(int titulos){
        this.titulos = titulos;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getTitulos(){
        return this.titulos;
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public void exibirDados(){
        System.out.println("Nome do piloto: " + getNome());
        System.out.println("Idade do piloto: " + getIdade());
        System.out.println("Nacionalidade do piloto: " + getNacionalidade());
        System.out.println("Titulos do piloto: " + getTitulos());
        System.out.println("Vitorias do piloto: " + getVitorias());
    }

    public void ultrapassar(String nome){
        System.out.println(this.getNome() + " ultrapassou " + nome);
    }
}