package com.dharsana.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

import mockito.exercise.Service;
import mockito.exercise.externalAPI;


public class ServiceTest {
	private externalAPI api = mock(externalAPI.class);
	
	private Service service = new Service(api);
	@Test
	public void testModerateTemperature()
	{
		when(api.getTemperature()).thenReturn(35);
		
		//Act
		String result = service.getStatus();
		
		//Assert
		assertEquals("Moderate", result);
	}
	
	@Test
	public void testVerifying()
	{	
		verify(api).getTemperature();
	}
}