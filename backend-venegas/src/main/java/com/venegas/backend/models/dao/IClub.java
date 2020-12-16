package com.venegas.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.venegas.backend.models.entities.Club;
public interface IClub extends CrudRepository<Club,Long> {

}
