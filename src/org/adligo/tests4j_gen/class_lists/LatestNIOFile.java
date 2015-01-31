package org.adligo.tests4j_gen.class_lists;

import java.nio.file.AccessDeniedException;
import java.nio.file.AccessMode;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.ClosedDirectoryStreamException;
import java.nio.file.ClosedFileSystemException;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.LinkPermission;
import java.nio.file.NoSuchFileException;
import java.nio.file.NotDirectoryException;
import java.nio.file.NotLinkException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.ProviderMismatchException;
import java.nio.file.ProviderNotFoundException;
import java.nio.file.ReadOnlyFileSystemException;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LatestNIOFile extends BaseClassNameList {
  public static final List<Class<?>> CLASSES = getClasses();
  
  public static void addNames(List<String> names) {
    addNames(names, CLASSES);
  }
  
  public static final List<Class<?>> getClasses() {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    
    toRet.add(CopyOption.class);
    toRet.add(DirectoryStream.class);
    toRet.add(DirectoryStream.Filter.class);
    toRet.add(FileVisitor.class);
    toRet.add(OpenOption.class);
    toRet.add(Path.class);
    toRet.add(PathMatcher.class);
    toRet.add(SecureDirectoryStream.class);
    toRet.add(Watchable.class);
    toRet.add(WatchEvent.class);
    toRet.add(WatchEvent.Kind.class);
    toRet.add(WatchEvent.Modifier.class);
    toRet.add(WatchKey.class);
    toRet.add(WatchService.class);
    
    toRet.add(Files.class);
    toRet.add(FileStore.class);
    toRet.add(FileSystem.class);
    toRet.add(FileSystems.class);
    toRet.add(LinkPermission.class);
    toRet.add(Paths.class);
    toRet.add(SimpleFileVisitor.class);
    toRet.add(StandardWatchEventKinds.class);
    
    toRet.add(AccessMode.class);
    toRet.add(FileVisitOption.class);
    toRet.add(FileVisitResult.class);
    toRet.add(LinkOption.class);
    toRet.add(StandardCopyOption.class);
    toRet.add(StandardOpenOption.class);
    
    toRet.add(AccessDeniedException.class);
    toRet.add(AtomicMoveNotSupportedException .class);
    toRet.add(ClosedDirectoryStreamException.class);
    toRet.add(ClosedFileSystemException.class);
    toRet.add(ClosedWatchServiceException.class);
    toRet.add(DirectoryIteratorException.class);
    toRet.add(DirectoryNotEmptyException.class);
    toRet.add(FileAlreadyExistsException.class);
    toRet.add(FileSystemAlreadyExistsException.class);
    toRet.add(FileSystemException.class);
    toRet.add(FileSystemLoopException.class);
    toRet.add(FileSystemNotFoundException.class);
    toRet.add(InvalidPathException.class);
    toRet.add(NoSuchFileException.class);
    toRet.add(NotDirectoryException.class);
    toRet.add(NotLinkException.class);
    toRet.add(ProviderMismatchException.class);
    toRet.add(ProviderNotFoundException.class);
    toRet.add(ReadOnlyFileSystemException.class);
    
    return Collections.unmodifiableList(toRet);
  }
}
