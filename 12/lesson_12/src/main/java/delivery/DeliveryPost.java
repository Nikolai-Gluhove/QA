package delivery;

public class DeliveryPost implements IDelivery{

    public final static String TYPE = "Почта";

    @Override
    public void delivery(String gruz){
        System.out.println("Я доставляю " + gruz);
    }
}
