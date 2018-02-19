package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
		
public static void main(String[] args) {
	
	Pig adfg = new Pig();
	Cow adfj= new Cow();
	Chicken adhgur = new Chicken();
	Chicken aahgue = new Chicken();
	Human Farmer_Jhon = new Human();
	Human Jhons_Wife = new Human();
	
	ArrayList<Animal>Farm = new ArrayList<Animal>();
	Farm.add(Farmer_Jhon);
	Farm.add(Jhons_Wife);
	Farm.add(adfg);
	Farm.add(adfj);
	Farm.add(adhgur);
	Farm.add(aahgue);
	
	for (int i = 0; i < Farm.size(); i++) {
		Farm.get(i).makeNoise();
		Farm.get(i).isDead();
	}
}
}
