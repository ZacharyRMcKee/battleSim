package entities;

import factions.Faction;

public class Infantry {
	int number;
	byte strength; 
	Faction faction;  
	public Infantry()
	{
		number = 10_000;
	}
	public Infantry(int q)
	{
		number = q;
	}

	
}
