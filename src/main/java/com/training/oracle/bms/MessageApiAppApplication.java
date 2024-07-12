package com.training.oracle.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MessageApiAppApplication
{
public static void greetings()
{
	System.out.println("Hi Oracle");
}
@GetMapping("day")
public String getday()
{
	return ("Today is Friday");
}
	public static void main(String[] args)
	{
		SpringApplication.run(MessageApiAppApplication.class, args);
		greetings();
	}

}
