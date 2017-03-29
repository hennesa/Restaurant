package buisness;

import model.Meal;
import model.Plate;
import model.Sandwitch;

public class Printer {
	
	public static void printList (Meal[] m) {
		double totalPrice = 0;
		
		System.out.println("MOM Restaurant");
		System.out.println("==============");
		
		for (Meal i : m) {
			System.out.print(i.name + " ");
			if (i instanceof Sandwitch) {
				System.out.print(((Sandwitch) i).getSandwitchSize().getName() + " ");
			} else if(i instanceof Plate) {
				if (((Plate) i).isPotatable()) {
					System.out.print("with potatos ");
				}
			}
			System.out.println(i.getPrice());
			totalPrice += i.getPrice();
		}
		
		System.out.println("--------------");
		System.out.println("Total:  " + totalPrice);
	}
}
