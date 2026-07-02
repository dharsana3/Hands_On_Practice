package com.dharsana.junit;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;
import exercise4.DeadlineService;

public class DeadlineServiceTest {
	
	private DeadlineService deadlineService;
	
	@Before
	public void setUp()
	{
		deadlineService = new DeadlineService();
	}
	
	@After
	public void teardown()
	{
		deadlineService = null;
	}
	
	@Test
	public void test_getStatus_overdue()
	{
		//Arrange
		int daysRemaining = -1;
		
		//Act
		String result = deadlineService.getStatus(daysRemaining);
		
		//Assert
		assertEquals("OVERDUE", result);
	}
	
	@Test
	public void test_getStatus_dueToday()
	{
		//Arrange
		int daysRemaining = 0;
		
		//Act
		String result = deadlineService.getStatus(daysRemaining);
		
		//Assert
		assertEquals("DUE_TODAY", result);
	}
}