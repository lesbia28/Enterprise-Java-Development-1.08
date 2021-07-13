package model;

public class UtilityVehicle extends Car {
	private boolean fourWheelDrive;

	public UtilityVehicle() {
		super();
	}

	public UtilityVehicle(int vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
		super(vinNumber, make, model, mileage);
		this.fourWheelDrive=fourWheelDrive;
	}

	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}

	@Override
	public String toString() {
		return "UtilityVehicle [fourWheelDrive=" + fourWheelDrive + ", getVinNumber()=" + getVinNumber()
				+ ", getMake()=" + getMake() + ", getModel()=" + getModel() + ", getMileage()=" + getMileage() + "]";
	}

	
	
	
}
