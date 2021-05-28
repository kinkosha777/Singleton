package com.megacom.Singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Market {

    private Person person;
    private Cashbox cashbox;

    @Autowired
    public Market(Person person, Cashbox cashbox) {
        this.person = person;
        this.cashbox = cashbox;
    }

    @Override
    public String toString() {
        return "Market{" +
                "person=" + person +
                ", cashbox=" + cashbox +
                '}';
    }
}
