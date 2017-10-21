package com.gangi.enumexamples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gangi.enumexamples.basicenum.CreditCardType;

/**
 * Main class that starts Enum examples application.
 * 
 * @author pgangi
 *
 */
@SpringBootApplication
public class EnumExamplesApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(EnumExamplesApplication.class);
	
    /**
     * Main method to start the app.
     * 
     * @param args the input params
     */
    public static void main(String[] args) {
		SpringApplication.run(EnumExamplesApplication.class, args);
		
		
	}
}
