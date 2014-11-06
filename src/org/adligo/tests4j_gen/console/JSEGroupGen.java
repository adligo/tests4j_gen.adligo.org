package org.adligo.tests4j_gen.console;

import org.adligo.tests4j.models.shared.reference_groups.jse.JSE_Lang;
import org.adligo.tests4j.models.shared.reference_groups.jse.JSE_Util;
import org.adligo.tests4j_gen.class_lists.LatestUtilConcurrent;


public class JSEGroupGen {

	public static void main(String[] args) {
		GroupGen gg = new GroupGen();
		GenDepGroupContext ctx = new GenDepGroupContext();
		ctx.setTrialPackageName("org.adligo.tests4j_v1_tests.models.dependency_groups.jse");
		ctx.setApiVersion("1_6");
		ctx.setRunConstantClassAttributeMethodGen(false);
		ctx.setRunUseTrialGen(false);
		ctx.setRunNameOnlyGen(true);
		ctx.setRunUseMockGen(false);
		ctx.setRunConstantTrialGen(false);
		//ctx.setExtraTrialAnnotations("@SuppressOutput");
		
		
		ConstantLookup cl = ctx.getConstantLookup();
		cl.addLookups(JSE_Lang.INSTANCE);
		cl.addLookups(JSE_Util.INSTANCE);
		gg.setCtx(ctx);
		//ctx.setRunConstantGen(false);
		//ctx.setRunConstantTrialGen(false);
		gg.gen(LatestUtilConcurrent.CLASSES);
		//gg.gen(getAnnot());
		//gg.gen(getMath());
		//gg.gen(getSQL());
		//gg.gen(getUtil());
		
		//gg.gen(getLog());
	}
	
}
