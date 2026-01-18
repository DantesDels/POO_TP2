public class CompteCourant extends Compte {

    public void retirer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Montant invalide");
        }
        if (montant > this.solde) {
            throw new IllegalArgumentException("Solde insuffisant");
        }
        this.solde -= montant;
    }
}