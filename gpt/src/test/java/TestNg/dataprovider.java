package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	@Test(dataProvider = "getData")
	public void matrix(String Username, String Password, int number, String gmail) {
		
	}
	
    @DataProvider
    
	public Object[][] getData(){
		Object[][]data = new Object[3][4];
		data[0][0] = "Username";
		data[0][1] = "Password";
		data[0][2] = 62015309;
		data[0][3] = "username@gmail.com";
		
		data[1][0] = "Username1";
		data[1][1] = "Password1";
		data[1][2] = 62015309;
		data[1][3] = "username@gmail.com";
		
		data[2][0] = "Username2";
		data[2][1] = "Password2";
		data[2][2] = 62015309;
		data[2][3] = "username@gmail.com";
		return data;



	}

}
