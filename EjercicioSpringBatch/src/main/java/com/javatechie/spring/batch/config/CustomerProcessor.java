package com.javatechie.spring.batch.config;

import com.javatechie.spring.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
        if(customer.getPais().equals("China") 
        		&& customer.getGenero().equals("Female")) {
            return customer;
        }else{
            return null;
        }
    }
}
