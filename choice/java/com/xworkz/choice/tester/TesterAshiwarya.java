package com.xworkz.choice.tester;

import java.util.Optional;

import com.xworkz.choice.dao.GiftDAO;
import com.xworkz.choice.dao.GiftDAOImpl;
import com.xworkz.choice.dto.GiftDTO;
import com.xworkz.choice.dto.GiftDTO.GiftType;

public class TesterAshiwarya {

	public static void main(String[] args) {
		GiftDTO dto=new GiftDTO();
		GiftDAO dao=new GiftDAOImpl();
		dto.setPrice(15);
		dto.setType(Optional.of(GiftType.CHOCOLATE));
		dto.setGivenBy(Optional.of("Rhohan"));
		
//		System.out.println(dto.getPrice());
//		System.out.println(dto.getType());
//		
		dao.save(dto);
		Optional<GiftDTO> opt=dao.fetchByGivenBy("Veeresh");
		opt.ifPresent(v->System.out.println(v));
	}
}
