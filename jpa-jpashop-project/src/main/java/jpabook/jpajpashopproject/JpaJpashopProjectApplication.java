package jpabook.jpajpashopproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaJpashopProjectApplication {

	public static void main(String[] args) {
		
		Hello hello = new Hello();
		hello.setName("hello");
		String name = hello.getName();
		System.out.println("name = " + name);

		SpringApplication.run(JpaJpashopProjectApplication.class, args);
	}

}
