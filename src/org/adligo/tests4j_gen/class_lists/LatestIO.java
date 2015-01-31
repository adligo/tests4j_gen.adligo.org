package org.adligo.tests4j_gen.class_lists;

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
import java.io.UnsupportedEncodingException;
import java.io.WriteAbortedException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatestIO extends BaseClassNameList {
  public static final List<Class<?>> CLASSES = getClasses();
  
  public static void addNames(List<String> names) {
    addNames(names, CLASSES);
  }
  
  public static final List<Class<?>> getClasses() {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    
    toRet.add(Closeable.class);
    
    toRet.add(DataOutput.class);
    toRet.add(DataInput.class);
    
    toRet.add(Externalizable.class);
    
    toRet.add(FileFilter.class);
    toRet.add(FilenameFilter.class);
    toRet.add(Flushable.class);
    
    toRet.add(ObjectInput.class);
    toRet.add(ObjectInputValidation.class);
    toRet.add(ObjectOutput.class);
    toRet.add(ObjectStreamConstants.class);
    
    toRet.add(Serializable.class);
    
    
    //classes
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
    
    //exceptions
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
    
    toRet.add(UnsupportedEncodingException.class);
    toRet.add(UTFDataFormatException.class);
    
    toRet.add(WriteAbortedException.class);
    
    //error
    toRet.add(IOError.class);
    return Collections.unmodifiableList(toRet);
  }
}
