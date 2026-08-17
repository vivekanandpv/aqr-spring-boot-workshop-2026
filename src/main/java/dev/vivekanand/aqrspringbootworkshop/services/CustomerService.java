package dev.vivekanand.aqrspringbootworkshop.services;

import dev.vivekanand.aqrspringbootworkshop.entities.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomers();
    Customer getCustomer(long customerId);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(long customerId, Customer customer);
    void deleteCustomer(long customerId);
}
