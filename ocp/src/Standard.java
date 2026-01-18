public class Standard implements CustomerType {

    @Override
    public double applyDiscount(double montant) {
        return montant;
    }
}
