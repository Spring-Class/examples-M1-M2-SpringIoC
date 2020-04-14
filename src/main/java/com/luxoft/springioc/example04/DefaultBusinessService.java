package com.luxoft.springioc.example04;

public class DefaultBusinessService {
    public static BusinessService createBusinessServiceInstance(String serviceType) {
        BusinessService businessService = new BusinessService();
        businessService.setServiceType(serviceType);
        if (serviceType.equals("Luxoft")) {
            businessService.setDomain("IT");
        } else {
            businessService.setDomain("Financial");
        }
        return businessService;
    }
}
