package org.adligo.tests4j_gen.class_lists;

import java.lang.annotation.Annotation;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatestLangAnnotation extends BaseClassNameList{
  public static final List<Class<?>> CLASSES = getClasses();
  
  public static void addNames(List<String> names) {
    addNames(names, CLASSES);
  }
  
  public static final List<Class<?>> getClasses() {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    toRet.add( Annotation.class);
    
    toRet.add( ElementType.class);
    toRet.add( RetentionPolicy.class);
    
    toRet.add( AnnotationTypeMismatchException.class);
    toRet.add( IncompleteAnnotationException.class);
    
    toRet.add( AnnotationFormatError.class);
    
    toRet.add( Documented.class);
    toRet.add( Inherited.class);
    toRet.add( Retention.class);
    toRet.add( Target.class);
    
    return Collections.unmodifiableList(toRet);
  }
}
