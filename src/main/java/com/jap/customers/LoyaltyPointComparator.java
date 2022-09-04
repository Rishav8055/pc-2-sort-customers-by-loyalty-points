package com.jap.customers;


import java.util.Comparator;

// Implement the Comparator interface
public class LoyaltyPointComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer A1,Customer A2 ){
        if (A1.getLoyaltyPoints()==A2.getLoyaltyPoints()){
            return 0;

        }
        if (A1.getLoyaltyPoints()>A2.getLoyaltyPoints()){
            return -1;
        }
        return 1;
    }

}
