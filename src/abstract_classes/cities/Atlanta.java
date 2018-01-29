package abstract_classes.cities;

public class Atlanta extends City {

	
	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
		
	}

	double getAnnualTaxes() {
		
		return (population*growthRate)*(2*growthRate);
	}

}
