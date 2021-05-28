package com.megacom.Singleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackageClasses = Person.class)
public class CashboxConfig {

    @Bean(name = "person")
    @Scope("singleton")
      public Person getNextPersonQueue(){
        return new Person("Бекмырза",22);
    }



    @Bean(name = "cashbox")
    public Cashbox getCash(){
        return new Cashbox(3);
    }
}
