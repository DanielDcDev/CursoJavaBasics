package com.mycompany.classcev;

import java.util.Scanner;


public class Class6 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Adicione o seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Adicione a sua nota: ");
        float nota = teclado.nextFloat();
        
        System.out.format("A nota de %s  e %.1f\n",nome, nota);
       
    }
}
