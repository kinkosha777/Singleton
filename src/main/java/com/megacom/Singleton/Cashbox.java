package com.megacom.Singleton;

import org.springframework.beans.factory.annotation.Autowired;


public class Cashbox {

    private int number;

    @Autowired
    public Cashbox(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Cashbox{" +
                "number=" + number +
                '}';
    }
}
