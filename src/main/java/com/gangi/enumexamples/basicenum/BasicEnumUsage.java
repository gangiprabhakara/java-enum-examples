package com.gangi.enumexamples.basicenum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicEnumUsage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(BasicEnumUsage.class);
    
    public static void main(String[] args) {
        
        //Basic Enum usages
        CreditCardType cardType = CreditCardType.AMEX;
        LOGGER.debug("Fetching name using name() method {}", cardType.name());

        //Always use toString() instead of name()
        LOGGER.debug("Fetching name using toString() method {}", cardType.toString()); 
        LOGGER.debug("Building an enum object using a string");
        LOGGER.debug(CreditCardType.valueOf("AMEX").toString());
        
        LOGGER.debug("**** Fetching all enums ****");
        for (CreditCardType aCardType : CreditCardType.values()) {
            LOGGER.debug(aCardType.toString());
        }
        
        LOGGER.debug("Comparing enums ...");
        LOGGER.debug("AMEX and VISA are equals? {}", (CreditCardType.AMEX == CreditCardType.VISA));
        
        LOGGER.debug("Switch with enum...");
        switch (cardType) {
            case AMEX:
                LOGGER.debug("Specified card type is AMEX");
                break;
            case VISA:
                LOGGER.debug("Specified card type is VISA");
                break;
            default:
                LOGGER.debug("Specified card type is {}", cardType.toString());
                break;
        }
        
         //compareTo javadocs
        /*
         * Compares this enum with the specified object for order. 
         * Returns a negative integer, zero, or a positive integer 
         * as this object is less than, equal to, or greater than the 
         * specified object. Enum constants are only comparable to 
         * other enum constants of the same enum type. 
         * The natural order implemented by this method is the order 
         * in which the constants are declared.
         */
        LOGGER.debug("Two enums comparison, AMEX.compareTo(VISA) {}", CreditCardType.AMEX.compareTo(CreditCardType.VISA));
        
        //MASTER is after the AMEX
        LOGGER.debug("Two enums comparison AMEX.compareTo(MASTER) {}", CreditCardType.AMEX.compareTo(CreditCardType.MASTER));

        //Ordinal
        LOGGER.debug("VISA ordinal {}", CreditCardType.VISA.ordinal());
        LOGGER.debug("AMEX ordinal {}", CreditCardType.AMEX.ordinal());
    }

}
