public class PEL extends Compte {
    private double tauxInteret = 0.125; //Parce qu'on souhaite un manoir

    public void appliquerInterets() {
        double interets = getSolde() * tauxInteret;
        setSolde(getSolde() + interets);
    }
}