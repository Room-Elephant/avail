package com.roomelephant.avail;

import org.springframework.boot.SpringApplication;

public class TestAvailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(AvailServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
