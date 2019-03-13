package main;

public class Country
{
	private String countryName;
	private long population;
	private long area;	

	public Country(){
	}

	public Country(String countryName, long population, long area)
	{
		this.countryName = countryName;
		this.population = population;
		this.area = area;
	}

	public Country findCountryWithLargestArea(Country country[])
	{
		long maxArea = country[0].area;
		int index = 0;

		for(int i=1; i<country.length; i++)
		{
			if(country[i].area > maxArea)
			{
				maxArea = country[i].area;
				index = i;
			}
		}
		return country[index];
	}
	
	public Country findCountryWithLargestPopulation(Country country[])
	{
		long maxPopulation = country[0].population;
		int index = 0;

		for(int i=1; i<country.length; i++)
		{
			if(country[i].population > maxPopulation)
			{
				maxPopulation = country[i].population;
				index = i;
			}
		}
		return country[index];
	}

	public Country findCountryWithLargestPopulationDensity(Country country[])
	{
		double maxPopulationDensity = country[0].population/country[0].area;
		int index = 0;

		for(int i=1; i<country.length; i++)
		{
			double populationDensity = country[i].population/country[i].area;
			if(populationDensity > maxPopulationDensity)
			{
				maxPopulationDensity = populationDensity;
				index = i;
			}
		}
		return country[index];
	}


	public String getCountryName()
	{
		return countryName;
	}
}

	
