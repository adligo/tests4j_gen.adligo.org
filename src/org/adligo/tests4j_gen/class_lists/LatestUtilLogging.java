package org.adligo.tests4j_gen.class_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.ErrorManager;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.LoggingPermission;
import java.util.logging.MemoryHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.SocketHandler;
import java.util.logging.StreamHandler;
import java.util.logging.XMLFormatter;

public class LatestUtilLogging extends BaseClassNameList {
  public static final List<Class<?>> CLASSES = getClasses();
  
  public static void addNames(List<String> names) {
     addNames(names, CLASSES);
  }
  
  public static final List<Class<?>> getClasses() {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    toRet.add(Filter.class);
    
    toRet.add(ConsoleHandler.class);
    
    
    toRet.add(ErrorManager.class);
    
    toRet.add(FileHandler.class);
    toRet.add(Formatter.class);
    
    toRet.add(Handler.class);
  
    toRet.add(Level.class);
    toRet.add(Logger.class);
    toRet.add(LoggingPermission.class);
    toRet.add(LogManager.class);
    toRet.add(LogRecord.class);
    
    toRet.add(MemoryHandler.class);
    
    toRet.add(SimpleFormatter.class);
    toRet.add(SocketHandler.class);
    toRet.add(StreamHandler.class);
    
    toRet.add(XMLFormatter.class);
    
    return Collections.unmodifiableList(toRet);
  }
  
}
