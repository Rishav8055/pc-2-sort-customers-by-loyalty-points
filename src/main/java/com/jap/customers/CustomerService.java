package com.jap.customers;


import java.util.*;

public class CustomerService {
    // This method returns the customer's loyalty points in sorted order
public List<Integer> getListOfCustomersSortedByLoyaltyPoints(List<Customer> customerList, LoyaltyPointComparator loyaltyPointComparator){
        List<Integer>  integerList= new ArrayList<>();
        Collections.sort(customerList,loyaltyPointComparator);
        Iterator<Customer> customerIterator=customerList.iterator();
        while (customerIterator.hasNext()){
            integerList.add(customerIterator.next().getLoyaltyPoints());

        }

    return integerList;
}

}
