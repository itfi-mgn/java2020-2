package lesson14;

import java.sql.Driver;
import java.util.ServiceLoader;

public class ServiceLoaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Driver item : ServiceLoader.load(Driver.class)) {
			System.err.println("Driver: "+item);
		}
	}
}
