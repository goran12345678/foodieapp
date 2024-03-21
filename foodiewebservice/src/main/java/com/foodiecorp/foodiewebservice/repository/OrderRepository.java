package com.foodiecorp.foodiewebservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.foodiecorp.foodiewebservice.model.Menu;

public interface OrderRepository extends CrudRepository<Menu, Integer> {

}
