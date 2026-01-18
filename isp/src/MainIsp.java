import java.util.Scanner;

public class MainIsp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Imprimer");
            System.out.println("2. Scanner");
            System.out.println("3. Faxer");
            System.out.println("0. Quitter");
            System.out.print("Choix fonctionnalité : ");

            int fonction = lireEntier(scanner);
            if (fonction == 0) break;

            System.out.println("\nChoisir la machine :");
            System.out.println("1. Imprimante simple");
            System.out.println("2. Imprimante multifonction");
            System.out.print("Choix machine : ");

            int machineChoisie = lireEntier(scanner);
            Object machine = null;

            if (machineChoisie == 1) {
                machine = new ImprimanteSimple();
            } else if (machineChoisie == 2) {
                machine = new ImprimanteMultifonction();
            } else {
                System.out.println("Choix incorrect");
            }

            if (machine != null) {
                executerFonction(fonction, machine);
            }
        }
        scanner.close();
    }

    private static void executerFonction(int choix, Object machine) {
        switch (choix) {
            case 1:
                if (machine instanceof Printer imprimante) imprimante.mPrint();
                else System.out.println("Cette machine ne peut pas imprimer.");
                break;
            case 2:
                if (machine instanceof Scanneur scanneur) scanneur.mScan(); // "Scannaire" pour éviter conflit avec Scanner
                else System.out.println("Cette machine ne peut pas scanner.");
                break;
            case 3:
                if (machine instanceof Faxer fax) fax.mFax();
                else System.out.println("Cette machine ne peut pas envoyer de fax.");
                break;
            default:
                System.out.println("Fonction inconnue");
        }
    }

    private static int lireEntier(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.print("Entrée invalide : ");
            }
        }
    }
}
