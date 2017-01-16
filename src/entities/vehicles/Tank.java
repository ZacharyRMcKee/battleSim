package entities.vehicles;

public abstract class Tank extends Vehicle {

	public boolean canPenetrate(Vehicle other) {
		return false;
	}


}
