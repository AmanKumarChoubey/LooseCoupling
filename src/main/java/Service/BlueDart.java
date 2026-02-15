package Service;

public class BlueDart implements  IDeliveryService{
    @Override
    public Boolean deliverProduct(Double amount) {
        System.out.println("Product delivered through BlueDart and amount paid is :"+ amount);
        return  true;
    }
}
