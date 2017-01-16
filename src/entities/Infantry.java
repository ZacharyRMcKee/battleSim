package entities;

import factions.Faction;

public class Infantry {
	int number;
	byte armor;
	float strength; // combat capability of their weapons (ex. AK-47 > MAS-49). goes down due to bad supply
	float morale;
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
