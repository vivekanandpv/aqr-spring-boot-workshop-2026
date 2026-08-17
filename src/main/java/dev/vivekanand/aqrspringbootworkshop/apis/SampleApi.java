package dev.vivekanand.aqrspringbootworkshop.apis;

import dev.vivekanand.aqrspringbootworkshop.entities.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleApi.class);

    @GetMapping
    public ResponseEntity<Map<String, String>> sample(
            @RequestParam(required = false, defaultValue = "London") String location,
            @RequestParam(required = false, defaultValue = "default@gmail.com") String email
    ) {
        if (true) {
            throw new IllegalArgumentException("Oops!!");
        }

        return ResponseEntity.ok(Map.of("message", "Hello, world!", "location", location, "email", email));
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> sample(@RequestBody Customer customer) {
        LOGGER.info("Sample created");
        return ResponseEntity.ok(Map.of("message", customer.getFirstName() + " " + customer.getLastName()));
    }

    @PutMapping("{customerId}")
    public ResponseEntity<Map<String, String>> sample(@PathVariable int customerId, @RequestBody Customer customer) {
        LOGGER.debug("Sample updated");
        return ResponseEntity.ok(Map.of("message", customer.getFirstName() + " " + customer.getLastName() + " " + customerId));
    }

    @DeleteMapping("{customerId}")
    public ResponseEntity<Void> deleteById(@PathVariable int customerId) {
        return ResponseEntity.noContent().build();
    }


}
