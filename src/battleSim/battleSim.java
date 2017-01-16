package battleSim;
import java.util.InputMismatchException;
import java.util.Scanner;

import domains.Aerial;
import domains.Land;
import domains.Naval;


public class battleSim {
	static Aerial air;
	static Land land;
	static Naval sea;
	static byte battleType;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Is this a naval or a land battle?");
		System.out.println("1 for land (default), or 2 for naval");
		try
		{
			switch(in.nextInt())
			{
				case 1: battleType = 1;
				break;
				case 2: battleType = 2;
				break;
				default: battleType = 1;
				break;
			}
		}
		catch(InputMismatchException e)
		{
			battleType = 1;
		}
		in.close();
		System.out.println(battleType);
		loadBattle(battleType);
		System.out.println("Domains of battle loaded");
		executeBattle(battleType);
	}
	public static void loadBattle(byte type)
	{
		if(type==1)
		{
			air = new Aerial();
			land = new Land();
		}
		else if(type==2)
		{
			sea = new Naval();
			air = new Aerial();
		}
		else if(type==3)
		{
			air = new Aerial();
		}
	}
	public static void executeBattle(byte type)
	{
		
	}

}
