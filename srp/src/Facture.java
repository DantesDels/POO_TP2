import java.time.LocalDateTime;

public class Facture extends Document implements IDisplay, ISaveable {

    private String clientName;

    public Facture(double montantHT, String clientName) {
        super(montantHT);
        this.clientName = clientName;
    }

    @Override
    public void display() {
        System.out.println("\n--- FACTURE ---");
        System.out.println("Date : " + localDate);
        System.out.println("Client : " + clientName);
        System.out.println("Montant HT : " + montantHT);
        System.out.println("TVA : " + tva);
        System.out.println("Total TTC : " + totalTTC);
    }

    @Override
    public String getFileName() {
        return "facture_" +clientName + ".txt";
    }

    @Override
    public String formatForFile() {
        return "FACTURE | " + localDate
                + " | Client=" + clientName
                + " | HT=" + montantHT
                + " | TVA=" + tva
                + " | TTC=" + totalTTC + "\n";
    }
}
