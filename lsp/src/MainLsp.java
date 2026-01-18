import java.util.Scanner;

public class MainLsp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compte compte = choisirCompte(scanner);

        // Pattern matching avec instanceof + variable "compteCourant"
        if (compte instanceof CompteCourant compteCourant) {
            System.out.print("Montant à retirer : ");
            double montant = lireDouble(scanner);

            try {
                compteCourant.retirer(montant);
            } catch (IllegalArgumentException exception) {
                System.out.println("Erreur : " + exception.getMessage());
            }

        } else {
            System.out.println("\nCe type de compte (PEL) ne permet pas les retraits immédiats.");
            System.out.println("Solde actuel : " + compte.getSolde() + " €");
        }
        // Evite fuite mémoire
        scanner.close();
    }

    // Géré par Classe mère 'Compte'
    private static Compte choisirCompte(Scanner scanner) {
        System.out.println("\n--- TYPE DE COMPTE ---");
        System.out.println("1. Compte courant");
        System.out.println("2. PEL");
        System.out.print("Choix : ");

        int choix = lireEntier(scanner);
        // Choix PEL
        if (choix == 2) {
            PEL pel = new PEL();
            pel.setSolde(500);
            return pel;
        }
        // Choix CompteCourant
        CompteCourant compteCourant = new CompteCourant();
        compteCourant.setSolde(100);
        return compteCourant;
    }

    private static int lireEntier(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.print("Entrée invalide (entier attendu) : ");
            }
        }
    }

    private static double lireDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.print("Entrée invalide (nombre attendu) : ");
            }
        }
    }
}