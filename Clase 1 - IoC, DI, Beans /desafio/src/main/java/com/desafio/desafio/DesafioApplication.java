package com.desafio.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.desafio.desafio.interfaces.IVehiculos;
import com.desafio.desafio.models.Colectivo;
import com.desafio.desafio.models.Taxi;

@SpringBootApplication
public class DesafioApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DesafioApplication.class, args);
		Taxi t1 = new Taxi();
		System.out.println(t1.getCapacidad());
		Colectivo c1 = new Colectivo();
		System.out.println(c1.getCapacidad());

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IVehiculos t2 = context.getBean("miTaxi", IVehiculos.class);
		System.out.println(t2.getCapacidad());
		IVehiculos c2 = context.getBean("miColectivo", IVehiculos.class);
		System.out.println(c2.getCapacidad());
		context.close();
	}

}
