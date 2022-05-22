package javaprograms.javaprogram;

import javaprograms.javaprogram.javatemplates.*;
import javaprograms.javaprogram.methods.Power;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.stream.Stream;
import java.io.*;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.logging.*;

/**
 * The JavaProgram template implements an application that serializes and
 * deserializes one int and one string dummy data, Throws user defined
 * exception.
 *
 * @author Jay Rathod
 * @version 1.0
 * @since 2022-05-13
 * @see main }
 * 
 */

/* ****************Main class************** */

@SuppressWarnings("unused")
public class App extends Thread {
	public static final Logger log = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
	public static final long serialVersionUID = 746589L;
	public static final javaprograms.javaprogram.javatemplates.ExecutorService executorService=new javaprograms.javaprogram.javatemplates.ExecutorService();

	/**
	 * @param args
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		/*
		 * To create a task:
		 Pass any method or parameter here with return type, if there is no return type then return null in the place of result below.
		 * 		
		 Callable<? extends Object> task = () -> { return "Thread ID: " + Thread.currentThread().getId()+", Thread Name: " + Thread.currentThread().getName()+" result";};
		 
		*/
		
		/*
 			* If you want to print value using 'Future' get method.
 			* 
 			log.log(Level.INFO, "result 1" + executorService.getExecutorService(task));//future result.get keep it on if you want logs from 'Future' get method
 		*/

		/*
		 * To print the result after completion of the task by ExecutorService:
		System.out.println(executorService.beforeExecutorShutDownCheckIfTaskIsDone(Executors.newFixedThreadPool(Integer.MAX_VALUE).submit(task1),
				Executors.newFixedThreadPool(Integer.MAX_VALUE)));
		 s*/

	}
}
