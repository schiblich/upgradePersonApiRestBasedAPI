package com.upgrade.rest.personApi.repositories;

import com.upgrade.rest.personApi.entities.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
