package br.lpm;

public class Media {
    public double mediaDeNotas(double[] todasNotas){
        double soma = 0.0;

        // Percorre o array e soma todos os elementos
        for (int i = 0; i < todasNotas.length; i++) {
            soma += todasNotas[i];
        }

        // Calcula e retorna a média
        return soma / todasNotas.length;
    }
}
