package org.adligo.tests4j_gen.console;


public class GenDepGroupContext {
	private String trialPackageName_;
	private Class<?> groupFactoryClass_;
	private String apiVersion_ = "";
	private ConstantLookup constantLookup = new ConstantLookup();
	private String trialClass_ = "org.adligo.tests4j.models.shared.trials.SourceFileTrial";
	private String trialClassSimple_ = "SourceFileTrial";
	private String packageConstantsLookupName_ = "PackageConstantsLookupName";
	private String constantsLookupInterfaceName = "ConstantsLookupInterfaceName";
	private String extraTrialContent_ = "";
	private String extraTrialAnnotations_ = "";

	private boolean runConstantClassAttributeMethodGen_ = true;
	private boolean runConstantNameOnlyGen_ = true;
	private boolean runConstantNameOnlyAssertGen_ = true;
	private boolean runConstantNameOnlyLookupGen_ = true;
	private boolean runConstantNameOnlyLookupAssertGen_ = true;
	private boolean runDelegateInGroupAssertGen_ = true;
	
	private boolean runConstantTrialGen_ = true;
	private boolean runUseMockGen_ = true;
	private boolean runUseTrialGen_ = true;
	private boolean runNameOnlyGen_ = true;
	private boolean runNameOnlyAssertGen_ = true;
	
	public String getTrialPackageName() {
		return trialPackageName_;
	}
	public Class<?> getGroupFactoryClass() {
		return groupFactoryClass_;
	}
	public void setTrialPackageName(String trialPackageName) {
		trialPackageName_ = trialPackageName;
	}
	public void setGroupFactoryClass(Class<?> groupFactoryClass) {
		groupFactoryClass_ = groupFactoryClass;
	}
	public String getApiVersion() {
		return apiVersion_;
	}
	public void setApiVersion(String apiVersion) {
		if (apiVersion != null) {
			apiVersion_ = apiVersion;
		}
	}
	public ConstantLookup getConstantLookup() {
		return constantLookup;
	}
	public void setConstantLookup(ConstantLookup constantLookup) {
		this.constantLookup = constantLookup;
	}
	public String getTrialClass() {
		return trialClass_;
	}
	public String getTrialClassSimpleName() {
		return trialClassSimple_;
	}
	public void setTrialClass(String trialClass) {
		trialClass_ = trialClass;
	}
	public void setTrialClassSimpleName(String trialClassSimple) {
		trialClassSimple_ = trialClassSimple;
	}
	public String getExtraTrialContent() {
		return extraTrialContent_;
	}
	public void setExtraTrialContent(String extraTrialContent) {
		extraTrialContent_ = extraTrialContent;
	}
	public String getExtraTrialAnnotations() {
		return extraTrialAnnotations_;
	}
	public void setExtraTrialAnnotations(String extraTrialAnnotations) {
		extraTrialAnnotations_ = extraTrialAnnotations;
	}
	
	public boolean isRunConstantClassAttributeMethodGen() {
		return runConstantClassAttributeMethodGen_;
	}
	public void setRunConstantClassAttributeMethodGen(boolean runConstantGen) {
		runConstantClassAttributeMethodGen_ = runConstantGen;
	}
	public boolean isRunConstantTrialGen() {
		return runConstantTrialGen_;
	}
	public void setRunConstantTrialGen(boolean runConstantTrialGen) {
		runConstantTrialGen_ = runConstantTrialGen;
	}
	public boolean isRunUseMockGen() {
		return runUseMockGen_;
	}
	public void setRunUseMockGen(boolean runUseMockGen) {
		runUseMockGen_ = runUseMockGen;
	}
	public boolean isRunUseTrialGen() {
		return runUseTrialGen_;
	}
	public void setRunUseTrialGen(boolean runUseTrialGen) {
		runUseTrialGen_ = runUseTrialGen;
	}
	public boolean isRunNameOnlyGen() {
		return runNameOnlyGen_;
	}
	public void setRunNameOnlyGen(boolean runNameOnlyGen) {
		this.runNameOnlyGen_ = runNameOnlyGen;
	}
	public boolean isRunNameOnlyAssertGen() {
		return runNameOnlyAssertGen_;
	}
	public void setRunNameOnlyAssertGen(boolean runNameOnlyAssertGen) {
		this.runNameOnlyAssertGen_ = runNameOnlyAssertGen;
	}
	public String getPackageConstantsLookupName() {
		return packageConstantsLookupName_;
	}
	public void setPackageConstantsLookupName(String packageConstantsLookupName) {
		this.packageConstantsLookupName_ = packageConstantsLookupName;
	}
  public boolean isRunConstantNameOnlyGen() {
    return runConstantNameOnlyGen_;
  }
  public void setRunConstantNameOnlyGen(boolean runConstantNameOnlyGen) {
    this.runConstantNameOnlyGen_ = runConstantNameOnlyGen;
  }
  public boolean isRunConstantNameOnlyLookupGen() {
    return runConstantNameOnlyLookupGen_;
  }
  public void setRunConstantNameOnlyLookupGen(boolean runConstantNameOnlyLookupGen) {
    this.runConstantNameOnlyLookupGen_ = runConstantNameOnlyLookupGen;
  }
  public String getConstantsLookupInterfaceName() {
    return constantsLookupInterfaceName;
  }
  public void setConstantsLookupInterfaceName(String constantsLookupInterfaceName) {
    this.constantsLookupInterfaceName = constantsLookupInterfaceName;
  }
  public boolean isRunConstantNameOnlyAssertGen() {
    return runConstantNameOnlyAssertGen_;
  }
  public void setRunConstantNameOnlyAssertGen(boolean runConstantNameOnlyAssertGen) {
    this.runConstantNameOnlyAssertGen_ = runConstantNameOnlyAssertGen;
  }
  public boolean isRunConstantNameOnlyLookupAssertGen() {
    return runConstantNameOnlyLookupAssertGen_;
  }
  public void setRunConstantNameOnlyLookupAssertGen(boolean runConstantNameOnlyLookupAssertGen) {
    this.runConstantNameOnlyLookupAssertGen_ = runConstantNameOnlyLookupAssertGen;
  }
  public boolean isRunDelegateInGroupAssertGen() {
    return runDelegateInGroupAssertGen_;
  }
  public void setRunDelegateInGroupAssertGen(boolean runDelegateInGroupAssertGen) {
    this.runDelegateInGroupAssertGen_ = runDelegateInGroupAssertGen;
  }
}	
