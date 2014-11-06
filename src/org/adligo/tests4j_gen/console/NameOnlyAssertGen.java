package org.adligo.tests4j_gen.console;

import java.io.PrintStream;

/**
 * this class generates a sibling
 * class for each class or interface
 * with _MockUse in the name.
 * 
 * @author scott
 *
 */
public class NameOnlyAssertGen {
	private ConstantLookup constantLookup;
	/**
	 * this currently only prints
	 * out the method 
	 * @param caa
	 * @param out
	 * @param ctx
	 */
	public void gen(Class<?> clazz, PrintStream out, GenDepGroupContext ctx) {
		constantLookup = ctx.getConstantLookup();
		out.println("    assertContains(names,\"" + clazz.getName() + "\");");
		
	}
	
}
