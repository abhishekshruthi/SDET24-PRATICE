package Pratice_Well;

import org.testng.annotations.Test;

public class ReaddatafromCMD {
	
	@Test
	
	public void readdatafromCMD() {
		String URL = System.getProperty("url");
		System.out.println(URL);
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}

}
