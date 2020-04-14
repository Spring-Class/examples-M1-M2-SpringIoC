package com.luxoft.springioc.example04;

public class BusinessService {
    private String serviceType;
    private String domain;

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }


    @Override
    public String toString() {
        return serviceType + " remote: " + domain;
    }
}
