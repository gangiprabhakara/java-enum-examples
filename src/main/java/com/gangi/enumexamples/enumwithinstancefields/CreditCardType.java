package com.gangi.enumexamples.enumwithinstancefields;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Enum to hold the supported credit Card types. 
 * 
 * @author pgangi
 *
 */
public enum CreditCardType implements Serializable {
/*
 * Name must be in Singular
 * Enums cannot extend other callses or interfaces
 * 
 * Enums can implement interfaces
 * 
 */
    VISA (4, 3) {
        /** {@inheritDoc} */
        @Override
        public String getCardTypeName() {
            return "Visa Credit Card";
        }
    },

    DISCOVER (8, 3){
        
        /** {@inheritDoc} */
        @Override
        public String getCardTypeName() {
            return "Discover Credit Card";
        }
    },

    AMEX (5, 4){
        /** {@inheritDoc} */
        @Override
        public String getCardTypeName() {
            return "Amex Credit Card";
        }
    },

    MASTER (6, 4){
        /** {@inheritDoc} */
        @Override
        public String getCardTypeName() {
            return "Master Credit Card";
        }
    };
    
    private static final Map<Integer, CreditCardType> TYPES_BY_PREFIX = new HashMap<>();
    
    static {
        for (CreditCardType cardType : CreditCardType.values()) {
            TYPES_BY_PREFIX.put(cardType.prefix, cardType);
        }
    }

    private int prefix;
    
    private int cvvLength;
    
    //No need of access modifier, by default private
    CreditCardType(int prefix, int cvvLength) {
        this.prefix = prefix;
        this.cvvLength = cvvLength;
    }
    
    public CreditCardType getCreditCardType(int prefix) {
        return TYPES_BY_PREFIX.get(prefix);
    }
    
    public abstract String getCardTypeName();
    
    public int getPrefix() {
        return prefix;
    }
    
    private int getCvvLength() {
        return cvvLength;
    }
}
