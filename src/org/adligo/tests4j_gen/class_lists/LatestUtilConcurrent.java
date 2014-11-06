package org.adligo.tests4j_gen.class_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.Phaser;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TransferQueue;

public class LatestUtilConcurrent extends BaseClassNameList {
  public static final List<Class<?>> CLASSES = getClasses();
  
  public static void addNames(List<String> names) {
    addNames(names, CLASSES);
  }
  
  public static final List<Class<?>> getClasses() {
    List<Class<?>> toRet = new ArrayList<Class<?>>();
    
    toRet.add(BlockingDeque.class);
    toRet.add(BlockingQueue.class);
    toRet.add(Callable.class);
    toRet.add(CompletionService.class);
    toRet.add(ConcurrentMap.class);
    toRet.add(ConcurrentNavigableMap.class);
    toRet.add(Delayed.class);
    toRet.add(Executor.class);
    toRet.add(ExecutorService.class);
    toRet.add(Future.class);
    toRet.add(RejectedExecutionHandler.class);
    toRet.add(RunnableFuture.class);
    toRet.add(RunnableScheduledFuture.class);
    toRet.add(ScheduledExecutorService.class);
    
    toRet.add(ScheduledFuture.class);
    toRet.add(ThreadFactory.class);
    
    toRet.add(AbstractExecutorService.class);
    toRet.add(ArrayBlockingQueue.class);
    toRet.add(ConcurrentHashMap.class);
    toRet.add(ConcurrentLinkedQueue.class);
    toRet.add(ConcurrentSkipListMap.class);
    toRet.add(ConcurrentSkipListSet.class);
    toRet.add(CopyOnWriteArrayList.class);
    toRet.add(CopyOnWriteArraySet.class);
    toRet.add(CountDownLatch.class);
    
    toRet.add(CyclicBarrier.class);
    toRet.add(DelayQueue.class);
    toRet.add(Exchanger.class);
    toRet.add(ExecutorCompletionService.class);
    toRet.add(Executors.class);
    toRet.add(FutureTask.class);
    toRet.add(LinkedBlockingDeque.class);
    toRet.add(LinkedBlockingQueue.class);
    toRet.add(PriorityBlockingQueue.class);
    toRet.add(ScheduledThreadPoolExecutor.class);
    toRet.add(Semaphore.class);
    
    toRet.add(SynchronousQueue.class);
    toRet.add(ThreadPoolExecutor.class);
    toRet.add(ThreadPoolExecutor.class);
    toRet.add(ThreadPoolExecutor.AbortPolicy.class);
    toRet.add(ThreadPoolExecutor.CallerRunsPolicy.class);
    toRet.add(ThreadPoolExecutor.DiscardOldestPolicy.class);
    toRet.add(ThreadPoolExecutor.DiscardPolicy.class);
    toRet.add(TimeUnit.class);
    toRet.add(BrokenBarrierException.class);
    toRet.add(CancellationException.class);
    toRet.add(ExecutionException.class);
    
    toRet.add(RejectedExecutionException.class);
    toRet.add(TimeoutException.class);
    
    //1.7
    toRet.add(ForkJoinPool.ForkJoinWorkerThreadFactory.class);
    toRet.add(ForkJoinPool.ManagedBlocker.class);
    
    toRet.add(TransferQueue.class);
    
    toRet.add(ConcurrentLinkedDeque.class);
    toRet.add(ForkJoinPool.class);
    toRet.add(ForkJoinTask.class);
    
    toRet.add(ForkJoinWorkerThread.class);
    toRet.add(LinkedTransferQueue.class);
    toRet.add(Phaser.class);
    
    toRet.add(RecursiveAction.class);
    toRet.add(RecursiveTask.class);
    toRet.add(ThreadLocalRandom.class);
    
    //1.8
    toRet.add(ConcurrentHashMap.KeySetView.class);
    toRet.add(CompletionException.class);
    
    return Collections.unmodifiableList(toRet);
  }
}
