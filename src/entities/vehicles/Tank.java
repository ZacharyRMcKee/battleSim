package entities.vehicles;

public class Tank extends Vehicle {
	int number;
	float morale; // willingness to fight
	float strength; // offensive damage capability
	short armor; // in effective mm for front armor
	

	public boolean canPenetrate(Vehicle other) {
		return false;
	}


}
