import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SubscriptionTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	   public void test_returnEuro() {
	      System.out.println("Test if pricePerMonth returns Euro...") ;
	      Subscription S = new Subscription(200,2) ;
	      double d = S.pricePerMonth();
	      assertTrue(S.pricePerMonth() == 100.0) ;
	   }

	@Test
	   public void test_setRateLengthDefault() {
		      System.out.println("Test if rate length default are set correctly...") ;
		      Subscription S = new Subscription(200,2) ;
		      assertTrue(S.getLength() == 2) ;
		      
		      
		   }	
	@Test
	   public void test_setRateLength() {
		      System.out.println("Test if rate length manual are set correctly...") ;
		      Subscription S = new Subscription(200,2) ;
		      S.setLength(2);
		      assertTrue(S.getLength() == 2) ;		      
		      
		   }

	@Test
	   public void test_setRateLengthCancel() {
		      System.out.println("Test if rate length cancel are set correctly...") ;
		      Subscription S = new Subscription(200,2) ;
		      S.cancel();
		      assertTrue(S.getLength() == 0) ;		      
		      
		   }	
	
	   @Test
	   public void test_roundUp() {
	      System.out.println("Test if pricePerMonth rounds up correctly...") ;
	      Subscription S = new Subscription(200,3) ;
	      double d = S.pricePerMonth();
	      assertTrue(S.pricePerMonth() < 66.67) ;
	   }
}
