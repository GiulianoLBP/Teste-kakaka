package br.lpm;

public class Primo {
    
    public boolean oNumeroEPrimo(int numero){
        if(numero <2){
            return false;
        }
        for(int i = 2;i*i<=numero;i++){
            if(numero%i == 0){
                return false;
            }
        }
        return true;   
    }

}
