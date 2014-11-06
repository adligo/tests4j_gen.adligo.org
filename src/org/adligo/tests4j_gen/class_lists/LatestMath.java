package org.adligo.tests4j_gen.class_lists;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatestMath extends BaseClassNameList {
  public static final List<Class<?>> CLASSES = getClasses();
  
  public static void addNames(List<String> names) {
    addNames(names, CLASSES);
  }
  
  public static final List<Class<?>> getClasses() {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    
    toRet.add(BigDecimal.class);
    toRet.add(BigInteger.class);
    toRet.add(MathContext.class);
    toRet.add(RoundingMode.class);
    return Collections.unmodifiableList(toRet);
  }
}
