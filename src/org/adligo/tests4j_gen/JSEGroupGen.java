package org.adligo.tests4j_gen;

import java.util.ArrayList;
import java.util.List;

import org.adligo.tests4j.models.shared.dependency_groups.gwt.v2_6.GWT_2_6_Log;
import org.adligo.tests4j.models.shared.dependency_groups.jse.JSE_Lang;
import org.adligo.tests4j.models.shared.dependency_groups.jse.JSE_Util;


public class JSEGroupGen {

	public static void main(String[] args) {
		GroupGen gg = new GroupGen();
		GenDepGroupContext ctx = new GenDepGroupContext();
		ctx.setTrialPackageName("org.adligo.tests4j_v1_tests.models.dependency_groups.jse");
		ctx.setApiVersion("1_8");
		ctx.setRunConstantGen(false);
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
		gg.gen(getLang());
		//gg.gen(getAnnot());
		//gg.gen(getMath());
		//gg.gen(getSQL());
		//gg.gen(getUtil());
		
		//gg.gen(getLog());
	}
	
	public static List<Class<?>> getLang() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		//copy and paste/edit from the java doc on the web
		toRet.add(Appendable.class);
		toRet.add(AutoCloseable.class);
		toRet.add(CharSequence.class);
		toRet.add(Cloneable.class);
		toRet.add(Comparable.class);
		toRet.add(Iterable.class);
		toRet.add(Readable.class);
		toRet.add(Runnable.class);
		toRet.add(Thread.UncaughtExceptionHandler.class);

		toRet.add(Boolean.class);
		toRet.add(Byte.class);
		toRet.add(Character.class);
		toRet.add(Character.Subset.class);
		toRet.add(Character.UnicodeBlock.class);
		toRet.add(Class.class);
		toRet.add(ClassLoader.class);
		toRet.add(ClassValue.class);
		toRet.add(Compiler.class);
		toRet.add(Double.class);
		toRet.add(Enum.class);
		toRet.add(Float.class);
		toRet.add(InheritableThreadLocal.class);
		toRet.add(Integer.class);
		toRet.add(Long.class);
		toRet.add(Math.class);
		toRet.add(Number.class);
		toRet.add(Object.class);
		toRet.add(Package.class);
		toRet.add(Process.class);
		toRet.add(ProcessBuilder.class);
		toRet.add(ProcessBuilder.Redirect.class);
		toRet.add(Runtime.class);
		toRet.add(RuntimePermission.class);
		toRet.add(SecurityManager.class);
		toRet.add(Short.class);
		toRet.add(StackTraceElement.class);
		toRet.add(StrictMath.class);
		toRet.add(String.class);
		toRet.add(StringBuffer.class);
		toRet.add(StringBuilder.class);
		toRet.add(System.class);
		toRet.add(Thread.class);
		toRet.add(ThreadGroup.class);
		toRet.add(ThreadLocal.class);
		toRet.add(Throwable.class);
		toRet.add(Void.class);

		toRet.add(Character.UnicodeScript.class);
		toRet.add(ProcessBuilder.Redirect.Type.class);
		toRet.add(Thread.State.class);

		toRet.add(ArithmeticException.class);
		toRet.add(ArrayIndexOutOfBoundsException.class);
		toRet.add(ArrayStoreException.class);
		toRet.add(ClassCastException.class);
		toRet.add(ClassNotFoundException.class);
		toRet.add(CloneNotSupportedException.class);
		toRet.add(EnumConstantNotPresentException.class);
		toRet.add(Exception.class);
		toRet.add(IllegalAccessException.class);
		toRet.add(IllegalArgumentException.class);
		toRet.add(IllegalMonitorStateException.class);
		toRet.add(IllegalStateException.class);
		toRet.add(IllegalThreadStateException.class);
		toRet.add(IndexOutOfBoundsException.class);
		toRet.add(InstantiationException.class);
		toRet.add(InterruptedException.class);
		toRet.add(NegativeArraySizeException.class);
		toRet.add(NoSuchFieldException.class);
		toRet.add(NoSuchMethodException.class);
		toRet.add(NullPointerException.class);
		toRet.add(NumberFormatException.class);
		toRet.add(ReflectiveOperationException.class);
		toRet.add(RuntimeException.class);
		toRet.add(SecurityException.class);
		toRet.add(StringIndexOutOfBoundsException.class);
		toRet.add(TypeNotPresentException.class);
		toRet.add(UnsupportedOperationException.class);

		toRet.add(AbstractMethodError.class);
		toRet.add(AssertionError.class);
		toRet.add(BootstrapMethodError.class);
		toRet.add(ClassCircularityError.class);
		toRet.add(ClassFormatError.class);
		toRet.add(Error.class);
		toRet.add(ExceptionInInitializerError.class);
		toRet.add(IllegalAccessError.class);
		toRet.add(IncompatibleClassChangeError.class);
		toRet.add(InstantiationError.class);
		toRet.add(InternalError.class);
		toRet.add(LinkageError.class);
		toRet.add(NoClassDefFoundError.class);
		toRet.add(NoSuchFieldError.class);
		toRet.add(NoSuchMethodError.class);
		toRet.add(OutOfMemoryError.class);
		toRet.add(StackOverflowError.class);
		toRet.add(ThreadDeath.class);
		toRet.add(UnknownError.class);
		toRet.add(UnsatisfiedLinkError.class);
		toRet.add(UnsupportedClassVersionError.class);
		toRet.add(VerifyError.class);
		toRet.add(VirtualMachineError.class);

		toRet.add(Deprecated.class);
		toRet.add(FunctionalInterface.class);
		toRet.add(Override.class);
		toRet.add(SafeVarargs.class);
		toRet.add(SuppressWarnings.class);
		return toRet;
	}
	
	public static List<Class<?>> getAnnot() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		/*
		toRet.add(Annotation.class);
		toRet.add(Documented.class); 
		toRet.add(AnnotationFormatError.class);
		toRet.add(AnnotationTypeMismatchException.class);
		toRet.add(ElementType.class); 
		
		toRet.add(Inherited.class); 
		toRet.add(Retention.class); 
		toRet.add(RetentionPolicy.class); 
		toRet.add(Target.class); 
		*/
		return toRet;
	}
	
	public static List<Class<?>> getMath() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		/*
		toRet.add(BigDecimal.class);
		toRet.add(BigInteger.class);
		toRet.add(MathContext.class);
		toRet.add(RoundingMode.class);
		*/
		return toRet;
	}
	
	public static List<Class<?>> getIO() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		/*
		toRet.add(IOException.class);
		toRet.add(UnsupportedEncodingException.class);
		toRet.add(FilterOutputStream.class);
		toRet.add(OutputStream.class);
		toRet.add(PrintStream.class);
		toRet.add(Serializable.class);
		*/
		return toRet;
	}
	
	public static List<Class<?>> getSQL() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		
		/*
		toRet.add(Date.class);
		toRet.add(Time.class);
		toRet.add(Timestamp.class);
		*/
		return toRet;
	}
	
	public static List<Class<?>> getUtil() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		
		/*
		toRet.add(ConcurrentModificationException.class);
		toRet.add(EmptyStackException.class);
		toRet.add(MissingResourceException.class);
		toRet.add(NoSuchElementException.class);
		toRet.add(TooManyListenersException.class);
		toRet.add(java.util.Date.class);
		
		toRet.add(AbstractCollection.class);
		toRet.add(AbstractList.class);
		toRet.add(AbstractMap.class);
		toRet.add(AbstractQueue.class);
		
		toRet.add(AbstractSequentialList.class);
		toRet.add(AbstractSet.class);
		toRet.add(ArrayList.class);
		
		toRet.add(Arrays.class);
		toRet.add(Collections.class);
		toRet.add(Collection.class);
		toRet.add(Comparator.class);
		toRet.add(EnumMap.class);
		toRet.add(EnumSet.class);
		
		toRet.add(Enumeration.class);
		toRet.add(EventListener.class);
		toRet.add(EventObject.class);
		toRet.add(HashMap.class);
		
		toRet.add(HashSet.class);
		toRet.add(IdentityHashMap.class);
		toRet.add(Iterator.class);
		toRet.add(LinkedHashMap.class);

		toRet.add(LinkedHashSet.class);
		toRet.add(LinkedList.class);
		toRet.add(List.class);
		toRet.add(ListIterator.class);
		
		toRet.add(Map.class);
		toRet.add(Map.Entry.class);
		toRet.add(Objects.class);
		
		toRet.add(PriorityQueue.class);
		toRet.add(Queue.class);
		toRet.add(Random.class);
		
		toRet.add(RandomAccess.class);
		toRet.add(Set.class);
		toRet.add(SortedMap.class);
		*/

		/*
		toRet.add(SortedSet.class);
		toRet.add(Stack.class);
		toRet.add(TreeMap.class);
		toRet.add(TreeSet.class);
		
		toRet.add(Vector.class);
		 */
		return toRet;
	}
	
	public static List<Class<?>> getLog() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		
		/*
		toRet.add(Formatter.class);
		toRet.add(Handler.class);
		toRet.add(Level.class);
		
		toRet.add(LogManager.class);
		toRet.add(LogRecord.class);
		toRet.add(Logger.class);
		*/
		return toRet;
	}
}
