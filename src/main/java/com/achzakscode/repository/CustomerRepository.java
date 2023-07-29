package com.achzakscode.repository;

import com.achzakscode.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/*This is the CustomerRepository interface, extending JpaRepository<Customer, Integer>.
It serves as the data access layer for the Customer entity, allowing easy interaction with the underlying database.
CustomerRepository: Interface providing CRUD (Create, Read, Update, Delete) operations for the Customer entity.
extends JpaRepository<Customer, Integer>: Extends the JpaRepository interface with the Customer entity and the type of its primary key (Integer).
This provides various methods for interacting with the Customer entity and the associated database table.
In summary, the CustomerRepository acts as an intermediary between the application and the database,
providing convenient methods to perform database operations related to the Customer entity.
 */

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}