import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class Document {

    public LocalDateTime localDate;
    public double montantHT;
    public double tva;
    public double totalTTC;
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");


    public Document(double montantHT) {
        this.localDate = LocalDateTime.now();
        this.montantHT = montantHT;
        this.tva = montantHT * 0.2;
        this.totalTTC = this.montantHT + this.tva;
    }
}
