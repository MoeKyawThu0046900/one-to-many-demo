package com.example.onetomanytest;

import com.example.onetomanytest.service.IDataBase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToManyTestApplication {

	private final IDataBase iDataBase;

	public OneToManyTestApplication(IDataBase iDataBase){this.iDataBase = iDataBase;}

	public static void main(String[] args) {
		SpringApplication.run(OneToManyTestApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(){
		return  a -> {
			iDataBase.createDataBase();
		};
	}

}
