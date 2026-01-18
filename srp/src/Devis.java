import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Devis extends Document implements IDisplay, ISaveable {

    private static final int VALIDITE_JOURS = 30;
    private final int validite;

    public Devis(double montantHT) {
        super(montantHT);
        this.validite = VALIDITE_JOURS;
    }

    @Override
    public void display() {
        System.out.println("\n--- DEVIS ---");
        System.out.println("Date : " + localDate);
        System.out.println("Montant HT : " + montantHT);
        System.out.println("TVA : " + String.format("%.2f", tva));
        System.out.println("Total TTC : " + totalTTC);
        System.out.println("Valable " + VALIDITE_JOURS + " jours");
    }

    @Override
    public String getFileName() {
        return "devis_" + localDate.format(FORMATTER) + ".txt";
    }

    @Override
    public String formatForFile() {
        return "DEVIS | " + localDate
                + " | HT=" + montantHT
                + " | TVA=" + tva
                + " | TTC=" + totalTTC
                + " | Valable " + validite + " jours\n";
    }
}