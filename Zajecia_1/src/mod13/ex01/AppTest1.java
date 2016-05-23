package mod13.ex01;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest1 {
	private Collection<String> collection; 
	
	/**
	 * Metody wykonane tylko raz. 
	 * Na pocz¹tku: @BeforeClass
	 * Na koñczu :  @AfterClass
	 */
	@BeforeClass
	public static void globalSetUp(){
		System.out.println("@BeforeClass Global setup ");
	}
	
	@AfterClass
	public static void globalTearDown(){
		System.out.println("@AfterClass Global teardown ");
	}
	/**
	 * Metoda wykonana przed ka¿dym testem.
	 * @Before
	 */
	@Before
	public void setUp(){
		collection = new ArrayList<>(); 
		System.out.println("@Before SetUp ");
		
	}
	/**
	 * Metoda wykonana po ka¿dym teœcie
	 * @After
	 */
	public void tearDown(){
		collection = null; 
		System.out.println("@After tear down ");
	}
	
	@Test
	public void testEmptyCollection(){
		Assert.assertTrue(collection.isEmpty()); 
		System.out.println("@Test Test nr 1 ");
	}
	@Test
	public void testOneItemcollection(){
		collection.add("PierwszyElement"); 
		Assert.assertEquals(1, collection.size()); 
		System.out.println("@Test Test nr 2 @Test");
	}
	
}
