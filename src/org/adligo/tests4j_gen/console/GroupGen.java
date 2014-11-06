package org.adligo.tests4j_gen.console;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * this class will eventually generage
 * dependency code (dependency_group, 
 *    List<Class<with dependency_usage>>, dependecy_group_trial)
 *  So that a two point verification system can be 
 *  used for dependency groups, and so they can be
 *  auto generated (otherwise no one would probably ever use them).
 *  
 * @author scott
 *
 */
public class GroupGen {
	private GenDepGroupContext ctx;
	private ConstantClassAttributeMethodGen constantClassAttributeMethodGen = new ConstantClassAttributeMethodGen();
	
	private ConstantTrialGen constantTrialGen = new ConstantTrialGen();
	private ClassUseGen classUseGen = new ClassUseGen();
	private ClassUseTrialGen classUseTrialGen = new ClassUseTrialGen();
	private ConstantNameOnlyGen constantNameOnlyGen_ = new ConstantNameOnlyGen();
	private ConstantNameOnlyAssertGen constantNameOnlyAssertGen_ = new ConstantNameOnlyAssertGen();
  
	private ConstantNameOnlyLookupGen constantNameOnlyLookupGen_ = new ConstantNameOnlyLookupGen();
  private DelegateInGroupAssertGen delegateInGroupAssertGen_ = new DelegateInGroupAssertGen();
	private ConstantNameOnlyLookupAssertGen constantNameOnlyLookupAssertGen_ = new ConstantNameOnlyLookupAssertGen();
  
	private NameOnlyGen nameOnlyGen = new NameOnlyGen();
	private NameOnlyAssertGen nameOnlyAssertGen = new NameOnlyAssertGen();
	
	/**
	 * note this doesn't take a PackageDiscovery
	 * @param classes
	 */
	public void gen(Collection<Class<?>> classes) {
	  
	  if (ctx.isRunConstantNameOnlyGen()) {
	    System.out.println("4 interface ie I_JSE_1_6_Lang");
      for (Class<?> caa: classes) {
        constantNameOnlyGen_.gen(caa, System.out, ctx);
      }
    }
	  if (ctx.isRunConstantNameOnlyAssertGen()) {
	    System.out.println("4 trial of interface ie I_JSE_1_6_LangTrial");
      for (Class<?> caa: classes) {
        constantNameOnlyAssertGen_.gen(caa, System.out, ctx);
      }
    }
	  
	  if (ctx.isRunConstantNameOnlyLookupGen()) {
	    System.out.println("4 constant class ie JSE_1_6_Lang");
      for (Class<?> caa: classes) {
        constantNameOnlyLookupGen_.gen(caa, System.out, ctx);
      }
    }
	  
	  if (ctx.isRunDelegateInGroupAssertGen()) {
	    System.out.println("4 constant class ie JSE_1_6_LangTrial");
      for (Class<?> caa: classes) {
        delegateInGroupAssertGen_.gen(caa, System.out, ctx);
      }
    }
	  
	  if (ctx.isRunConstantNameOnlyLookupAssertGen()) {
	    System.out.println("4 constant class ie JSE_1_6_LangTrial");
      for (Class<?> caa: classes) {
        constantNameOnlyLookupAssertGen_.gen(caa, System.out, ctx);
      }
    }
		List<ClassAndAttributes> caAttribs = new ArrayList<ClassAndAttributes>();
		for (Class<?> c: classes) {
			ClassAndAttributes caa = new ClassAndAttributes(c);
			caAttribs.add(caa);
			if (ctx.isRunConstantClassAttributeMethodGen()) {
				constantClassAttributeMethodGen.gen(caa, System.out, ctx);
			}
			
		}
		
		if (ctx.isRunConstantTrialGen()) {
			for (ClassAndAttributes caa: caAttribs) {
				constantTrialGen.gen(caa, System.out, ctx);
			}
		}
		if (ctx.isRunUseMockGen()) {
			for (ClassAndAttributes caa: caAttribs) {
				classUseGen.gen(caa, System.out, ctx);
			}
		}
		if (ctx.isRunUseTrialGen()) {
			for (ClassAndAttributes caa: caAttribs) {
				classUseTrialGen.gen(caa, System.out, ctx);
			}
		}
		
		if (ctx.isRunNameOnlyGen()) {
			for (Class<?> caa: classes) {
				nameOnlyGen.gen(caa, System.out, ctx);
			}
		}
		if (ctx.isRunNameOnlyAssertGen()) {
			for (Class<?> caa: classes) {
				nameOnlyAssertGen.gen(caa, System.out, ctx);
			}
		}
	}

	public GenDepGroupContext getCtx() {
		return ctx;
	}

	public void setCtx(GenDepGroupContext ctx) {
		this.ctx = ctx;
	}
	

}
