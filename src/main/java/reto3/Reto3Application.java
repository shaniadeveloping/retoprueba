package reto3;

import reto3.interfaces.InterfaceOrder;
import reto3.interfaces.InterfaceSupplements;
import reto3.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@Component
@SpringBootApplication


public class Reto3Application implements CommandLineRunner {
	@Autowired
	private InterfaceSupplements interfaceSupplements;
	@Autowired
	private InterfaceUser interfaceUser;
	@Autowired
	private InterfaceOrder interfaceOrder;
	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		interfaceSupplements.deleteAll();
		interfaceUser.deleteAll();
		interfaceOrder.deleteAll();
	}

}
