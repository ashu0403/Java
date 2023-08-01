package com.jap.customers;

import java.util.Comparator;

// Implement the Comparator interface
public class LoyaltyPointComparator implements Comparator<Customer> {

    public int compare(Customer c1, Customer c2) {
        return c1.getLoyaltyPoints() - c2.getLoyaltyPoints();
    }
}
