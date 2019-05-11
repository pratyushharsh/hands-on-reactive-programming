package com.pratyush.handsonreactiveprogramming.repository;

import com.pratyush.handsonreactiveprogramming.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {

    Mono<Customer> findCustomerById(String id);

}
