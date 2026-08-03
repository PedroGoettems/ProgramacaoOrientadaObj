package f1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Carro carro = new Carro();
        Engenheiro engenheiro = new Engenheiro();
        Piloto piloto = new Piloto();
        Equipe equipe = new Equipe();

        Scanner scanner = new Scanner(System.in);

        carro.setCarroPadrao();

        // Dados do piloto
        System.out.println("Qual o nome do piloto?");
        piloto.setNome(scanner.nextLine());

        System.out.println("Qual a idade do piloto?");
        piloto.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Qual a nacionalidade do piloto?");
        piloto.setNacionalidade(scanner.nextLine());

        System.out.print("O piloto tem quantas vitorias? ");
        piloto.setVitorias(scanner.nextInt());

        System.out.print("O piloto tem quantos titulos? ");
        piloto.setTitulos(scanner.nextInt());
        scanner.nextLine();

        carro.setPiloto(piloto);

        carro.getPiloto().exibirDados();
        carro.getPiloto().falar("Vamos ganhar!");
        carro.getPiloto().ultrapassar("João");

        // Dados do engenheiro
        System.out.println("\nQual o nome do engenheiro?");
        engenheiro.setNome(scanner.nextLine());

        System.out.println("Qual a idade do engenheiro?");
        engenheiro.setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Qual a nacionalidade do engenheiro?");
        engenheiro.setNacionalidade(scanner.nextLine());

        System.out.print("O engenheiro tem qual ano de formacao? ");
        engenheiro.setAnoFormacao(scanner.nextInt());
        scanner.nextLine();

        System.out.print("O engenheiro tem qual especializacao? ");
        engenheiro.setEspecializacao(scanner.nextLine());

        carro.setEngenheiro(engenheiro);

        carro.getEngenheiro().exibirDados();
        carro.getEngenheiro().falar("Vamos ganhar!");
        carro.getEngenheiro().projetar("pneu muito bom!");

        // Dados da equipe
        System.out.println("\nQual o nome da equipe?");
        equipe.setNome(scanner.nextLine());

        System.out.println("Qual o ano de fundacao da equipe?");
        equipe.setAnoFundacao(scanner.nextInt());
        scanner.nextLine();

        for(int i = 0; i < 20; i++){

            System.out.println("Digite o nome do " + (i + 1) + " patrocinador:");
            String nome = scanner.nextLine();

            System.out.println("Digite o valor do " + (i + 1) + " patrocinio:");
            float valor = scanner.nextFloat();
            scanner.nextLine();

            Patrocinadores p = new Patrocinadores(nome, valor);

            equipe.setPatrocinadores(p, i);
        }

        carro.setEquipe(equipe);

        carro.getEquipe().exibirDados();
        carro.getEquipe().listarPatrocinadores();

        carro.acelerar();
        carro.freiar();
        carro.curva();

        carro.getCarro();

        scanner.close();
    }
}