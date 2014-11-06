package org.adligo.tests4j_gen.class_lists;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.sql.Date;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Currency;
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
import java.util.LinkedList;
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
import java.util.UnknownFormatConversionException;
import java.util.UnknownFormatFlagsException;
import java.util.Vector;
import java.util.WeakHashMap;

public class LatestUtil extends BaseClassNameList {
  public static final List<Class<?>> CLASSES = getClasses();
  
  public static void addNames(List<String> names) {
    addNames(names, CLASSES);
  }
  
  public static final List<Class<?>> getClasses() {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    
    toRet.add( Collection.class);
    toRet.add( Comparator.class);
    
    toRet.add( Deque.class);
    
    toRet.add( Enumeration.class);
    toRet.add( EventListener.class);
    
    toRet.add( Formattable.class);
    
    toRet.add( Iterator.class);
    
    toRet.add( List.class);
    toRet.add( ListIterator.class);
    
    toRet.add( Map.class);
    toRet.add( Map.Entry.class);
    
    toRet.add( NavigableMap.class);
    toRet.add( NavigableSet.class);
    
    toRet.add( Observer.class);
    
    toRet.add( Queue.class);
    
    toRet.add( RandomAccess.class);
    
    toRet.add( Set.class);
    toRet.add( SortedMap.class);
    toRet.add( SortedSet.class);
    
    //classes
    toRet.add( AbstractCollection.class);
    toRet.add( AbstractList.class);
    toRet.add( AbstractMap.class);
    toRet.add( AbstractMap.SimpleEntry.class);
    toRet.add( AbstractMap.SimpleImmutableEntry.class);
    toRet.add( AbstractQueue.class);
    toRet.add( AbstractSequentialList.class);
    toRet.add( AbstractSet.class);
    toRet.add( ArrayQueue.class);
    toRet.add( ArrayList.class);
    toRet.add( Arrays.class);
    
    toRet.add( BitSet.class);
    
    toRet.add( Calendar.class);
    toRet.add( Collections.class);
    toRet.add( Currency.class);
    
    toRet.add( Date.class);
    toRet.add( Dictionary.class);
    
    toRet.add( EnumMap.class);
    toRet.add( EnumSet.class);
    toRet.add( EventListenerProxy.class);
    toRet.add( EventObject.class);
    
    toRet.add( FormattableFlags.class);
    toRet.add( Formatter.class);
    
    toRet.add( GregorianCalendar.class);
    
    toRet.add( HashMap.class);
    toRet.add( HashSet.class);
    toRet.add( Hashtable.class);
    
    toRet.add( IdentityHashMap.class);
    
    toRet.add( LinkedHashMap.class);
    toRet.add( LinkedHashSet.class);
    toRet.add( LinkedList.class);
    toRet.add( ListResourceBundle.class);
    toRet.add( Locale.class);
    toRet.add( Locale.Builder.class);
    
    toRet.add( Objects.class);
    toRet.add( Observable.class);
    
    toRet.add( PriorityQueue.class);
    toRet.add( Properties.class);
    toRet.add( PropertyPermission.class);
    toRet.add( PropertyResourceBundle.class);
    
    toRet.add( Random.class);
    toRet.add( ResourceBundle.class);
    toRet.add( ResourceBundle.Control.class);
    
    toRet.add( Scanner.class);
    toRet.add( ServiceLoader.class);
    toRet.add( SimpleTimeZone.class);
    toRet.add( Stack.class);
    toRet.add( StringTokenizer.class);
    
    toRet.add( Timer.class);
    toRet.add( TimerTask.class);
    toRet.add( TimeZone.class);
    toRet.add( TreeMap.class);
    toRet.add( TreeSet.class);
    
    toRet.add( UUID.class);
    
    toRet.add( Vector.class);
    
    toRet.add( WeakHashMap.class);
    
    //enums
    toRet.add( Formatter.BigDecimalLayoutForm.class);
    toRet.add( Locale.Category.class);
    
    //exceptions
    toRet.add( ConcurrentModificationException.class);
    
    toRet.add( DuplicateFormatFlagsException.class);
    
    toRet.add( EmptyStackException.class);
    
    toRet.add( FormatFlagsConversionMismatchException.class);
    toRet.add( FormatterClosedException.class);
    
    toRet.add( IllegalFormatCodePointException.class);
    toRet.add( IllegalFormatConversionException.class);
    toRet.add( IllegalFormatException.class);
    toRet.add( IllegalFormatFlagsException.class);
    toRet.add( IllegalFormatPrecisionException.class);
    toRet.add( IllegalFormatWidthException.class);
    toRet.add( IllformedLocaleException.class);
    toRet.add( InputMismatchException.class);
    toRet.add( InvalidPropertiesFormatException.class);
    
    toRet.add( MissingFormatArgumentException.class);
    toRet.add( MissingFormatWidthException.class);
    toRet.add( MissingResourceException.class);
    
    toRet.add( NoSuchElementException.class);
    
    toRet.add( TooManyListenersException.class);
    
    toRet.add( UnknownFormatConversionException.class);
    toRet.add( UnknownFormatFlagsException.class);
    //errors
    toRet.add( ServiceConfigurationError.class);
    return Collections.unmodifiableList(toRet);
  }
}
