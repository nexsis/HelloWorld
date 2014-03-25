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
	      System.out.print(d);
	      assertTrue(S.pricePerMonth() == 100.0) ;
	   }

	   @Test
	   public void test_roundUp() {
	      System.out.println("Test if pricePerMonth rounds up correctly...") ;
	      Subscription S = new Subscription(200,3) ;
	      double d = S.pricePerMonth();
	      System.out.print(d);
	      assertTrue(S.pricePerMonth() < 66.67) ;
	   }
}
