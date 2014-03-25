package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest1 {

	private Collection<String> collection;

    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code   
    	System.out.println("@BeforeClass - oneTimeSetUp");
    }
 
	@Before
	public void setUp() throws Exception {
		
	     collection = new ArrayList<String>();
	     System.out.println("@Before - setUp");
	}

	@After
	public void tearDown() throws Exception {
		
        collection.clear();
        System.out.println("@After - tearDown");
	}

    @AfterClass
    public static void oneTimetearDown() {
        // one-time initialization code   
    	System.out.println("@AfterClass - oneTimeTearDown");
    }
  

    
	@Test
	public void test() {
		//fail("Not yet implemented");
        collection.add("itemA");
        assertEquals(1, collection.size());
        System.out.println("@Test - testOneItemCollection");
	}
	
    @Test
    public void testEmptyCollection() {
        assertTrue(collection.isEmpty());
        System.out.println("@Test - testEmptyCollection");
    }

}
