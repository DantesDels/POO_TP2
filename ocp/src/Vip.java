public class Vip implements CustomerType {

    @Override
    public double applyDiscount(double montant) {
        return montant * 0.8;
    }
}
