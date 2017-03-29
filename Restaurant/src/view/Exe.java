package view;

import buisness.Printer;
import model.Meal;
import model.Plate;
import model.Sandwitch;
import model.SandwitchSize;

public class Exe {

	public static void main(String[] args) {
		Meal[] order = new Meal[4];
		
		Sandwitch s1 = new Sandwitch();
		Sandwitch s2 = new Sandwitch();
		Plate p1 = new Plate();
		Plate p2 = new Plate();
		
		//data entry
		s1.name = "Shish Tawook";
		s1.setSandwitchSize(SandwitchSize.LARGE);
		s1.setPrice(27);
		s2.name = "Meat Shawerma";
		s2.setSandwitchSize(SandwitchSize.WRAP);
		s2.setPrice(15);
		p1.name = "Mix Grill";
		p1.setPotatable(true);
		p1.setPrice(52.5);
		p2.name = "Grilled Chicken Diet";
		p2.setPotatable(false);
		p2.setPrice(47);
		//fill order
		order[0] = s1;
		order[1] = s2;
		order[2] = p1;
		order[3] = p2;
		
		Printer.printList(order);

	}

}
