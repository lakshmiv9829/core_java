package com.xworkz.resorts.services;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.resorts.ResortDTO;
import com.xworkz.resorts.daos.ResortDAO;
import com.xworkz.resorts.daos.ResortDAOImpl;

public class ResortSeviceTester {

	public static void main(String[] args) {
		List<ResortDTO> list = new ArrayList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);
		ResortService resortService = new ResortServiceImpl(dao);

		ResortDTO dto = new ResortDTO("goa", "goaResort", "mayank", 15);
		dto.setPricePerHead(2000);
		dto.setNoOfEmployees(10);
		dto.setOffers(false);
		dto.setPhoneNo(7829731400l);
		dto.setPoolExist(false);
		dto.setRating(4);

		resortService.validateAndSave(dto);

		ResortDTO dto2 = new ResortDTO("munnar", "munnar Castel", "Sampangappa", 15);
		dto2.setPricePerHead(2000);
		dto2.setNoOfEmployees(10);
		dto2.setOffers(false);
		dto2.setPhoneNo(7829731400l);
		dto2.setPoolExist(false);
		dto2.setRating(4);

		resortService.validateAndSave(dto2);

		System.out.println(resortService.validateTotalResortSize());

		resortService.validateAddMultipleResorts(list);

		resortService.validateAndUpdateLocationByName("Nandhi", "Nandhni");

		resortService.validateAndUpdateLocationByNameandRating("ooty", "ootyResort", 4);
		resortService.validatAndDeleteByNameAndLocation("ootyResort", "ooty");

		System.out.println(resortService.validateTotalResortSize());

		System.out.println();

	}
}