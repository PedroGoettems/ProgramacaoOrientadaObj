package atividade3;

public class Main {
    public static void main(String[] args) {
        Estudante[] estudantes = new Estudante[6];  // CORRIGIDO: nome consistente

        estudantes[0] = new Estudante("Ana");
        double[] notasAna = {7.5, 8.0, 9.0, 8.5, 9.5};
        System.arraycopy(notasAna, 0, estudantes[0].getNotas(), 0, 5);

        estudantes[1] = new Estudante("Carlos");
        double[] notasCarlos = {5.0, 6.0, 7.0, 5.5, 6.5};
        System.arraycopy(notasCarlos, 0, estudantes[1].getNotas(), 0, 5);

        estudantes[2] = new Estudante("Mariana");
        double[] notasMariana = {4.0, 5.5, 6.0, 4.5, 5.0};
        System.arraycopy(notasMariana, 0, estudantes[2].getNotas(), 0, 5);

        estudantes[3] = new Estudante("João");
        double[] notasJoao = {8.5, 7.0, 9.5, 8.0, 9.0};
        System.arraycopy(notasJoao, 0, estudantes[3].getNotas(), 0, 5);

        estudantes[4] = new Estudante("Carla");
        double[] notasCarla = {3.0, 4.0, 5.0, 3.5, 4.5};
        System.arraycopy(notasCarla, 0, estudantes[4].getNotas(), 0, 5);

        estudantes[5] = new Estudante("Pedro");
        double[] notasPedro = {6.5, 7.5, 8.0, 6.0, 7.0};
        System.arraycopy(notasPedro, 0, estudantes[5].getNotas(), 0, 5);

        System.out.println("Todos os estudantes:");
        for (Estudante e : estudantes) {
            System.out.printf("%s - Média: %.2f - %s%n",
                    e.getNome(),
                    e.calculaMedia(),
                    e.calculaMedia() >= 6.0 ? "APROVADO" : "REPROVADO"
            );
        }

        Estudante[] aprovados = FiltroEstudantes.filtrarAprovados(estudantes);

        if (aprovados != null) {
            System.out.println("\nTotal de aprovados: " + aprovados.length);
            System.out.println("\nLista de aprovados:");
            for (int i = 0; i < aprovados.length; i++) {
                System.out.printf("%d. %s - Média: %.2f%n",
                        (i + 1),
                        aprovados[i].getNome(),
                        aprovados[i].calculaMedia()
                );
            }
        } else {
            System.out.println("\nNenhum estudante foi aprovado.");
        }
    }
}