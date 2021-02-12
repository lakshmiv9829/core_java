package com.xworkz.resorts.services;

import java.util.List;

import com.xworkz.resorts.ResortDTO;

public interface ResortService {
boolean validateAndSave(ResortDTO dto);
	
	boolean validateAndUpdateLocationByName(String location, String name);

	boolean validateAndUpdateLocationByNameandRating(String location, String name, float rating);

	boolean validatAndDeleteByNameAndLocation(String name, String location);
	
	 boolean validateAddMultipleResorts(List<ResortDTO> dtos);
	
	int validateTotalResortSize();
}

