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
	private ConstantClassAttributeMethodGen constantClassAttributeMethodGen_ = new ConstantClassAttributeMethodGen();
	
	private ConstantTrialGen constantTrialGen_ = new ConstantTrialGen();
	private ClassUseGen classUseGen_ = new ClassUseGen();
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
	    System.out.println("isRunConstantNameOnlyGen constantNameOnlyGen_ working " + constantNameOnlyGen_.getClass());
      for (Class<?> caa: classes) {
        constantNameOnlyGen_.gen(caa, System.out, ctx);
      }
    }
	  if (ctx.isRunConstantNameOnlyAssertGen()) {
	    System.out.println("isRunConstantNameOnlyAssertGen constantNameOnlyAssertGen_ working " + constantNameOnlyAssertGen_.getClass());
      for (Class<?> caa: classes) {
        constantNameOnlyAssertGen_.gen(caa, System.out, ctx);
      }
    }
	  
	  if (ctx.isRunConstantNameOnlyLookupGen()) {
	    System.out.println("isRunConstantNameOnlyLookupGen constantNameOnlyLookupGen_ " +
	        "working " + constantNameOnlyLookupGen_.getClass());
      for (Class<?> caa: classes) {
        constantNameOnlyLookupGen_.gen(caa, System.out, ctx);
      }
    }
	  
	  if (ctx.isRunDelegateInGroupAssertGen()) {
	    System.out.println("isRunDelegateInGroupAssertGen delegateInGroupAssertGen_ " +
	        "working " + 
	        delegateInGroupAssertGen_.getClass());
      for (Class<?> caa: classes) {
        delegateInGroupAssertGen_.gen(caa, System.out, ctx);
      }
    }
	  
	  if (ctx.isRunConstantNameOnlyLookupAssertGen()) {
	    System.out.println("isRunConstantNameOnlyLookupAssertGen constantNameOnlyLookupAssertGen_ working " + 
	        constantNameOnlyLookupAssertGen_.getClass());
      for (Class<?> caa: classes) {
        constantNameOnlyLookupAssertGen_.gen(caa, System.out, ctx);
      }
    }
	  System.out.println("constantClassAttributeMethodGen_ working " + constantClassAttributeMethodGen_.getClass());
    List<ClassAndAttributes> caAttribs = new ArrayList<ClassAndAttributes>();
		for (Class<?> c: classes) {
			ClassAndAttributes caa = new ClassAndAttributes(c);
			caAttribs.add(caa);
			if (ctx.isRunConstantClassAttributeMethodGen()) {
				constantClassAttributeMethodGen_.gen(caa, System.out, ctx);
			}
			
		}
		
		if (ctx.isRunConstantTrialGen()) {
		  System.out.println("isRunConstantTrialGen constantTrialGen_ working " + constantTrialGen_.getClass());
      for (ClassAndAttributes caa: caAttribs) {
				constantTrialGen_.gen(caa, System.out, ctx);
			}
		}
		if (ctx.isRunUseMockGen()) {
		  System.out.println("isRunUseMockGen classUseGen_ working " + classUseGen_.getClass());
      for (ClassAndAttributes caa: caAttribs) {
				classUseGen_.gen(caa, System.out, ctx);
			}
		}
		if (ctx.isRunUseTrialGen()) {
		  System.out.println("isRunUseTrialGen classUseTrialGen working " + classUseTrialGen.getClass());
      for (ClassAndAttributes caa: caAttribs) {
				classUseTrialGen.gen(caa, System.out, ctx);
			}
		}
		
		if (ctx.isRunNameOnlyGen()) {
		  System.out.println("isRunNameOnlyGen nameOnlyGen working " + nameOnlyGen.getClass());
      for (Class<?> caa: classes) {
				nameOnlyGen.gen(caa, System.out, ctx);
			}
		}
		if (ctx.isRunNameOnlyAssertGen()) {
		  System.out.println("isRunNameOnlyAssertGen nameOnlyAssertGen working " + nameOnlyAssertGen.getClass());
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
