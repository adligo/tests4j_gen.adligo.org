package org.adligo.tests4j_gen.class_lists;

import org.xml.sax.ext.Attributes2;
import org.xml.sax.ext.Attributes2Impl;
import org.xml.sax.ext.DeclHandler;
import org.xml.sax.ext.DefaultHandler2;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.ext.Locator2;
import org.xml.sax.ext.Locator2Impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
public class LatestXmlSaxExtClasses extends BaseClassNameList {
 
  public static void addNames(List<String> names, boolean includeDepricated) {
    List<Class<?>> classes = getClasses(includeDepricated);
    addNames(names, classes);
  }
  
  public static final List<Class<?>> getClasses( boolean includeDepricated) {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    
    toRet.add( Attributes2.class);
    toRet.add( DeclHandler.class);
    
    toRet.add( LexicalHandler.class);
    toRet.add( Locator2.class);
    
    toRet.add( Attributes2Impl.class);
    toRet.add( DefaultHandler2.class);
    toRet.add( Locator2Impl.class);
    return Collections.unmodifiableList(toRet);
  }
}
