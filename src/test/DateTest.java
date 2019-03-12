package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.Date;

public class DateTest
{
	
	@Test
	public void checkWhetherDateIsValid()
	{
		Date date1 = new Date(27,3,2012);
		assertEquals("27-03-2012", date1.toString());
	}
	
	@Test
	public void checkWhetherDateIsInvalid()
	{
		
		Date date = new Date(29,2,2100);
		assertEquals("invalid date", date.toString());
	}

	@Test
	public void checkWhetherInvokingDateObjectIsSmaller()
	{
		Date date = new Date(23,2,1999);
		Date date1 = new Date(27,3,2012);
		assertTrue(date.isSmaller(date1));
	}

	@Test
	public void checkWhetherInvokingDateObjectIsGreater()
	{
		Date date1 = new Date(23,2,1999);
		Date date = new Date(27,3,2012);
		assertFalse(date.isSmaller(date1));
	}
	
	@Test
	public void checkWhetherInvokingDateObjectIsEqual()
	{
		Date date1 = new Date(23,2,1999);
		Date date = new Date(23,2,1999);
		assertFalse(date.isSmaller(date1));
	}
	
	@Test
	public void checkDifferenceOfDays()
	{
		Date date1 = new Date(1,1,2000);
		Date date = new Date(23,12,1998);
		int expectedArray[] = {374,12,1};
		int actualArray[] = date.diff(date1);
		assertEquals(expectedArray[0], actualArray[0]);
		assertEquals(expectedArray[1], actualArray[1]);
		assertEquals(expectedArray[2], actualArray[2]);
	}
}