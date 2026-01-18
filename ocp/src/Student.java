public class Student implements CustomerType {

    @Override
    public double applyDiscount(double montant) {
        return montant * 0.9;
    }
}