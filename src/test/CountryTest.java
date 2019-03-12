package test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import main.Country;


public class CountryTest
{
	Country country[];
	@Before
	public void setUp()
	{
		country = new Country[4];
		country[0] = new Country("India", 2500000, 150000);
		country[1] = new Country("Australia", 1500000, 170000);
		country[2] = new Country("USA", 2000000, 200000);
		country[3] = new Country("UK", 1000000, 80000);
	
	}
	
	@Test
	public void checkCountryWithLargestArea()
	{
		Country countryWithLargestArea = new Country();
		countryWithLargestArea = countryWithLargestArea.findCountryWithLargestArea(country);
		String largestCountry = countryWithLargestArea.getCountryName();
		assertEquals("USA", largestCountry);
	}

	@Test
	public void checkCountryWithLargestPopulation()
	{
		Country countryWithLargestPopulation = new Country();
		countryWithLargestPopulation = countryWithLargestPopulation.findCountryWithLargestPopulation(country);
		String populatedCountry = countryWithLargestPopulation.getCountryName();
		assertEquals("India", populatedCountry);
	}

	@Test
	public void checkCountryWithLargestPopulationDensity()
	{
		Country countryWithLargestPopulationDensity = new Country();
		countryWithLargestPopulationDensity = countryWithLargestPopulationDensity.findCountryWithLargestPopulationDensity(country);
		String denselyPopulatedCountry = countryWithLargestPopulationDensity.getCountryName();
		assertEquals("India", denselyPopulatedCountry);
	}
}