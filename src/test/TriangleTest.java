package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.Triangle;


public class TriangleTest
{
	@Test
	public void checkIfTriangleIsRightAngled()
	{
		Triangle triangle = new Triangle(3,4,5);
		assertTrue(triangle.isRightAngled());
	}

	
	@Test
	public void checkIfTriangleIsScalene()
	{
		Triangle triangle = new Triangle(7,4,11);
		assertTrue(triangle.isScalene());
	}

	@Test
	public void checkIfTriangleIsIsosceles()
	{
		Triangle triangle = new Triangle(7,7,11);
		assertTrue(triangle.isIsosceles());
	}

	@Test
	public void checkIfTriangleIsEquilateral()
	{
		Triangle triangle = new Triangle(7,7,7);
		assertTrue(triangle.isEquilateral());
	}
}	