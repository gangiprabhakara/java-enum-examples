package com.gangi.enumexamples.enumwithinstancefields;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedEnumUsage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AdvancedEnumUsage.class);
    
    public static void main(String[] args) {
        
        //Basic Enum usages
        LOGGER.debug("Sum of 4 and 5 is {}", Operation.PLUS.calculate(4, 5));

        LOGGER.debug("Name of card type (using abstract method) {}", CreditCardType.AMEX.getCardTypeName());
    }

}
