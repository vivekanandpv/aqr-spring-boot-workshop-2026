package dev.vivekanand.aqrspringbootworkshop.apis;

import dev.vivekanand.aqrspringbootworkshop.entities.Customer;
import dev.vivekanand.aqrspringbootworkshop.services.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerApi {
    private final CustomerService customerService;

    public CustomerApi(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @GetMapping("{customerId}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") Long customerId) {
        return ResponseEntity.ok(customerService.getCustomer(customerId));
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.createCustomer(customer));
    }

    @PutMapping("{customerId}")
    public ResponseEntity<Customer> updateCustomer( @PathVariable long customerId, @RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.updateCustomer(customerId, customer));
    }

    @DeleteMapping("{customerId}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable long customerId) {
        customerService.deleteCustomer(customerId);
        return ResponseEntity.noContent().build();
    }
}
