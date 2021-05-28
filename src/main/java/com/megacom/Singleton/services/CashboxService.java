package com.megacom.Singleton.services;

import com.megacom.Singleton.Person;
import org.springframework.stereotype.Service;


@Service
public interface CashboxService {
    Person getNextPersonQueue();


}
