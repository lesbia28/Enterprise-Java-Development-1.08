package model;

public class Sedan extends Car {

	public Sedan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sedan(int vinNumber, String make, String model, int mileage) {
		super(vinNumber, make, model, mileage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sedan [getVinNumber()=" + getVinNumber() + ", getMake()=" + getMake() + ", getModel()=" + getModel()
				+ ", getMileage()=" + getMileage() + "]";
	}

	
	
	
	
}
