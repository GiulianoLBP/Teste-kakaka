package br.lpm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int numeroPrimo = scanner.nextInt();

        Primo classPrimo = new Primo();
        boolean resultadoPrimo = classPrimo.oNumeroEPrimo(numeroPrimo);
        
        if (resultadoPrimo) {
            System.out.println(numeroPrimo + " é um número primo!");
        } else {
            System.out.println(numeroPrimo + " não é um número primo.");
        }

        


        System.out.print("Digite um número para verificar qual seu fatorial: ");
        int numeroFatorial = scanner.nextInt();  

        Fatorial classFatorial = new Fatorial();
        int resultadoFatorial = classFatorial.fazerFatorial(numeroFatorial);

        System.out.println(resultadoFatorial);

        System.out.print("Digite o tamanho do array");
        int tamanhoDoArray = scanner.nextInt();
        int[] arr = new int[tamanhoDoArray];

        System.out.print("Digite alguns numeros para ordenar o array: ");
        
        System.out.println("Digite os números para preencher o array: ");
        for (int i = 0; i < tamanhoDoArray; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();  
        }
        Ordenador classOrdenador = new Ordenador();
        classOrdenador.ordenarArrayDeInteiros(arr);

        System.out.println("Array ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.print("Digite a quantidade de notas");
        int tamanhoDoArrayDeNotas = scanner.nextInt();
        double[] arrayDeNotas = new double[tamanhoDoArrayDeNotas];

        System.out.print("Digite alguns numeros para ordenar o array: ");
        
        System.out.println("Digite os números para preencher o array: ");
        for (int i = 0; i < tamanhoDoArrayDeNotas; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            arrayDeNotas[i] = scanner.nextInt();  
        }
        Media classMedia = new Media();
        double resultadoMedia = classMedia.mediaDeNotas(arrayDeNotas);

        System.out.println(resultadoMedia);


    }
}