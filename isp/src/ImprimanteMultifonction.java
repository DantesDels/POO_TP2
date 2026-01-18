public class ImprimanteMultifonction implements Printer, Scannaire, Faxer {

    @Override
    public void mPrint() {
        System.out.println("Impression en cours...");
    }

    @Override
    public void mScan() {
        System.out.println("Scan en cours...");
    }

    @Override
    public void mFax() {
        System.out.println("Fax envoyé...");
    }
}
