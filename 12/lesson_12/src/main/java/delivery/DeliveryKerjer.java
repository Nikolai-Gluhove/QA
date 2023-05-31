package delivery;

public class DeliveryKerjer implements IDelivery{
    public final static String TYPE = "Курьер";

    @Override
    public void delivery(String gruz) {
        System.out.println("Я доставляю " + gruz);

    }


}
