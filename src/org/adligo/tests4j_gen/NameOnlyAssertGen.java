package org.adligo.tests4j_gen;

import java.io.PrintStream;
import java.util.Set;

import org.adligo.tests4j.shared.asserts.dependency.I_ClassAttributes;
import org.adligo.tests4j.shared.asserts.dependency.I_FieldSignature;
import org.adligo.tests4j.shared.asserts.dependency.I_MethodSignature;
import org.adligo.tests4j.shared.asserts.dependency.MethodSignature;
import org.adligo.tests4j.shared.common.Tests4J_System;

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
		out.println("\t\tassertContains(names,\"" + clazz.getName() + "\");");
		
	}
	
}
