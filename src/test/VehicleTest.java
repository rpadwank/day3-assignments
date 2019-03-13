package test;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import main.Vehicle;

public class VehicleTest
{
	static Vehicle vehicle[];
	@BeforeClass
	public static void setUp()
	{
		vehicle = new Vehicle[5];
		vehicle[0] = new Vehicle("John Doe", 30, 85,true);
		vehicle[1] = new Vehicle("Jane Doe", 45, 75,true);
		vehicle[2] = new Vehicle("John Wick", 90, 65,true);
		vehicle[3] = new Vehicle("John Doe", 40, 95,true);
		vehicle[4] = new Vehicle("John Doe", 40, 95,true);
	
	}
	
	@AfterClass
	public static void tearUp()
	{
		for(int i=0;i<vehicle.length;i++)
		{
			vehicle[i] = null;
		}
	
	}
	
	@Test
	public void checkWhenIdHighest()
	{
		assertEquals(5, Vehicle.getHighestVehicleId());
	}

	@Test
	public void checkWhenInputIsValid()
	{
		Vehicle vehicle1 = new Vehicle("John Doe", 40, 200, false);
		assertTrue(vehicle1.checkIfValid(vehicle));
	}

	@Test
	public void checkWhenInputIsInvalid()
	{
		Vehicle vehicle1 = new Vehicle("John Doe", 40, 600, false);
		assertTrue(vehicle1.checkIfValid(vehicle));
	}
	
	@Test
	public void checkSpeedChange()
	{
		vehicle[0].changeSpeed(100);
		assertEquals(100,vehicle[0].getSpeed(),0.2);
	}

	@Test
	public void checkTurn()
	{
		vehicle[0].turn("LEFT",30);
		assertEquals(30,vehicle[0].getLeft(),0.1);
		assertEquals(330,vehicle[0].getRight(),0.1);
	}		
}