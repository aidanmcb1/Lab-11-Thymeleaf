package edu.cscc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.cscc.model.Store;

@Repository
public interface StoreRepository extends CrudRepository<Store, Long> {}
