package com.jap.customers;

import java.util.*;

public class CustomerService {

    // This method will return the names of the customers in sorted alphabetical
    // order.
    public List<String> getListOfCustomersSortedByName(List<Customer> customerList) {
        ArrayList<String> result = new ArrayList<>();
        for (Customer customer : customerList) {
            result.add(customer.getCustomerName());
        }
        Collections.sort(result);
        return result;
    }

}
