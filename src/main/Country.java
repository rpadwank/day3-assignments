package main;

public class Country
{
	private String countryName;
	private int population;
	private int area;	

	public Country(){
	}

	public Country(String countryName, int population, int area)
	{
		this.countryName = countryName;
		this.population = population;
		this.area = area;
	}

	public Country findCountryWithLargestArea(Country country[])
	{
		int maxArea = country[0].area;
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
		int maxPopulation = country[0].population;
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

	
