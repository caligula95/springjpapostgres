package com.javamaster.springjpapostgres.repository;

import com.javamaster.springjpapostgres.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
