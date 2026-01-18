import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class FacturationManager {

    private final SaveManager saveManager = new SaveManager();

    public void creerFacture(double montantHT, String clientName) {
        // Affichage
        Facture facture = new Facture(montantHT, clientName);
        facture.display();

        // Sauvegarde fichier
        saveManager.save(facture);
    }

    public void creerDevis(double montantHT) {
        // Affichage
        Devis devis = new Devis(montantHT);
        devis.display();

        // Sauvegarde fichier
        saveManager.save(devis);
    }
}
