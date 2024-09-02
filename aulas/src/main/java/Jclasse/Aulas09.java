package Jclasse;

import java.util.Scanner;

public class Aulas09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual exemplo deseja ver: ");
        int r = teclado.nextInt();
        switch (r) {
            case 1 -> Simples();
            case 2-> Composta();
        }
        
       
    }
public static void Simples() {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float note = (n1+n2)/2;
        System.out.println("Sua media foi "+ note);
        
        if(note>9){
            System.out.println("Parabens, pequeno gafanhoto!");
        }  
        } 

public static void Composta() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Em que ano voce nasceu: ");
        int nasc = teclado.nextInt();
        int i= 2024-nasc;
        System.out.println("A sua idade e " +i);
        if (i>=18) {
            System.out.println("Maior de idade!");     
    }else {
            System.out.println("Menor de idade!");
        }
            
}

    }

