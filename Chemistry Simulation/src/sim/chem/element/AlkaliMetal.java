package sim.chem.element;

public class AlkaliMetal extends Element {
	
	public AlkaliMetal(String name, String letter, int number, double weight, int period, int group, String category, double meltingPoint, double boilingPoint, double ionicRadius, double vanderwaalsRadius, int valenceElectrons, String year) {
		
		super(name, letter, number, weight, period, group, category, meltingPoint, boilingPoint, ionicRadius, vanderwaalsRadius, valenceElectrons, year);
				
	}

	public AlkaliMetal(String name, String letter, int number, double weight) {
	
		super(name, letter, number, weight);
	
	}

}
