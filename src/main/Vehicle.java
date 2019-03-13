package main;

public class Vehicle
{
	private double currentSpeed;
	private double currentDirection;
	private String ownerName;
	private int vehicleId;
	private static int highestVehicleId=0;
	private double turnRight = 0;
	private double turnLeft = 0;
	public Vehicle(){
	}

	public Vehicle(String ownerName, double currentSpeed, double currentDirection, boolean increment)
	{
		if(increment==true)
			highestVehicleId++;
		this.vehicleId = highestVehicleId;
		this.ownerName = ownerName;
		this.currentSpeed = currentSpeed;
		this.currentDirection = currentDirection;
	}
	
	public boolean checkIfValid(Vehicle vehicle[])
	{
		for(int i=0; i<vehicle.length; i++)
		{
			if(vehicle[i].currentSpeed<0 || vehicle[i].currentSpeed>180)
				return false;
			if(vehicle[i].currentDirection<0 || vehicle[i].currentDirection>=360)
				return false;
			
		}
		return true;
	}
			
	public boolean checkIfValid(Vehicle vehicle)
	{
		if(vehicle.currentSpeed<0 || vehicle.currentSpeed>180)
			return false;
		if(vehicle.currentDirection<0 || vehicle.currentDirection>=360)
			return false;
		return true;
	}
	public void changeSpeed(double currentSpeed)
	{
		this.currentSpeed = currentSpeed;
	}

	public void stopVehicle()
	{
		this.currentSpeed = 0;
	}
	
	public double getSpeed()
	{
		return currentSpeed;	
	}

	public static int getHighestVehicleId()
	{
		return highestVehicleId;	
	}

	public double getVehicleId()
	{
		return vehicleId;	
	}
	
	public void setDirection(double currentDirection)
	{
		this.currentDirection = currentDirection;
	}

	public double getDirection()
	{
		return currentDirection;	
	}
		
	public void turn(String dir, double degree)
	{
		if(dir == "LEFT")
		{
			turnLeft = (turnLeft+degree)%360;
			if(turnRight-degree<0)
				turnRight = 360-Math.abs(turnRight-degree);
			else
				turnRight = turnRight-degree;
		}
		else
		{
			turnRight = (turnRight+degree)%360;
			if(turnLeft-degree<0)
				turnLeft = 360-Math.abs(turnLeft-degree);
			else
				turnLeft = turnLeft-degree;
		}
	}
	public double getLeft()
	{
		return turnLeft;
	}
	public double getRight()
	{
		return turnRight;
	}
				

}


