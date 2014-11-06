package org.adligo.tests4j_gen.console;

import java.util.List;

import org.adligo.tests4j.run.discovery.PackageDiscovery;

public class FooGroupGen {

	public static void main(String [] args) {
		try {
			PackageDiscovery pd = new PackageDiscovery("java.lang");
			List<String> classNames = pd.getClassNames();
			doStrings("assertContains(names,\"", "\")", classNames);
			
		} catch (Exception x) {
			x.printStackTrace();
		}
	}
	
	public static void doStrings(String preText, String postText, List<String> classNames) {
		for (String className: classNames) {
			System.out.println(preText + className + postText);
		}
	}
}
