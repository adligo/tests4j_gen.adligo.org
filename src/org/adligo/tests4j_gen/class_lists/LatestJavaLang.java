package org.adligo.tests4j_gen.class_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatestJavaLang extends BaseClassNameList {
  public static final List<Class<?>> CLASSES = getClasses();
  
  public static void addNames(List<String> names) {
    addNames(names, CLASSES);
  }
  
  public static final List<Class<?>> getClasses() {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    
    toRet.add( Appendable.class);
    toRet.add( AutoCloseable.class);
    
    toRet.add( CharSequence.class);
    toRet.add( Cloneable.class);
    toRet.add( Comparable.class);
    
    toRet.add( Iterable.class);
    
    toRet.add( Readable.class);
    toRet.add( Runnable.class);
    
    toRet.add( Thread.UncaughtExceptionHandler.class);
    //classes
    toRet.add( Boolean.class);
    toRet.add( Byte.class);
    
    toRet.add( Character.class);
    toRet.add( Character.Subset.class);
    toRet.add( Character.UnicodeBlock.class);
    toRet.add( Class.class);
    toRet.add( ClassLoader.class);
    toRet.add( ClassValue.class);
    toRet.add( Compiler.class);
    
    toRet.add( Double.class);
    
    toRet.add( Enum.class);
    
    toRet.add( Float.class);
    
    toRet.add( InheritableThreadLocal.class);
    toRet.add( Integer.class);
    
    toRet.add( Long.class);
    
    toRet.add( Math.class);
    
    toRet.add( Number.class);
    
    toRet.add( Object.class);
    
    toRet.add( Package.class);
    toRet.add( Process.class);
    toRet.add( ProcessBuilder.class);
    toRet.add( ProcessBuilder.Redirect.class);
    
    toRet.add( Runtime.class);
    toRet.add( RuntimePermission.class);
    
    toRet.add( SecurityManager.class);
    toRet.add( Short.class);
    toRet.add( StackTraceElement.class);
    toRet.add( StrictMath.class);
    toRet.add( String.class);
    toRet.add( StringBuffer.class);
    toRet.add( StringBuilder.class);
    toRet.add( System.class);
    
    toRet.add( Thread.class);
    toRet.add( ThreadGroup.class);
    toRet.add( ThreadLocal.class);
    toRet.add( Throwable.class);
    
    toRet.add( Void.class);
    
    //enums
    toRet.add( Character.UnicodeScript.class);
    toRet.add( ProcessBuilder.Redirect.Type.class);
    toRet.add( Thread.State.class);
    
    //exceptions
    toRet.add( ArithmeticException.class);
    toRet.add( ArrayIndexOutOfBoundsException.class);
    toRet.add( ArrayStoreException.class);
    
    toRet.add( ClassCastException.class);
    toRet.add( ClassNotFoundException.class);
    toRet.add( CloneNotSupportedException.class);
    
    toRet.add( EnumConstantNotPresentException.class);
    toRet.add( Exception.class);
    
    toRet.add( IllegalAccessException.class);
    toRet.add( IllegalArgumentException.class);
    toRet.add( IllegalMonitorStateException.class);
    toRet.add( IllegalStateException.class);
    toRet.add( IllegalThreadStateException.class);
    toRet.add( IndexOutOfBoundsException.class);
    toRet.add( InstantiationException.class);
    toRet.add( InterruptedException.class);
    
    toRet.add( NegativeArraySizeException.class);
    toRet.add( NoSuchFieldException.class);
    toRet.add( NoSuchMethodException.class);
    toRet.add( NullPointerException.class);
    toRet.add( NumberFormatException.class);
    
    toRet.add( ReflectiveOperationException.class);
    toRet.add( RuntimeException.class);
    
    toRet.add( SecurityException.class);
    toRet.add( StringIndexOutOfBoundsException.class);
    
    toRet.add( TypeNotPresentException.class);
    
    toRet.add( UnsupportedOperationException.class);
    
    //errors
    toRet.add( AbstractMethodError.class);
    toRet.add( AssertionError.class);
    
    toRet.add( BootstrapMethodError.class);
    
    toRet.add( ClassCircularityError.class);
    toRet.add( ClassFormatError.class);
    
    toRet.add( Error.class);
    toRet.add( ExceptionInInitializerError.class);
    
    toRet.add( IllegalAccessError.class);
    toRet.add( IncompatibleClassChangeError.class);
    toRet.add( InstantiationError.class);
    toRet.add( InternalError.class);
    
    toRet.add( LinkageError.class);
    
    toRet.add( NoClassDefFoundError.class);
    toRet.add( NoSuchFieldError.class);
    toRet.add( NoSuchMethodError.class);
    
    toRet.add( OutOfMemoryError.class);
    
    toRet.add( StackOverflowError.class);
    
    toRet.add( ThreadDeath.class);
    
    toRet.add( UnknownError.class);
    toRet.add( UnsatisfiedLinkError.class);
    toRet.add( UnsupportedClassVersionError.class);
    
    toRet.add( VerifyError.class);
    toRet.add( VirtualMachineError.class);
    return Collections.unmodifiableList(toRet);
  }
}
