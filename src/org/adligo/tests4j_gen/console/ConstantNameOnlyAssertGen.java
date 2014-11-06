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
public class ConstantNameOnlyAssertGen {
	/**
	 * this currently only prints
	 * out the method 
	 * @param caa
	 * @param out
	 * @param ctx
	 */
	public void gen(Class<?> clazz, PrintStream out, GenDepGroupContext ctx) {
	  String interfaceName = ctx.getConstantsLookupInterfaceName();
	  
    out.println("  assertEquals(\"" + clazz.getName() + "\"," + 
        interfaceName + "." + ConsoleGenUtils.toConstantJavaText(clazz) + ");");
	}
	
}
