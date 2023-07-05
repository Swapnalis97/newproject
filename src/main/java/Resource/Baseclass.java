package Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Baseclass {
	public WebDriver driver;
public void initilizeDriver() throws IOException {

	FileInputStream fs=new FileInputStream("C:\\Users\\dell\\Documents\\swapnali\\demo\\src\\main\\java\\data.properties");//data.properties path
   //create object properties to access data from data.properties
	Properties prop=new Properties();
	prop.load(fs);//take a control on file input stream
	String browsername=prop.getProperty("browser");
	if(browsername.equalsIgnoreCase("Chrome")) {
		 driver=new ChromeDriver();
	}
	else if (browsername.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	
		
	}
	
	System.out.println("selectanotherbrowser");
	
}
	
}
