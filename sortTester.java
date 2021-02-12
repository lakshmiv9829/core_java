import java.util.ArrayList;
import java.util.List;

public class sortTester {
	public static void main(String[] args) {

		List<String> garageToolList=new ArrayList();
		garageToolList.add("spanner");
		garageToolList.add("screw Driver");
		garageToolList.add("cutting plier");
		garageToolList.add("hammer");
		garageToolList.add("nut");
		garageToolList.add("bolt");
		garageToolList.add("jack");
		garageToolList.add("air pump");
		garageToolList.add("gun");
		garageToolList.add("mechanic");
		
		
		//Collections is a utility class ??
		
		for (String toolSorted : garageToolList) {
			System.out.println(toolSorted);
		}
		
		
	}

}
