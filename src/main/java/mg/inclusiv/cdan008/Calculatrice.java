/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mg.inclusiv.cdan008;

import java.util.Scanner;

/**
 *
 * @author Inclusiv Academy
 */
public class Calculatrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des nombres
        System.out.println("Entrez deux nombres :");
        int nombre1 =  saisirNombre(scanner);
        int nombre2 = saisirNombre(scanner);

        // Opérations
        System.out.println("Résultats :");
        System.out.println("Addition : " + addition(nombre1, nombre2));
        System.out.println("Soustraction : " + soustraction(nombre1, nombre2));
        System.out.println("Multiplication : " + multiplication(nombre1, nombre2));
        System.out.println("Division : " + division(nombre1, nombre2));

        scanner.close();
    }

     //Méthode pour saisir un nombre en vérifiant si c'est un nombre valide
    public static int saisirNombre(Scanner scanner) {
        
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Erreur : Veuillez entrer un nombre valide.");
            }
        }
        
    }

    // Méthode pour l'addition
    public static int addition(int nombre1, int nombre2) {
        return nombre1 + nombre2;
    }

    // Méthode pour la soustraction
    public static int soustraction(int nombre1, int nombre2) {
        return nombre1 - nombre2;
    }

    // Méthode pour la multiplication
    public static int multiplication(int nombre1, int nombre2) {
        return nombre1 * nombre2;
    }

    // Méthode pour la division
    public static int division(int nombre1, int nombre2) {
        if (nombre2 == 0) {
            throw new IllegalArgumentException("Division par zéro impossible");
        }
        return nombre1 / nombre2;
    }
}
