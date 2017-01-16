package factions;

public abstract class Vehicle implements Killable {
	short health;
	public abstract boolean canPenetrate(Vehicle other);
	
	public boolean isDead()
	{
		if(health <= 0)
			return true;
		else
			return false;
	}


}
