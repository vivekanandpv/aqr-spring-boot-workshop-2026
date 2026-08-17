package dev.vivekanand.aqrspringbootworkshop.services;

import dev.vivekanand.aqrspringbootworkshop.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplementation implements CustomerService {
    @Override
    public List<Customer> getCustomers() {
        return List.of();
    }

    @Override
    public Customer getCustomer(long customerId) {
        return null;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer updateCustomer(long customerId, Customer customer) {
        return null;
    }

    @Override
    public void deleteCustomer(long customerId) {

    }
}
