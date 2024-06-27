package util;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("src/test/resources/Properties/data.properties");
		
		Properties p=new Properties();
		
		p.load(fr);
		
		System.out.println(p.getProperty("departloc"));//prints the value of that key
		System.out.println(p.getProperty("arrivalloc"));
		System.out.println(p.getProperty("review"));
	}

}