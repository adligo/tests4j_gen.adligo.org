package org.adligo.tests4j_gen;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.adligo.tests4j.shared.asserts.dependency.I_ClassAttributes;
import org.adligo.tests4j.shared.asserts.dependency.I_FieldSignature;
import org.adligo.tests4j.shared.asserts.dependency.I_MethodSignature;
import org.adligo.tests4j.shared.common.StringMethods;
import org.adligo.tests4j.shared.common.Tests4J_System;

/**
 * this class generates a sibling
 * class for each class or interface
 * with _MockUse in the name.
 * 
 * @author scott
 *
 */
public class ClassUseGen {

	public void gen(ClassAndAttributes caa, PrintStream out, GenDepGroupContext ctx) {
		String packageName = ctx.getTrialPackageName();
		out.println("package " + packageName + ";");
		out.println("");
		String api = ctx.getApiVersion();
		if (!StringMethods.isEmpty(api)) {
			api = "_" + api;
		}
		Class<?> clazz = caa.getClazz();
		String pkgName = clazz.getPackage().getName();
		if (!packageName.equals(pkgName)) {
			out.println("import " + clazz.getName() + ";");
		}
		out.println("");
		out.println("/** autogenerated by " + this.getClass().getName() + "*/");
		out.println("public class " + clazz.getSimpleName() + api + "_MockUse {");
		out.println("");
		if (clazz.isInterface()) {
			out.println("\tpublic " + clazz.getSimpleName() + api +"_MockUse(" +clazz.getSimpleName() + " p) {");
			
			I_ClassAttributes ca = caa.getAttributes();
			Set<I_MethodSignature> ms = ca.getMethods();
			for (I_MethodSignature method: ms) {
				String nextLine = "\t\tp." + method.getMethodName() + "(" +
						getMethodParamsDefaults(method) + ");";
				out.println(nextLine);
				
			}
			
			out.println("\t}");
		} else {
			out.println("\tpublic " + clazz.getSimpleName() + " obj = null;");
			
			I_ClassAttributes ca = caa.getAttributes();
			Set<I_FieldSignature> fs = ca.getFields();
			int counter=0;
			for (I_FieldSignature field: fs) {
				out.println("\tpublic " + field.getClassName() + " obj" + counter++ + " = " + 
						clazz.getSimpleName()+ "." + field.getName() +";");
				
			}
			out.println("\tpublic " + clazz.getSimpleName() + api +"_MockUse() {");
			
			Set<I_MethodSignature> ms = ca.getMethods();
			for (I_MethodSignature method: ms) {
				if ("<init>".equals(method.getMethodName())) {
					String nextLine = "\t\tobj = new " + clazz.getSimpleName() + "(";
					if (method.getParameters() >= 1) {
						nextLine = nextLine + Tests4J_System.lineSeperator() + "\t\t\t" +
								getMethodParamsDefaults(method);
					}
					nextLine = nextLine + ");";
					out.println(nextLine);
				}
				
			}
			
			ClassAndAttributes parent = caa.getParent();
			List<ClassAndAttributes> parents = new ArrayList<ClassAndAttributes>();
			while (parent != null) {
				parents.add(parent);
				parent = parent.getParent();
			}
			parents.add(caa);
			
			for (int i = parents.size() - 1; i >= 0; i--) {
				ClassAndAttributes one = parents.get(i);
				I_ClassAttributes cAttribs = one.getAttributes();
				Class<?> tC = one.getClazz();
				if (hasNonConstructorMethod(cAttribs)) {
					out.println("\t\tcall" + tC.getSimpleName() +"Methods();");
				}
			}
			
			out.println("\t}");
			out.println("");
			
			
			for (int i = parents.size() - 1; i >= 0; i--) {
				ClassAndAttributes one = parents.get(i);
				Class<?> tc = one.getClazz();
				I_ClassAttributes cAttribs = one.getAttributes();
				if (hasNonConstructorMethod(cAttribs)) {
					out.println("\tpublic void call" + tc.getSimpleName() + "Methods() {");
					Set<I_MethodSignature> methods = cAttribs.getMethods();
					for (I_MethodSignature method: methods) {
						if ( !"<init>".equals(method.getMethodName())) {
							String nextLine = "\t\tobj." + method.getMethodName() + "(" +
									getMethodParamsDefaults(method) + ");";
							out.println(nextLine);
						}
					}
					out.println("\t}");
				}
			}
		}
		out.println("}");
	}
	
	private String getMethodParamsDefaults(I_MethodSignature ms) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < ms.getParameters(); i++) {
			String param = ms.getParameterClassName(i);
			if (i >= 1) {
				sb.append(", ");
			}
			sb.append(DefaultUseGenTypes.TYPES.get(param));
		}
		return sb.toString();
	}
	
	private boolean hasNonConstructorMethod(I_ClassAttributes ca) {
		Set<I_MethodSignature> methods = ca.getMethods();
		for (I_MethodSignature method: methods) {
			if ( !"<init>".equals(method.getMethodName())) {
				return true;
			}
		}
		return false;
	}
}
