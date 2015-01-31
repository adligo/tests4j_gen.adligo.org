package org.adligo.tests4j_gen.class_lists;

import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("deprecation")
public class LatestXmlSaxClasses extends BaseClassNameList {
 
  public static void addNames(List<String> names, boolean includeDepricated) {
    List<Class<?>> classes = getClasses(includeDepricated);
    addNames(names, classes);
  }
  
  public static final List<Class<?>> getClasses( boolean includeDepricated) {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    
    if (includeDepricated) {
      toRet.add( AttributeList.class);
    }
    toRet.add( Attributes.class);
    toRet.add( ContentHandler.class);
    if (includeDepricated) {
      toRet.add( DocumentHandler.class);
    }
    toRet.add( DTDHandler.class);
    toRet.add( EntityResolver.class);
    
    toRet.add( ErrorHandler.class);
    
    toRet.add( Locator.class);
    toRet.add( Parser.class);
    
    toRet.add( XMLFilter.class);
    toRet.add( XMLReader.class);
    
    if (includeDepricated) {
      toRet.add( HandlerBase.class);
    }
    toRet.add( InputSource.class);
    
    toRet.add( SAXException.class);
    toRet.add( SAXNotRecognizedException.class);
    toRet.add( SAXNotSupportedException.class);
    toRet.add( SAXParseException.class);
    return Collections.unmodifiableList(toRet);
  }
}
