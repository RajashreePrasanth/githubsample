import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testng {

	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@BeforeClass
	public void Beforeclass() {
		System.out.println("Beforeclass");
	}
	@Test
	public void Test() {
		System.out.println("Test");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}
}
