package javaprograms.javaprogram.javatemplates;

import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


import javaprograms.javaprogram.App;


@SuppressWarnings("unused")
interface StartExecutorService{
	
}

interface BeforeExecutorShutDown {
	Object beforeExecutorShutDownCheckIfTaskIsDone(Future<? extends Object> task, java.util.concurrent.ExecutorService executorService)
			throws InterruptedException, ExecutionException;
}

class BeforeExecutorShutDownServiceNotWorking extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BeforeExecutorShutDownServiceNotWorking(String string) {
		super(string);
	}
}

/**************** Main class ********************/
public class ExecutorService extends Exception implements BeforeExecutorShutDown {
	public static final javaprograms.javaprogram.javatemplates.ExecutorService executorService=new javaprograms.javaprogram.javatemplates.ExecutorService();


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Object getExecutorService(Callable<? extends Object> task) throws InterruptedException, ExecutionException {

		try {
			
			LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, " " + executorService.getExecutorService(task));//future result.get keep it on if you want logs from 'Future' get method

			return Executors.newScheduledThreadPool(Integer.MAX_VALUE).submit(task).get();
		} catch (InterruptedException | ExecutionException interruptedExceptionOrExecutionException) {
			interruptedExceptionOrExecutionException.printStackTrace();
		}
		return Executors.newScheduledThreadPool(Integer.MAX_VALUE).submit(task).get();
	}
	
	
	
	
	@Override
	public Object beforeExecutorShutDownCheckIfTaskIsDone(Future<? extends Object> task, java.util.concurrent.ExecutorService executorService) throws InterruptedException, ExecutionException {

		while (task.isDone() == false) {
			try {
				for (@SuppressWarnings("unused") Method method : ExecutorService.class.getMethods())
					//LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO,	"Method in ExecutorService class:" + method.getName());
				return task.get();
			} catch (InterruptedException | ExecutionException interruptedExceptionOrExecutionException) {
				interruptedExceptionOrExecutionException.printStackTrace();
			}
		}
		executorService.shutdownNow();
		return task.get();

	}
	
	

	

}
