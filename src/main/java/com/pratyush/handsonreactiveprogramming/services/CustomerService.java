package com.pratyush.handsonreactiveprogramming.services;

import com.pratyush.handsonreactiveprogramming.domain.Customer;
import com.pratyush.handsonreactiveprogramming.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Save a project
    public Mono<Customer> save(Customer customer) {
        return customerRepository.save(customer);
    }

    public Flux<Customer> saveAll(Flux<Customer> customerFlux) {
        return customerRepository.saveAll(customerFlux);
    }

    // @Todo Handle error
    public Mono<Customer> findById(String id) {
        Mono<Customer> temp = customerRepository.findCustomerById(id);
        return temp;
    }

    public Flux<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Mono<Void> deleteAll() {
        return customerRepository.deleteAll();
    }
}
