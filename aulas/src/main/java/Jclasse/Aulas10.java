package Jclasse;

import java.util.Scanner;

public class Aulas10 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

            System.out.println("Quantas pernas?  ");
        int perna = t.nextInt();
        String animal;

        switch (perna) {
            case 1:
                animal = "Saci";
                break;
            case 2:
                animal = "Bipede";
                break;
            case 3:
                animal = "Tripe";
                break;
            case 4:
                animal = "Quadrupede";
                break;
            case 7:
                animal = "Aranha";
                break;
            default:
                animal = "Et";
            }
        System.out.println(animal);
        
       
    }


    }

