public class PigeonVoyageur implements MessageSender{

    @Override
    public void send(String message) {
        System.out.println("Le pigeon prend son envole : " + message);
    }
}
