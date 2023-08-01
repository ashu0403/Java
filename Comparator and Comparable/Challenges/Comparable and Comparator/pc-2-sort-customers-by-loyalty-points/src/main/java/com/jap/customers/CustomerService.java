package com.jap.customers;

import java.util.*;

public class CustomerService {
    public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList,
            LoyaltyPointComparator loyaltyPointComparator) {
        // This method returns the customer's loyalty points in sorted order
        Collections.sort(customerList, new LoyaltyPointComparator());
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (Customer customer : customerList) {
            result.add(customer.getLoyaltyPoints());
        }
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }

}
