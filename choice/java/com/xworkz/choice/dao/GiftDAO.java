package com.xworkz.choice.dao;

import java.util.Optional;

import com.xworkz.choice.dto.GiftDTO;

public interface GiftDAO {
	public void save(GiftDTO dto);
	public Optional<GiftDTO> fetchByGivenBy(String name);
}
