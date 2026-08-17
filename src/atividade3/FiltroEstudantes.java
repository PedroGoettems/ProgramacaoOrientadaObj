//package atividade3;

public class FiltroEstudantes {
    
    /**
     * metodo que recebe um array de objetos Estudante, calcula a média de cada um
     * e retorna um novo array contendo apenas os aprovados (média >= 6.0)
     * 
     * @param estudantes array de objetos Estudante
     * @return array com estudantes aprovados ou null se nenhum foi aprovado
     */
    public static Estudante[] filtrarAprovados(Estudante[] estudantes) {
        if (estudantes == null || estudantes.length == 0) {
            return null;
        }
        
        int contadorAprovados = 0;
        for (Estudante estudante : estudantes) {
            if (estudante != null && estudante.calculaMedia() >= 6.0) {
                contadorAprovados++;
            }
        }
        
        if (contadorAprovados == 0) {
            return null;
        }
        
        Estudante[] aprovados = new Estudante[contadorAprovados];
        int indice = 0;
        for (Estudante estudante : estudantes) {
            if (estudante != null && estudante.calculaMedia() >= 6.0) {
                aprovados[indice] = estudante;
                indice++;
            }
        }
        
        return aprovados;
    }
}