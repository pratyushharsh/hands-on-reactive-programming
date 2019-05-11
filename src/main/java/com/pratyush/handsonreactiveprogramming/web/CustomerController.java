package com.pratyush.handsonreactiveprogramming.web;

import com.pratyush.handsonreactiveprogramming.domain.Customer;
import com.pratyush.handsonreactiveprogramming.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;


@RestController
@RequestMapping("/users")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    private Mono<Customer> getCustomerById(@PathVariable String id) {
        return customerService.findById(id);
    }

    @GetMapping("/all")
    private Flux<Customer> getAllCustomer() {
        return customerService.findAll();
    }

    @PostMapping("")
    public Mono<?> createNewUser(@Valid @RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PostMapping("/all")
    public Flux<?> saveMultipleUsers(@RequestBody Flux<Customer> customerFlux) {
        return customerService.saveAll(customerFlux);
    }

    @DeleteMapping("/all")
    public Mono<Void> remove() {
        return customerService.deleteAll();
    }

}
