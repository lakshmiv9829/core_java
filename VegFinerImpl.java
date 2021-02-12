package VegFinderImpl;

import com.xworkz.moon.dto.MenuDTO;
import com.xworkz.moon.dto.MenuDTO.Type;

import Finder.Finder;

public class VegFinerImpl implements Finder{

	@Override
	public boolean test(MenuDTO dto) {
		if (dto != null && dto.getType().equals(Type.VEG)) {
			return true;
		}
		return false;
	}

}
