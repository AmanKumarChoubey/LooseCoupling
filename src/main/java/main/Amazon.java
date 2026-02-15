package main;

import Service.FedEx;
import Service.IDeliveryService;

public class Amazon {
    private IDeliveryService service;

    public void setService(IDeliveryService service) {
        this.service = service;
    }

    public Boolean deliverTheProduct(Double amount){
        return service.deliverProduct(amount);
    }
}
