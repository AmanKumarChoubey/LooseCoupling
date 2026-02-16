package main;

import Service.FedEx;
import Service.IDeliveryService;

public class LaunchAmazon{
    public static void main(String[] args) {
        Amazon amazon=new Amazon(new BlueDart()); //Through Constructor Injection
        //Setter Injection
        // amazon.setService(new FedEx());
        Boolean flag= amazon.deliverTheProduct(2090.0);
        if(flag) System.out.println("Product delivered Successfull");
        else System.out.println("Faild to Deliver Product");
    }
}
