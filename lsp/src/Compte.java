public abstract class Compte {

    protected double solde;

    public void setSolde(double nouveauSolde) {
        if (nouveauSolde < 0) {
            throw new IllegalArgumentException("Le solde n'est pas un retrait.");
        }
        this.solde = nouveauSolde;
    }

    public double getSolde() {
        return solde;
    }

    public void deposer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Montant invalide");
        }
        solde += montant;
    }

    public void retirer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Montant invalide");
        }
        if (montant > solde) {
            throw new IllegalArgumentException("Solde insuffisant");
        }
        solde -= montant;
    }
}