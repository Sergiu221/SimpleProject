package com.sergiu.lofo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sergiu.lofo.entity.CityEntity;

@Repository
public interface CityRepository extends CrudRepository<CityEntity, Integer> {

}
