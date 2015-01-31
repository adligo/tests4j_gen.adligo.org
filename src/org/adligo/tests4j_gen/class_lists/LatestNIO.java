package org.adligo.tests4j_gen.class_lists;

import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.InvalidMarkException;
import java.nio.LongBuffer;
import java.nio.MappedByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatestNIO extends BaseClassNameList {
  public static final List<Class<?>> CLASSES = getClasses();
  
  public static void addNames(List<String> names) {
    addNames(names, CLASSES);
  }
  
  public static final List<Class<?>> getClasses() {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    
    toRet.add(Buffer.class);
    
    toRet.add(ByteBuffer.class);
    toRet.add(ByteOrder.class);
    
    toRet.add(CharBuffer.class);
    
    toRet.add(DoubleBuffer.class);
    toRet.add(FloatBuffer.class);
    toRet.add(IntBuffer.class);
    toRet.add(LongBuffer.class);
    toRet.add(MappedByteBuffer.class);
    toRet.add(ShortBuffer.class);
    
    toRet.add(BufferOverflowException.class);
    toRet.add(BufferUnderflowException.class);
    toRet.add(InvalidMarkException.class);
    toRet.add(ReadOnlyBufferException.class);
    return Collections.unmodifiableList(toRet);
  }
}
