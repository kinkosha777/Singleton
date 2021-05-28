package com.megacom.Singleton.services.impl;

import com.megacom.Singleton.Person;
import com.megacom.Singleton.services.CashboxService;
import org.springframework.stereotype.Service;

@Service
public class CashboxServiceImpl implements CashboxService {

    @Override
    public Person getNextPersonQueue() {

        return new Person("Жылдызбек",19);
//        return new Person("Бекмырза",23);
    }
}
