package com.training.oracle.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageApiAppApplication
{
public static void greetings()
{
	System.out.println("Hi Oracle");
}
	public static void main(String[] args)
	{
		SpringApplication.run(MessageApiAppApplication.class, args);
		greetings();
	}

}
