package org.adligo.tests4j_gen;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.CharConversionException;
import java.io.Closeable;
import java.io.Console;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.Externalizable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.FilterReader;
import java.io.FilterWriter;
import java.io.Flushable;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.LineNumberInputStream;
import java.io.LineNumberReader;
import java.io.NotActiveException;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.ObjectStreamConstants;
import java.io.ObjectStreamException;
import java.io.ObjectStreamField;
import java.io.OptionalDataException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.SequenceInputStream;
import java.io.Serializable;
import java.io.SerializablePermission;
import java.io.StreamCorruptedException;
import java.io.StreamTokenizer;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.SyncFailedException;
import java.io.UTFDataFormatException;
import java.io.UncheckedIOException;
import java.io.UnsupportedEncodingException;
import java.io.WriteAbortedException;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.annotation.Inherited;
import java.lang.annotation.Native;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.sql.Array;
import java.sql.BatchUpdateException;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.ClientInfoStatus;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DataTruncation;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.JDBCType;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.RowIdLifetime;
import java.sql.SQLClientInfoException;
import java.sql.SQLData;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLInput;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLNonTransientException;
import java.sql.SQLOutput;
import java.sql.SQLPermission;
import java.sql.SQLRecoverableException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransactionRollbackException;
import java.sql.SQLTransientConnectionException;
import java.sql.SQLTransientException;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Types;
import java.sql.Wrapper;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.Deque;
import java.util.Dictionary;
import java.util.DuplicateFormatFlagsException;
import java.util.EmptyStackException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.EventListenerProxy;
import java.util.EventObject;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Formattable;
import java.util.FormattableFlags;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.IllegalFormatCodePointException;
import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatException;
import java.util.IllegalFormatFlagsException;
import java.util.IllegalFormatPrecisionException;
import java.util.IllegalFormatWidthException;
import java.util.IllformedLocaleException;
import java.util.InputMismatchException;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.MissingFormatWidthException;
import java.util.MissingResourceException;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.PropertyPermission;
import java.util.PropertyResourceBundle;
import java.util.Queue;
import java.util.Random;
import java.util.RandomAccess;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TooManyListenersException;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.UnknownFormatFlagsException;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.logging.ConsoleHandler;
import java.util.logging.ErrorManager;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.LoggingMXBean;
import java.util.logging.LoggingPermission;
import java.util.logging.MemoryHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.SocketHandler;
import java.util.logging.StreamHandler;
import java.util.logging.XMLFormatter;

public class PackageClassNameWriter {

	public static void main(String [] args) {
		List<Class<?>> utils = getIOClasses();
		for (Class<?> u: utils) {
			/*
			System.out.println(
					"toRet.put(\"" + u.getName() + "\",\"" + 
			toConstantJavaText(u) + "\");");
			
			
			System.out.println(
					"assertEquals(\"" + toConstantJavaText(u)  + "\","
							+ "JSE_Util.INSTANCE.getConstantName(\"" +u.getName()
							+ "\"));");
							*/
			System.out.println(
					"assertTrue(JSE_1_6_Util.INSTANCE.isInGroup(\"" + u.getName()
							+ "\"));");
		}
		
	
	}
	
	public static String toConstantJavaText(Class<?> c) {
		String orig = c.getSimpleName();
		
		StringBuilder sb = new StringBuilder();
		char [] chars = orig.toCharArray();
		boolean lastUpper = true;
		for (int i = 0; i < chars.length; i++) {
			char ch = chars[i];
			if (Character.isUpperCase(ch)) {
				if (!lastUpper) {
					sb.append("_");
				}
				sb.append(ch);
				lastUpper = true;
			} else {
				lastUpper = false;
				sb.append(Character.toUpperCase(ch));
			}
		}
		return sb.toString();
	}
	
	public static List<Class<?>> getUtilClasses() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		
		toRet.add(Collection.class);
		toRet.add(Comparator.class);
		toRet.add(Deque.class);
		toRet.add(Enumeration.class);
		toRet.add(EventListener.class);
		toRet.add(Formattable.class);
		toRet.add(Iterator.class);
		toRet.add(List.class);
		toRet.add(ListIterator.class);
		toRet.add(Map.class);
		
		toRet.add(Map.Entry.class);
		toRet.add(NavigableMap.class);
		toRet.add(NavigableSet.class);
		toRet.add(Observer.class);
		toRet.add(Queue.class);
		toRet.add(RandomAccess.class);
		toRet.add(Set.class);
		toRet.add(SortedMap.class);
		toRet.add(SortedSet.class);
		
		toRet.add(AbstractCollection.class);
		toRet.add(AbstractList.class);
		toRet.add(AbstractMap.class);
		toRet.add(AbstractMap.SimpleEntry.class);
		toRet.add(AbstractMap.SimpleImmutableEntry.class);
		toRet.add(AbstractQueue.class);
		toRet.add(AbstractSequentialList.class);
		toRet.add(AbstractSet.class);
		toRet.add(ArrayDeque.class);
		toRet.add(ArrayList.class);
		toRet.add(Arrays.class);
		toRet.add(BitSet.class);
		
		toRet.add(Calendar.class);
		toRet.add(Collections.class);
		toRet.add(Currency.class);
		toRet.add(Date.class);
		toRet.add(Dictionary.class);
		toRet.add(EnumMap.class);
		toRet.add(EnumSet.class);
		toRet.add(EventListenerProxy.class);
		toRet.add(EventObject.class);
		toRet.add(FormattableFlags.class);
		toRet.add(Formatter.class);
		
		toRet.add(GregorianCalendar.class);
		toRet.add(HashMap.class);
		toRet.add(HashSet.class);
		toRet.add(Hashtable.class);
		toRet.add(IdentityHashMap.class);
		toRet.add(LinkedHashMap.class);
		toRet.add(LinkedHashSet.class);
		toRet.add(ListResourceBundle.class);
		toRet.add(Locale.class);
		toRet.add(Locale.Builder.class);
		
		toRet.add(Objects.class);
		toRet.add(Observable.class);
		toRet.add(PriorityQueue.class);
		toRet.add(Properties.class);
		toRet.add(PropertyPermission.class);
		toRet.add(PropertyResourceBundle.class);
		toRet.add(Random.class);
		toRet.add(ResourceBundle.class);
		toRet.add(ResourceBundle.Control.class);
		toRet.add(Scanner.class);
		
		toRet.add(ServiceLoader.class);
		toRet.add(SimpleTimeZone.class);
		toRet.add(Stack.class);
		toRet.add(StringTokenizer.class);
		toRet.add(Timer.class);
		toRet.add(TimerTask.class);
		toRet.add(TimeZone.class);
		toRet.add(TreeMap.class);
		toRet.add(TreeSet.class);
		toRet.add(UUID.class);
		toRet.add(Vector.class);
		toRet.add(WeakHashMap.class);
		
		toRet.add(Formatter.BigDecimalLayoutForm.class);
		toRet.add(Locale.Category.class);
		
		toRet.add(ConcurrentModificationException.class);
		toRet.add(DuplicateFormatFlagsException.class);
		toRet.add(EmptyStackException.class);
		toRet.add(FormatFlagsConversionMismatchException.class);
		toRet.add(FormatterClosedException.class);
		toRet.add(IllegalFormatCodePointException.class);
		toRet.add(IllegalFormatConversionException.class);
		toRet.add(IllegalFormatException.class);
		toRet.add(IllegalFormatFlagsException.class);
		toRet.add(IllegalFormatPrecisionException.class);
		
		toRet.add(IllegalFormatWidthException.class);
		toRet.add(IllformedLocaleException.class);
		toRet.add(InputMismatchException.class);
		toRet.add(InvalidPropertiesFormatException.class);
		toRet.add(MissingFormatArgumentException.class);
		toRet.add(MissingFormatWidthException.class);
		toRet.add(MissingResourceException.class);
		toRet.add(NoSuchElementException.class);
		toRet.add(TooManyListenersException.class);
		toRet.add(UnknownFormatFlagsException.class);
		
		toRet.add(ServiceConfigurationError.class);
		return toRet;
	}
	
	public static List<Class<?>> getLangClasses() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		
		/* keep commented out and 
		 * remove import so older versions of java can use the project
		 */
		toRet.add(Appendable.class);
		toRet.add(AutoCloseable.class);
		toRet.add(CharSequence.class);
		toRet.add(Cloneable.class);
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
		toRet.add(StringBuilder.class);
		toRet.add(StringBuffer.class);
		
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
		toRet.add(CloneNotSupportedException.class);
		toRet.add(EnumConstantNotPresentException.class);
		toRet.add(Exception.class);
		toRet.add(IllegalAccessException.class);
		toRet.add(IllegalArgumentException.class);
		toRet.add(IllegalMonitorStateException.class);
		toRet.add(IllegalStateException.class);
		toRet.add(IllegalThreadStateException.class);
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
		toRet.add(OutOfMemoryError.class);
		toRet.add(StackOverflowError.class);
		toRet.add(ThreadDeath.class);
		
		toRet.add(UnknownError.class);
		toRet.add(UnsatisfiedLinkError.class);
		toRet.add(UnsupportedClassVersionError.class);
		toRet.add(VerifyError.class);
		toRet.add(VirtualMachineError.class);
		
		toRet.add(Deprecated.class);
		toRet.add(Override.class);
		toRet.add(SafeVarargs.class);
		toRet.add(SuppressWarnings.class);
		
		return toRet;
	}
	
	public static List<Class<?>> getIOClasses() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		//copied and pasted from the javadoc
		toRet.add(Closeable.class);
		toRet.add(DataInput.class);
		toRet.add(DataOutput.class);
		toRet.add(Externalizable.class);
		toRet.add(FileFilter.class);
		toRet.add(FilenameFilter.class);
		toRet.add(Flushable.class);
		toRet.add(ObjectInput.class);
		toRet.add(ObjectInputValidation.class);
		toRet.add(ObjectOutput.class);
		toRet.add(ObjectStreamConstants.class);
		toRet.add(Serializable.class);

		toRet.add(BufferedInputStream.class);
		toRet.add(BufferedOutputStream.class);
		toRet.add(BufferedReader.class);
		toRet.add(BufferedWriter.class);
		toRet.add(ByteArrayInputStream.class);
		toRet.add(ByteArrayOutputStream.class);
		toRet.add(CharArrayReader.class);
		toRet.add(CharArrayWriter.class);
		toRet.add(Console.class);
		toRet.add(DataInputStream.class);
		toRet.add(DataOutputStream.class);
		toRet.add(File.class);
		toRet.add(FileDescriptor.class);
		toRet.add(FileInputStream.class);
		toRet.add(FileOutputStream.class);
		toRet.add(FilePermission.class);
		toRet.add(FileReader.class);
		toRet.add(FileWriter.class);
		toRet.add(FilterInputStream.class);
		toRet.add(FilterOutputStream.class);
		toRet.add(FilterReader.class);
		toRet.add(FilterWriter.class);
		toRet.add(InputStream.class);
		toRet.add(InputStreamReader.class);
		toRet.add(LineNumberInputStream.class);
		toRet.add(LineNumberReader.class);
		toRet.add(ObjectInputStream.class);
		toRet.add(ObjectInputStream.GetField.class);
		toRet.add(ObjectOutputStream.class);
		toRet.add(ObjectOutputStream.PutField.class);
		toRet.add(ObjectStreamClass.class);
		toRet.add(ObjectStreamField.class);
		toRet.add(OutputStream.class);
		toRet.add(OutputStreamWriter.class);
		toRet.add(PipedInputStream.class);
		toRet.add(PipedOutputStream.class);
		toRet.add(PipedReader.class);
		toRet.add(PipedWriter.class);
		toRet.add(PrintStream.class);
		toRet.add(PrintWriter.class);
		toRet.add(PushbackInputStream.class);
		toRet.add(PushbackReader.class);
		toRet.add(RandomAccessFile.class);
		toRet.add(Reader.class);
		toRet.add(SequenceInputStream.class);
		toRet.add(SerializablePermission.class);
		toRet.add(StreamTokenizer.class);
		toRet.add(StringBufferInputStream.class);
		toRet.add(StringReader.class);
		toRet.add(StringWriter.class);
		toRet.add(Writer.class);

		toRet.add(CharConversionException.class);
		toRet.add(EOFException.class);
		toRet.add(FileNotFoundException.class);
		toRet.add(InterruptedIOException.class);
		toRet.add(InvalidClassException.class);
		toRet.add(InvalidObjectException.class);
		toRet.add(IOException.class);
		toRet.add(NotActiveException.class);
		toRet.add(NotSerializableException.class);
		toRet.add(ObjectStreamException.class);
		toRet.add(OptionalDataException.class);
		toRet.add(StreamCorruptedException.class);
		toRet.add(SyncFailedException.class);
		toRet.add(UncheckedIOException.class);
		toRet.add(UnsupportedEncodingException.class);
		toRet.add(UTFDataFormatException.class);
		toRet.add(WriteAbortedException.class);

		toRet.add(IOError.class);
		return toRet;
	}
	
	public static List<Class<?>> getLangAnnotClasses() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		//generated by copy and paste from the javadoc
		toRet.add(Annotation.class);

		toRet.add(ElementType.class);
		toRet.add(RetentionPolicy.class);

		toRet.add(AnnotationTypeMismatchException.class);
		toRet.add(IncompleteAnnotationException.class);
		
		toRet.add(AnnotationFormatError.class);
		
		toRet.add(Documented.class);
		toRet.add(Inherited.class);
		toRet.add(Native.class);
		toRet.add(Repeatable.class);
		toRet.add(Retention.class);
		toRet.add(Target.class);
		return toRet;
	}
	
	public static List<Class<?>> getLogClasses() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		
		toRet.add(Filter.class);
		toRet.add(LoggingMXBean.class);
		
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
		//toRet.add();
		return toRet;
	}
	
	public static List<Class<?>> getMathClasses() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		toRet.add(BigDecimal.class);
		toRet.add(BigInteger.class);
		toRet.add(RoundingMode.class);
		toRet.add(MathContext.class);
		//toRet.add();
		return toRet;
	}
	
	public static List<Class<?>> getSqlClasses() {
		List<Class<?>> toRet = new ArrayList<Class<?>>();
		
		toRet.add(Array.class);
		toRet.add(Blob.class);
		toRet.add(CallableStatement.class);
		toRet.add(Clob.class);
		toRet.add(Connection.class);
		toRet.add(DatabaseMetaData.class);
		toRet.add(Driver.class);
		toRet.add(DriverAction.class);
		toRet.add(NClob.class);
		toRet.add(ParameterMetaData.class);
		toRet.add(PreparedStatement.class);
		toRet.add(Ref.class);
		toRet.add(ResultSet.class);
		toRet.add(ResultSetMetaData.class);
		toRet.add(RowId.class);
		toRet.add(Savepoint.class);
		toRet.add(SQLData.class);
		toRet.add(SQLInput.class);
		toRet.add(SQLOutput.class);
		toRet.add(SQLType.class);
		toRet.add(SQLXML.class);
		toRet.add(Statement.class);
		toRet.add(Struct.class);
		toRet.add(Wrapper.class);
		
		toRet.add(Date.class);
		toRet.add(DriverManager.class);
		toRet.add(DriverPropertyInfo.class);
		toRet.add(SQLPermission.class);
		toRet.add(Time.class);
		toRet.add(Timestamp.class);
		toRet.add(Types.class);
		
		toRet.add(ClientInfoStatus.class);
		toRet.add(JDBCType.class);
		toRet.add(PseudoColumnUsage.class);
		toRet.add(RowIdLifetime.class);
		
		toRet.add(BatchUpdateException.class);
		toRet.add(DataTruncation.class);
		toRet.add(SQLClientInfoException.class);
		toRet.add(SQLDataException.class);
		toRet.add(SQLException.class);
		toRet.add(SQLFeatureNotSupportedException.class);
		toRet.add(SQLIntegrityConstraintViolationException.class);
		toRet.add(SQLInvalidAuthorizationSpecException.class);
		toRet.add(SQLNonTransientConnectionException.class);
		toRet.add(SQLNonTransientException.class);
		toRet.add(SQLRecoverableException.class);
		toRet.add(SQLSyntaxErrorException.class);
		toRet.add(SQLTimeoutException.class);
		toRet.add(SQLTransactionRollbackException.class);
		toRet.add(SQLTransientConnectionException.class);
		toRet.add(SQLTransientException.class);
		toRet.add(SQLWarning.class);
		return toRet;
	}
}
