package sim.chem.element;

public abstract class Element {
	
	private String name;
	
	private String letter;
	
	private int number;
	
	private double weight;
	
	private int period;
	
	private int group;
	
	private String category;
	
	private double meltingPoint;
	
	private double boilingPoint;
	
	private double ionicRadius;
	
	private double vanderwaalsRadius;
	
	private int valenceElectrons;
	
	private String year;
		
	public Element(String name, String letter, int number, double weight, int period, int group, String category, double meltingPoint, double boilingPoint, double ionicRadius, double vanderwaalsRadius, int valenceElectrons, String year) {
		
		this.name = name;
		
		this.letter = letter;
		
		this.number = number;
		
		this.weight = weight;
		
		this.period = period;
		
		this.group = group;
		
		this.category = category;
		
		this.meltingPoint = meltingPoint;
		
		this.boilingPoint = boilingPoint;
		
		this.ionicRadius = ionicRadius;
		
		this.vanderwaalsRadius = vanderwaalsRadius;
		
		this.valenceElectrons = valenceElectrons;
		
		this.year = year;
				
	}
	
	public Element(String name, String letter, int number, double weight) {
		
		this.name = name;
		
		this.letter = letter;
		
		this.number = number;
		
		this.weight = weight;
				
	}


	public String getName() {
		
		return name;
		
	}

	public void setName(String name) {
		
		this.name = name;
		
	}

	public String getLetter() {
		
		return letter;
		
	}

	public void setLetter(String letter) {
		
		this.letter = letter;
		
	}

	public int getNumber() {
		
		return number;
		
	}

	public void setNumber(int number) {
		
		this.number = number;
		
	}

	public double getWeight() {
		
		return weight;
		
	}

	public void setWeight(double weight) {
		
		this.weight = weight;
		
	}

	public int getPeriod() {
		
		return period;
	
	}

	public void setPeriod(int period) {
		
		this.period = period;
	
	}

	public int getGroup() {
		
		return group;
	
	}

	public void setGroup(int group) {
		
		this.group = group;
	
	}

	public String getCategory() {
		
		return category;
	
	}

	public void setCategory(String category) {
		
		this.category = category;
	
	}

	public double getMeltingPoint() {
		
		return meltingPoint;
	
	}

	public void setMeltingPoint(double meltingPoint) {
		
		this.meltingPoint = meltingPoint;
	
	}

	public double getBoilingPoint() {
		
		return boilingPoint;
	
	}

	public void setBoilingPoint(double boilingPoint) {
		
		this.boilingPoint = boilingPoint;
	
	}

	public double getIonicRadius() {
		
		return ionicRadius;
	
	}

	public void setIonicRadius(double ionicRadius) {
		
		this.ionicRadius = ionicRadius;
	
	}

	public double getVanderwaalsRadius() {
		
		return vanderwaalsRadius;
	
	}

	public void setVanderwaalsRadius(double vanderwaalsRadius) {
		
		this.vanderwaalsRadius = vanderwaalsRadius;
	
	}

	public int getValenceElectrons() {
		
		return valenceElectrons;
	
	}

	public void setValenceElectrons(int valenceElectrons) {
		
		this.valenceElectrons = valenceElectrons;
	
	}

	public String getYear() {
		
		return year;
	
	}

	public void setYear(String year) {
		
		this.year = year;
	
	}
	
}
