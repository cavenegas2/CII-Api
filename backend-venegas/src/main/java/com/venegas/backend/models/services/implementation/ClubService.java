package com.venegas.backend.models.services.implementation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venegas.backend.models.dao.IClub;
import com.venegas.backend.models.entities.Club;
import com.venegas.backend.services.interfaces.IClubService;

@Service
public class ClubService implements IClubService {

	@Autowired
	private IClub dao;
	
	@Override
	
	public List<Club> findAll() {
		// TODO Auto-generated method stub
		return (List<Club>) dao.findAll();
	}

	@Override
	public Club findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

}
