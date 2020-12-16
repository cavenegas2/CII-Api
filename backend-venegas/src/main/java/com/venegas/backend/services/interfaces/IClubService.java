package com.venegas.backend.services.interfaces;

import java.util.List;

import com.venegas.backend.models.entities.Club;

public interface IClubService {
	
	public List<Club> findAll();
	public Club findById(Long id);

}
