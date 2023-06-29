package com.csv.carcsv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarcsvApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CarcsvApplication.class, args);
		
		
		// ye location dega file ki 1 st step
		Path path = Path.of("src", "main", "resources", "Car.csv");

		// step 6 path ko read krne ke liye file class h
		//skip method line ko skip krne ke use me ati h
		Files.lines(path).skip(1).map(line -> {
			String [] f = line.split(",");
			return new Car(Integer.parseInt(f[0]), f[1], f[2], f[3]);
		}).forEach(System.out::println);
		
		System.out.println();
		
		List<Car> collect = Files.lines(path).skip(1).map(line -> {
			String [] f = line.split(",");
			return new Car(Integer.parseInt(f[0]), f[1], f[2], f[3]);
		}).collect(Collectors.toList());
		
		System.out.println(collect);
		System.out.println();
		System.out.println("after filter");
		System.out.println();
		
		collect.stream().filter(entry -> entry.getYear()<2030).collect(Collectors.toList()).forEach(System.out::println);
	}

}
