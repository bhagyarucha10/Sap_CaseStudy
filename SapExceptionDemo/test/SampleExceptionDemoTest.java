	import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import com.exception.SampleExceptionDemo;

import org.junit.jupiter.api.*;

	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertTrue;
	import static org.junit.Assert.fail;

	import java.sql.*;

	@TestMethodOrder(OrderAnnotation.class)
	public class SampleExceptionDemoTest {

		SampleExceptionDemo demo = null;
		
		
		@BeforeEach
		void setUp() throws Exception {
		
			demo=new SampleExceptionDemo();
			
			
		}

		@AfterEach
		void tearDown() throws Exception {
			demo = null;
		}
		
		
		
		@Test
		@Order(1)
		void testDivMeth()  {
			int i=demo.divMeth(2);
			assertEquals("divMeth failed to divide for a positive number..check logic",21,i);
		}
			
		@Test
		@Order(2)
		void testDivMethforArithmeticException()  {
			Assertions.assertThrows(ArithmeticException.class, () -> {
			    demo.divMeth(0);
			  });
			}
		
		@Test
		@Order(3)
		void testarrayAccessMeth()  {
			int a[]= {4,5,6,7};
			int i=demo.arrayAccessMeth(a, 2);
			assertEquals("arrayAccessMeth failed to access array elemnt for given position..check logic",6,i);
		}
		
		@Test
		@Order(4)
		void testarrayAccessMethforArrayIndexOutOfBoundeException()  {
			int a[]= {4,5,6,7};
			Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
				demo.arrayAccessMeth(a, 12);
			  });
		}
		}	


