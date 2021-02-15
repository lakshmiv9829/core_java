package com.xworkz.choice.tester;

import java.util.Optional;

import com.xworkz.choice.dto.GiftDTO;
import com.xworkz.choice.dto.GiftDTO.GiftType;
import com.xworkz.war.WarDTO;

public class TesterMadhu {

	public static void main(String[] args) {
		GiftDTO dto = new GiftDTO();
		// dto.setType(GiftType.FLOWER);
		dto.setPrice(20);
		Optional<GiftType> optGiftType = Optional.of(GiftType.FLOWER);
		dto.setType(optGiftType);

		Optional<GiftType> type = dto.getType();

		type.ifPresent(System.out::println);
		// type.ifPresent(r->System.out.println(r));
		dto.setGivenBy(Optional.of("sush"));
		dto.getGivenBy().ifPresent(v -> System.out.println(v.toUpperCase()));
		dto.getGivenBy().map(String::toUpperCase);

		WarDTO warDTO = new WarDTO();
		warDTO.setCountry("India");
		warDTO.setName("Kargil");
		System.out.println(warDTO);
	}

}
