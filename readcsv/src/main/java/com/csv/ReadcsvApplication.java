package com.csv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadcsvApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ReadcsvApplication.class, args);

		Path path = Path.of("src", "main", "resource", "Car.csv");

		List<Car> list = Files.lines(path).skip(1).map(line -> {
			String[] f = line.split(",");
			return new Car(Integer.parseInt(f[0]), f[1], f[2], f[3]);
		}).collect(Collectors.toList());

	}

}
