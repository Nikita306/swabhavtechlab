package com.techlab.test.factory.method;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;
import com.techlab.factory.method.BmwFactory;
import com.techlab.factory.method.IAutomobile;
import com.techlab.factory.method.IAutomobileFactory;

public class TestPropertiesFile {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		String filename = "config.properties";
		FileReader reader = new FileReader(filename);
		prop.load(reader);
		System.out.println(prop.getProperty("config.factory"));
		String str = prop.getProperty("config.factory");

		ClassLoader classLoader = TestPropertiesFile.class.getClassLoader();
		Class<BmwFactory> c = (Class<BmwFactory>) classLoader.loadClass(str);

		Method method = c.getDeclaredMethod("getInstance");
		IAutomobileFactory factory = (IAutomobileFactory) method.invoke(null,null);
		IAutomobile product = factory.make();
		product.start();
		product.stop();

	}

}
