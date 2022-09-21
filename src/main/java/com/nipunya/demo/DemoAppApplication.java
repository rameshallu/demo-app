package com.nipunya.demo;

//import com.nipunya.demo.domain.vehicle.Car;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Import;
//import org.springframework.web.servlet.LocaleResolver;

@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
//@Import(ProductionConfiguration.class)
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

//	@Bean
//	public LocaleResolver localeResolver()
//	{
//		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//		localeResolver.setDefaultLocale(Locale.US);
//		return localeResolver;
//	}

}
