package Service;

public class FedEx implements IDeliveryService{
    @Override
    public Boolean deliverProduct(Double amount) {
        System.out.println("Product delivered through FedEx and amount paid is :"+ amount);
        return  true;
    }
}
