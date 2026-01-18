public class CalculateurRemise {

    public double calculerTotal(int typeClient, double montant) {

        switch (typeClient) {
            case 1 -> {
                return new Standard().applyDiscount(montant);
            }
            case 2 -> {
                return new Student().applyDiscount(montant);
            }
            case 3 -> {
                return new Vip().applyDiscount(montant);
            }
            case 4 -> {
                throw new IllegalArgumentException("Type de Client inconnu");
            }
            default -> {
                return new Standard().applyDiscount(montant);
            }
        }
    }
}
