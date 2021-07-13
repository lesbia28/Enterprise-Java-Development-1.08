package model;

public class Truck extends Car{
	private int towingCapacity;

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(int vinNumber, String make, String model, int mileage, int towingCapacity) {
		super(vinNumber, make, model, mileage);
		this.towingCapacity= towingCapacity;
	

	}

	public int getTowingCapacity() {
		return towingCapacity;
	}

	public void setTowingCapacity(int towingCapacity) {
		this.towingCapacity = towingCapacity;
	}

	@Override
	public String toString() {
		return "Truck [towingCapacity=" + towingCapacity + ", getVinNumber()=" + getVinNumber() + ", getMake()="
				+ getMake() + ", getModel()=" + getModel() + ", getMileage()=" + getMileage() + "]";
	}
	
	

}
