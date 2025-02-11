package br.lpm;

public class Fatorial {

    public int fazerFatorial(int numero){
        if(numero <0){

            throw new IllegalArgumentException("Nao existe fatorial de numero negativo");
        }

        if(numero == 0){
            return 1;
        }
        if(numero == 1){
            return 1;
        }
        return numero*fazerFatorial(numero-1);
    }
}
