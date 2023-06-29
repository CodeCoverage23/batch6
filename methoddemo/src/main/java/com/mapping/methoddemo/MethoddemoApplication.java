package com.mapping.methoddemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mapping.methoddemo.controller.Contry;
import com.mapping.methoddemo.controller.DemoAPIImplement;

@SpringBootApplication
public class MethoddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MethoddemoApplication.class, args);

		DemoAPIImplement obj = new DemoAPIImplement();

		System.out.println("No need of object to execute much lines of code");
		obj.saveContries(new Contry(1, "India", "New Delhi"));
		obj.saveContries(new Contry(2, "Afghanistan", "Kabul"));
		obj.saveContries(new Contry(3, "Bangladesh", "Dhaka"));
		obj.saveContries(new Contry(4, "Belgium", "Brussels"));
		obj.saveContries(new Contry(5, "India", "New Delhi"));
		obj.saveContries(new Contry(6, "India", "New Delhi"));
		obj.saveContries(new Contry(7, "India", "New Delhi"));
		obj.saveContries(new Contry(8, "Belgium", "Brussels"));

//	obj.getAllContry().forEach(c->System.out.println(c));   //by advance jva

		List<Contry> allContry = obj.getAllContry(); // by core java
		for (Contry c : allContry) {
			System.out.println(c);
		}

		System.out.println();
		System.out.println(allContry);

		System.out.println();
		// get ---------2 tyoe se get kr skte

		Contry byName = obj.getByName("India");
		System.out.println(byName);

		System.out.println(obj.getByName("INDIA"));

	}

}
