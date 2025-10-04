package com.alumniConnect.altEnter;

import org.springframework.boot.SpringApplication;

public class TestAltEnterApplication {

	public static void main(String[] args) {
		SpringApplication.from(AltEnterApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
