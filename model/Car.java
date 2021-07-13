package model;

public abstract class Car {
	//vinNumber, marca, modelo, y millas
	private int vinNumber;
	private String make ;
	private String model;
	private int mileage;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(int vinNumber, String make, String model, int mileage) {
		super();
		this.vinNumber = vinNumber;
		this.make = make;
		this.model = model;
		this.mileage = mileage;
	}

	public int getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(int vinNumber) {
		this.vinNumber = vinNumber;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	
	
	
	
	
}
