package main;

public class Triangle
{
	private double side1;
	private double side2;
	private double side3;
	public Triangle(){
	}

	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public boolean isRightAngled()
	{
		double sideSquared1 = side1*side1;
		double sideSquared2 = side2*side2;
		double sideSquared3 = side3*side3;
		
		if(sideSquared1 == sideSquared2 + sideSquared3)
			return true;
		else if(sideSquared2 == sideSquared1 + sideSquared3)
			return true;
		else if(sideSquared3 == sideSquared1 + sideSquared2)
			return true;
		return false;
	}

	public boolean isScalene()
	{
		if((side1+side2+side3)/3 != side1)
			return true;	
		else
			return false;
	}

	public boolean isIsosceles()
	{
		if((side1==side2 && side1!=side3) || (side2==side3 && side2!=side1) || (side1==side3 && side3!=side2))
			return true;
		else
			return false;
	}

	public boolean isEquilateral()
	{
		if((side1+side2+side3)/3 == side1)
			return true;	
		else
			return false;
	}
	
		
}