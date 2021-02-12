package com.xworkz.resorts.tester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.resorts.ResortDTO;
import com.xworkz.resorts.daos.ResortDAO;
import com.xworkz.resorts.daos.ResortDAOImpl;
import com.xworkz.resorts.services.ResortService;
import com.xworkz.resorts.services.ResortServiceImpl;

public class ResortTester {
	public static void main(String[] args) {
		List<ResortDTO> list = new LinkedList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);

		//ResortService resortService = new ResortServiceImpl(dao);

		ResortDTO dto = new ResortDTO("goa", "goaResort", "mayank", 15);
		dto.setPricePerHead(2000);
		dto.setNoOfEmployees(10);
		dto.setOffers(false);
		dto.setPhoneNo(7829731400l);
		dto.setPoolExist(false);
        dto.setRating(4);
		dao.save(dto);
		
		
		ResortDTO dto2=new ResortDTO("Dandeli", "RiverEdge", "Dinesh", 20);
		dto2.setPricePerHead(2000);
		dto2.setNoOfEmployees(15);
		dto2.setOffers(true);
		dto2.setPhoneNo(7229731400l);
		dto2.setPoolExist(false);
        dto2.setRating(3);
		dao.save(dto2);
		
		System.out.println(dao.totalResortSize());
		
		dao.updateLocationByName("Sakleshpur", "KaliAdventure");
		
		dao.updateLocationByNameandRating("ooty", "ottyReesort", 4);
		
		dao.deleteByNameAndLocation("ootyResort", "ooty");
		
		dao.addMultipleResorts(list);
		
		
	}

}