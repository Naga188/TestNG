import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void testApp(){ 
	System.out.println("Testing app");
	}
	
	@Test // testApp is our test case.
	public void testLogin(){ 
    System.out.println("Login Test");
	}

}
