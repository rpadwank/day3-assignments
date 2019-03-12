package main;

public class Date
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString()
	{
		boolean validity = checkIfDateIsValid();
		if(validity == true)
		{
			String dayString = Integer.toString(day);
			String monthString = Integer.toString(month);
			String yearString = Integer.toString(year);
			if(day<10)
				dayString = "0"+day;
			if(month<10)
				monthString = "0"+month;
			String dateString = dayString + "-" +monthString +"-"+yearString;
			return dateString;
		}
		else
			return "invalid date";
	}

	public boolean isSmaller(Date d)
	{
		boolean b = false;
		if(year < d.year)
			b = true;
		else if(year == d.year)
		{
			if(month < d.month)
				b = true;
			else if(month == d.month)
			{
				if(day < d.day)
					b = true;
			}
		}
		return b;			
	}

	public int[] diff(Date d)
	{
		int result[] = new int[3];
		int year1 = year;
		int year2 = d.year;
		int month1 = month;
		int month2 = d.month;
		if(month1<=2)
		{
			year1=year1-1;
			month1=month1+13;
		}
		else
			month1++;

		if(month2<=2)
		{
			year2=year2-1;
			month2=month2+13;
		}
		else
			month2++;

		int daysPassed1 = (1461*year1)/4 + (153*month1)/5 + day;
		int daysPassed2 = (1461*year2)/4 + (153*month2)/5 + d.day;

		int daysDiff = Math.abs(daysPassed1 - daysPassed2);
		
		int monthDiff;
		int yearDiff;

		boolean smaller = isSmaller(d);

		if(smaller==true)
		{
			if(d.day>=day)
			{
				if(d.month>=month)
				{
					monthDiff=d.month-month;
					yearDiff=d.year-year;
				}
				else
				{
					monthDiff=(d.month+12)-month;
					yearDiff=(d.year-1)-year;
				}
			}
			else
			{
				if((d.month-1)>=month)
				{
					monthDiff=(d.month-1)-month;
					yearDiff=d.year-year;
				}
				else
				{
					monthDiff=((d.month-1)+12)-month;
					yearDiff=(d.year-1)-year;
				}
			}
			monthDiff = yearDiff*12 + monthDiff;
		}
		
		else
		{
			if(day>=d.day)
			{
				if(month>=d.month)
				{
					monthDiff=month-d.month;
					yearDiff=year-d.year;
				}
				else
				{
					monthDiff=(month+12)-d.month;
					yearDiff=(year-1)-d.year;
				}
			}
			else
			{
				if((month-1)>=d.month)
				{
					monthDiff=(month-1)-d.month;
					yearDiff=year-d.year;
				}
				else
				{
					monthDiff=((month-1)+12)-d.month;
					yearDiff=(year-1)-d.year;
				}
			}
			monthDiff = yearDiff*12 + monthDiff;
		}		
						
		
		result[0] = daysDiff;
		result[1] = monthDiff;
		result[2] = yearDiff;
		return result;
			
		
	}

	public boolean checkIfDateIsValid()
	{
		if(day>31 || day<1)
			return false;
		if(month>12 || month<1)
			return false;
		if(year<1)
			return false;
		if(month==4 || month==6 || month==9 || month==11)
		{
			if(day>30)
				return false;
		}
		else if(month==2)
		{
			if(day>29)
				return false;
			if(year%4==0)
			{
				if(!(year%400==0))
				{
					if(day>28)
						return false;
				}
			}
			else
			{
				if(day>28)
					return false;
			}
		}

		
		
		return true;
	}
}
		