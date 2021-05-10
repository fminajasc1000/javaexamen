package com.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.Authority;
import com.demo.entity.User;

/*
 * Interface de usuario autority repository
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */
public interface AuthorityRepository extends CrudRepository<Authority, Long>{
	public Optional<Authority> findByAuthority(String authority);
}
