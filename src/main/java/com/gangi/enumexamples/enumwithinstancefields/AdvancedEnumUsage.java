package com.gangi.enumexamples.enumwithinstancefields;

import java.util.EnumMap;
import java.util.EnumSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvancedEnumUsage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AdvancedEnumUsage.class);
    
    public static void main(String[] args) {
        
        //Basic Enum usages
        LOGGER.debug("Sum of 4 and 5 is {}", Operation.PLUS.calculate(4, 5));

        LOGGER.debug("Name of card type (using abstract method) {}", CreditCardType.AMEX.getCardTypeName());
    
        /*
         * If you are using enum keys or can use enum keys prefer EnumMap over 
         * HashMap or any other Map implementation because EnumMap is specialized Map 
         * implementation for enum and provides better performance than general map
         */
        EnumMap<CreditCardType, String> creditCardTypes = new EnumMap<>(CreditCardType.class);
        creditCardTypes.put(CreditCardType.AMEX, "Mine");
        creditCardTypes.put(CreditCardType.VISA, "Spouse's");
        
        /*
         * EnumSet is a special Set implementation, only applicable for Enums in Java,
         * but you can only store instances of the single enum type. 
         * Adding an instance of different enum will result in compile time error, 
         * as EnumSet provide type-safety.
         */
        EnumSet<CreditCardType> ccTypes = EnumSet.of(CreditCardType.AMEX, CreditCardType.VISA);
        ccTypes.range(CreditCardType.VISA, CreditCardType.MASTER);
    }

}
