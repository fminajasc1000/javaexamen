package com.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.User;

/*
 * Interface de usuario repository
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	public Optional<User> findByUsername(String username);
}
