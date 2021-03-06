package com.example;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorServiceTest {

	CalculatorService service = null;

	@Before
	public void beforeTest() {
		service = new CalculatorService();
		System.out.println("Before Test!");
	}

	@After
	public void afterTest() {
		service = null;
		System.out.println("After Test Case!");
	}

	@Test
	public void testOneSum() {
		assertEquals(20, service.doSum(10, 10));
	}

	@Test
	public void testSum() {
		assertEquals(15, service.doSum(10, 5));
	}

	@Test
	public void testNegativeSum() {
		assertEquals(5, service.doSum(10, -5));
	}

	@Test
	public void testDiff() {
		assertEquals(5, service.doDiff(10, 5));
	}

	@Test
	public void testNegativeDiff() {
		assertEquals(15, service.doDiff(10, -5));
	}

	@Test
	public void testPositiveCheck()
	{
		assertEquals(15, service.doSum(10, 5));
	}
}