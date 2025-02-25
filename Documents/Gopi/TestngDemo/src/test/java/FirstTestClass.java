import org.testng.annotations.Test;

public class FirstTestClass {

//	open app 
//	login 
//	logout
	
	@Test
	void openapp() {
		System.out.println("opening application");
	}
	
	@Test(priority=0)
	void login()
	{
		System.out.println("Login to application.....");
	}
	
	@Test(priority=-1)
	void logout()
	{
		System.out.println("Logout from application.....");
	}
	
}
