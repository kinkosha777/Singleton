package com.megacom.Singleton;


import com.megacom.Singleton.services.CashboxService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingletonApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(CashboxConfig.class);

		Person person = (Person) context.getBean("person");
		System.out.println(person);

		Cashbox cashbox =(Cashbox) context.getBean("cashbox");
		System.out.println(cashbox);

		Market market = context.getBean("market",Market.class);
		System.out.println(market);

		CashboxService cashboxService = context.getBean("cashboxServiceImpl",CashboxService.class);
		System.out.println(cashboxService.getNextPersonQueue());


	}

}
