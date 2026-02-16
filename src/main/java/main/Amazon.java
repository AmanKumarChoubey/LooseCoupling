package main;

import Service.FedEx;
import Service.IDeliveryService;

public class Amazon {
    private IDeliveryService service;


    //Through Setter Intjection
    // public void setService(IDeliveryService service) {
    //     this.service = service;
    // }

    public Amazon(IDeliveryService service){
        this.service=service;
    }
    public Boolean deliverTheProduct(Double amount){
        return service.deliverProduct(amount);
    }
}
