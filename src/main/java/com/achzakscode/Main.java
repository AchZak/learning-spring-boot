package com.achzakscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/customers") //Everytime someone visits this path, he'll get an empty list of customers
public class Main {

    private final CustomerRepository customerRepository;

    public Main(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest request){
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());
        customerRepository.save(customer);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id){
        // We could also implement businesslogic
        customerRepository.deleteById(id);
    }

    record NewCustomerRequest(String name, String email, Integer age){

    }



//    @GetMapping() // greet i need to do localost:8080/greet
//    public GreetResponse greet(){
//        GreetResponse response = new GreetResponse(
//                "Hello",
//                List.of("Java", "Golang", "Javascript"),
//                new Person("Alex", 28, 30_000)
//        );
//        return response;
//    }


//    record Person (String name, int age, double savings){
//
//    }
//    record GreetResponse(
//            String greet,
//            List<String> favProgrammingLanguages,
//            Person person
//    ){}

}
